package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.ships.Ship;
import com.mygdx.weapons.projectiles.Bullet;

import java.util.ArrayList;


/**
 * Created by User 1 on 12/16/2015.
 */
public class PlayScreen implements Screen {



    private final float PPM = 100f;

    private final float GAME_WORLD_WIDTH = 1920;
    private final float GAME_WORLD_HEIGHT = 1080;

    private Ship playShip;
    private Sprite shipSprite;

    private OrthographicCamera cam;
    private Viewport viewport;
    private Stage uiControls;
    private TextureAtlas uiAtlas;
    private Skin uiSkin;
    private Table uiTable;

    private Touchpad leftTouchPad;
    private Image shipInfo;

    private World world;
    private Box2DDebugRenderer renderer;
    private Body ship;

    ///////////////////////////////////////////////
    // ***** THIS IS FOR THE PROJECTILES ******* //
    ///////////////////////////////////////////////

    ArrayList<Bullet> bullets;
    private float shootTime;

    private SpriteBatch batch;


    public PlayScreen(Ship playShip){
        this.playShip = playShip;
        shipSprite = playShip.getShipSprite();
    }

    @Override
    public void show() {

        batch = new SpriteBatch();
        world = new World(new Vector2(0,0), true);
        renderer = new Box2DDebugRenderer();

        setUpCameraAndViewport();

        setUpStageAndUI();

        setUpShip();

        setUpWeapon();


        Gdx.input.setInputProcessor(uiControls);

    }



    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(0, 0, 0, 1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        ship.applyForceToCenter(20 * leftTouchPad.getKnobPercentX(), 20 * leftTouchPad.getKnobPercentY(), true);
        shipSprite.setCenter(ship.getPosition().x, ship.getPosition().y);
        shipSprite.setPosition(ship.getPosition().x - shipSprite.getWidth() / 2, ship.getPosition().y - shipSprite.getHeight() / 2);
        shipSprite.setOriginCenter();
        cam.update();

        world.step(1 / 30f, 8, 3);
        renderer.render(world, cam.combined);

        //TODO: NEED TO CHECK TO SEE IF THE BULLET IS STILL ALIVE OR NOT.


        ///////////////////////////////
        //******* FIRE LOOP ******* //
        //////////////////////////////
        shootTime += delta;
        if(shootTime >= 0.10){
            if(bullets.size() < 20) { // CHECK SIZE OF OBJECTS
                bullets.add(new Bullet(ship.getPosition().x, ship.getPosition().y, 1, 1, 0, 10));
                System.out.println(bullets.size());
                shootTime = 0;
            }
        }

        /*
         * Begin Drawing.
         */
        batch.begin();
        shipSprite.draw(batch);

        for(Bullet b : bullets) {
            b.update(delta);
            b.draw(batch);
        }

        for(int i = 0; i < bullets.size(); i++){
            if(bullets.get(i).isAlive() == false){
                bullets.remove(i);
            }
        }


        batch.end();

        uiTable.act(delta);
        uiTable.debug();
        uiControls.draw();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        uiTable.setClip(true);
        cam.position.set(0, 0, 0);
        uiControls.getViewport().update(width, height, false);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public void setUpCameraAndViewport(){
        float aspectRatio = (float)Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();

        //cam = new OrthographicCamera(GAME_WORLD_WIDTH / PPM ,GAME_WORLD_HEIGHT / PPM);
        cam = new OrthographicCamera();
        cam.position.set(0, 0, 0);

        viewport = new ExtendViewport( (GAME_WORLD_WIDTH/PPM ) * aspectRatio, (GAME_WORLD_HEIGHT)/PPM, cam);
        viewport.apply();
    }


    public void setUpShip(){


        BodyDef testDef = new BodyDef();
        testDef.type = BodyDef.BodyType.DynamicBody;
        testDef.linearDamping = 2f;
        testDef.position.set(0, 0);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(1, 1);

        FixtureDef def = new FixtureDef();
        def.shape = shape;

        ship = world.createBody(testDef);
        ship.createFixture(def);


        shipSprite.setSize(playShip.getShipSpriteWidth(), playShip.getShipSpriteHeight());

        shipSprite.setPosition(0, 0);
        shipSprite.setCenter(ship.getPosition().x, ship.getPosition().y);
        shipSprite.rotate90(true);
    }

    public void setUpWeapon(){
        bullets = new ArrayList<Bullet>();
        shootTime = 0;
    }


    public void setUpStageAndUI(){


        uiControls = new Stage(viewport, batch);
        uiAtlas = new TextureAtlas(Gdx.files.internal("ui/playScreen/playUI.pack"));
        uiSkin = new Skin(uiAtlas);
        uiTable = new Table(uiSkin);
        uiTable.setBounds(-(GAME_WORLD_WIDTH / PPM) / 2, -(GAME_WORLD_HEIGHT / PPM) / 2, GAME_WORLD_WIDTH / PPM, GAME_WORLD_HEIGHT / PPM);


        ////////////////////////////////
        // ** UI CONTROLS AND VIEW ** //
        ////////////////////////////////

        //*** CONTROL PAD ***//

        uiSkin.getDrawable("knob").setMinHeight(1);
        uiSkin.getDrawable("knob").setMinWidth(1);

        uiSkin.getDrawable("background").setMinHeight(20);
        uiSkin.getDrawable("background").setMinWidth(20);

        TouchpadStyle positionControlStyle = new TouchpadStyle();
        positionControlStyle.knob = uiSkin.getDrawable("knob");
        positionControlStyle.background = uiSkin.getDrawable("background");

        leftTouchPad = new Touchpad(0.01f, positionControlStyle);

        // *** Health Info *** //

        shipInfo = new Image(uiSkin.getDrawable("health"));
        shipInfo.setSize(shipInfo.getImageWidth() / PPM * 5, shipInfo.getImageHeight() / PPM * 5);


        uiTable.clear();
        uiTable.top().left();
        uiTable.add().width(uiTable.getWidth() / 3);
        uiTable.add().width(uiTable.getWidth() / 3);
        uiTable.add(shipInfo).top().right().size(2*2,1*2).padLeft(2);
        uiTable.row();
        uiTable.add(leftTouchPad).size(4).padTop(4);
        uiTable.add().width(uiTable.getWidth() / 3);

        uiControls.addActor(uiTable);
    }

}
