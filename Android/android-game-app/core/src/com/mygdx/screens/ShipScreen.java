package com.mygdx.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.ships.Ship;
import com.mygdx.ships.ShipManager;

/**
 * Created by User 1 on 12/18/2015.
 */
public class ShipScreen implements Screen {

    private final float GAME_WORLD_WIDTH = 1920;
    private final float GAME_WORLD_HEIGHT = 1080;

    private OrthographicCamera cam;
    private Viewport viewport;

    private Stage mainStage;
    private Table mainTable, cellTableTopRight, statTable;
    private Skin mainSkin;
    private TextureAtlas mainUIAtlas;

    private Image shipImage;
    private List shipList;
    private ScrollPane shipPane;
    private Button menuButton, storeButton, leaderButton;
    private Button playButton;

    private SpriteBatch batch;
    private Sprite background;


    private FreeTypeFontGenerator titleFontGenerator, shipFontGenerator;
    private FreeTypeFontParameter titleFontParam, shipFontParam;
    private BitmapFont titleFont, shipFont;
    private Label shipName, hitPoints, shildPoints, massPoints, controlPoints, speedPoints, special;


    private ShipManager shipManager;
    private Ship focusShip;



    @Override
    public void show() {

        /////////////////////////////////////////////////////////////////////////////////////
        // ******************** SET UP CAMERA AND VIEWPORT ******************************* //
        /////////////////////////////////////////////////////////////////////////////////////
        float aspectRatio = (float) Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();

        cam = new OrthographicCamera();
        viewport = new ExtendViewport(GAME_WORLD_WIDTH * aspectRatio, GAME_WORLD_HEIGHT, cam);
        viewport.apply();
        cam.position.set(GAME_WORLD_WIDTH/2, GAME_WORLD_HEIGHT/2,0);


        //////////////////////////////////////////////////////
        // ************* SET UP BACKGROUND **************** //
        //////////////////////////////////////////////////////
        batch = new SpriteBatch();
        Texture backgroundTexture = new Texture("ui/homeScreen/background.png");
        background = new Sprite(backgroundTexture);
        background.setSize(GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);

        ///////////////////////////////////////////////////////////////////////////
        // ***************** SET UP SHIPS AND SHIP MANAGER ********************* //
        ///////////////////////////////////////////////////////////////////////////

        //shipManager = new ShipManager();

        ///////////////////////////////////////////////////////////
        // ******************* SET UP STAGE ******************** //
        ///////////////////////////////////////////////////////////
        mainStage = new Stage(viewport);

        mainUIAtlas = new TextureAtlas(Gdx.files.internal("ui/homeScreen/HomeScreenUI.pack"));
        mainSkin = new Skin(mainUIAtlas);
        mainTable = new Table(mainSkin);
        cellTableTopRight = new Table(mainSkin);
        mainTable.setBounds(0, 0, GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);
        statTable = new Table(mainSkin);



        /////////////////////
        // * SET UP FONT * //
        /////////////////////

        titleFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Eddie.ttf"));
        titleFontParam = new FreeTypeFontParameter();
        titleFontParam.size = 85;
        titleFontParam.color = Color.GREEN;

        titleFont = titleFontGenerator.generateFont(titleFontParam);
        titleFontGenerator.dispose();

        shipFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/android_insomnia_regular.ttf"));
        shipFontParam = new FreeTypeFontParameter();
        shipFontParam.size = 70;
        shipFontParam.color = Color.BLACK;

        shipFont = shipFontGenerator.generateFont(shipFontParam);
        shipFontGenerator.dispose();

        //TODO: I've added a whole new table. This table will be used for the ship's stats. The stats will be displayed on the right cell from the ship's image.

        ///////////////////////////////////////////////////////////////////
        // ************ CREATE AND START SHIP MANAGER ****************** //
        ///////////////////////////////////////////////////////////////////

        shipManager = new ShipManager();

        ///////////////////
        // * SET UP UI * //
        ///////////////////

        // ** SET UP SHIP NAME IN TITLE BOX ** //
        final LabelStyle shipNameStyle = new LabelStyle();
        shipNameStyle.font = titleFont;
        shipNameStyle.fontColor = Color.BLACK;

        shipName = new Label("AGGRAVATION", shipNameStyle);
        shipName.setAlignment(1);

        //** MENU BUTTON **//
        Button.ButtonStyle menuButtonStyle = new Button.ButtonStyle();
        menuButtonStyle.up = mainSkin.getDrawable("settingsUp");
        menuButtonStyle.down = mainSkin.getDrawable("settingsDown");
        menuButtonStyle.pressedOffsetX = 1;
        menuButtonStyle.pressedOffsetY = -1;

        menuButton = new Button(menuButtonStyle);

        //** STORE BUTTON **//
        Button.ButtonStyle storeButtonStyle = new Button.ButtonStyle();
        storeButtonStyle.up = mainSkin.getDrawable("storeUp");
        storeButtonStyle.down = mainSkin.getDrawable("storeDown");
        storeButtonStyle.pressedOffsetY = -1;
        storeButtonStyle.pressedOffsetX = 1;

        storeButton = new Button(storeButtonStyle);

        //** LEADER BUTTON **//
        Button.ButtonStyle leaderButtonStyle = new Button.ButtonStyle();
        leaderButtonStyle.up = mainSkin.getDrawable("leaderUp");
        leaderButtonStyle.down = mainSkin.getDrawable("leaderDown");
        leaderButtonStyle.pressedOffsetX = 1;
        leaderButtonStyle.pressedOffsetY = -1;

        leaderButton = new Button(leaderButtonStyle);

        // ** DRAW SHIP IN CENTER ** //
        Texture shipTexture = new Texture(Gdx.files.internal("ships/spacestation.png"));
        shipImage = new Image(shipTexture);

        // ** SHIP LIST ON LEFT ** //
        String[] tempStr = shipManager.getShipNames();

        Texture tempTexture = new Texture(Gdx.files.internal("ui/homeScreen/shipFrame.png"));

        ListStyle test = new ListStyle();
        test.fontColorSelected = Color.BLACK;
        test.fontColorUnselected = Color.WHITE;
        test.font = shipFont;
        test.selection = mainSkin.getDrawable("shipFrame");



        shipList = new List(test);
        shipList.setItems(tempStr);
        shipPane = new ScrollPane(shipList);
        shipPane.addListener(new ClickListener() {

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("Touch on " + shipList.getSelectedIndex());
                focusShip = shipManager.getShip(shipList.getSelectedIndex());

                //TODO: THIS LISTENER NEEDS TO BE ABLE TO TRACK WHICH SHIP IS SELECTED, AND IT MUST BE ABLE TO REFRESH THE MAIN TABLE. I MAY HAVE TO REDRAW THE ENTIRE TABLE. :/

                hitPoints.setText("HEALTH: " + focusShip.getHealth());
                shildPoints.setText("SHIELD: " + focusShip.getShield());
                massPoints.setText("MASS: " + focusShip.getMass());
                controlPoints.setText("CONTROL: " + focusShip.getControl());
                speedPoints.setText("SPEED: " + focusShip.getSpeed());

                shipImage.setDrawable(new SpriteDrawable(focusShip.getShipSprite()));

                return true;
            }
        });


        focusShip = shipManager.getShip(0);

        // ** DRAW STAT INDICATOR ** //

        LabelStyle statStyle = new LabelStyle();
        statStyle.font = shipFont;
        statStyle.fontColor = Color.BLACK;

        hitPoints = new Label("HEALTH: " + focusShip.getHealth(), statStyle);
        shildPoints = new Label("SHIELD: "+ focusShip.getShield(), statStyle);
        massPoints = new Label("MASS: " + focusShip.getMass(), statStyle);
        controlPoints = new Label("CONTROL: "+focusShip.getControl(), statStyle);
        speedPoints = new Label("SPEED: " + focusShip.getSpeed(), statStyle);
        special = new Label("SPECIAL: " + focusShip.getSpecial(), statStyle);

        statTable.left();
        statTable.add(hitPoints).size(40);
        statTable.row().padTop(20);
        statTable.add(shildPoints).size(40);
        statTable.row().padTop(20);
        statTable.add(massPoints).size(40);
        statTable.row().padTop(20);
        statTable.add(controlPoints).size(40);
        statTable.row().padTop(20);
        statTable.add(speedPoints).size(40);
        statTable.row().padTop(20);
        //statTable.add(special);

        // ** PLAY BUTTON ** //
        ButtonStyle playButtonStyle = new ButtonStyle();
        playButtonStyle.down = mainSkin.getDrawable("playDown");
        playButtonStyle.up = mainSkin.getDrawable("playUp");
        playButtonStyle.pressedOffsetX = 1;
        playButtonStyle.pressedOffsetY = -1;

        playButton = new Button(playButtonStyle);

        playButton.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {

                ((Game) Gdx.app.getApplicationListener()).setScreen(new PlayScreen(focusShip));

            }
        });




        //////////////////////
        // * Add to table * //
        //////////////////////
        mainTable.top();
        mainTable.padTop(40);
        mainTable.add().width(mainTable.getWidth() / 3);
        mainTable.add(shipName).width(mainTable.getWidth() / 3).right();
        cellTableTopRight.add(storeButton).size(120);
        cellTableTopRight.add(leaderButton).size(120);
        cellTableTopRight.add(menuButton).size(120);
        mainTable.add(cellTableTopRight).width(mainTable.getWidth() / 3).padTop(40);
        mainTable.row().padTop(40);
        mainTable.add(shipPane).width(mainTable.getWidth() / 5).height(500);
        mainTable.add(shipImage).maxHeight(400).maxWidth(400).minWidth(400).minHeight(400);
        mainTable.add(statTable).width(mainTable.getWidth() / 3).left();
        mainTable.row();
        mainTable.add().width(mainTable.getWidth() / 3);
        mainTable.add(playButton).size(200);
        mainTable.add().width(mainTable.getWidth() / 3);

        mainStage.addActor(mainTable);

        Gdx.input.setInputProcessor(mainStage);

    }

    @Override
    public void render(float delta) {

        Gdx.gl20.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        cam.update();

        batch.begin();
        batch.setProjectionMatrix(cam.combined);
        background.draw(batch);
        batch.end();

        shipPane.act(delta);
        mainTable.act(delta);
        mainTable.debug();
        mainStage.draw();


    }

    @Override
    public void resize(int width, int height) {

        viewport.update(width,height);
        cam.position.set(GAME_WORLD_WIDTH / 2, GAME_WORLD_HEIGHT / 2, 0);

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
}
