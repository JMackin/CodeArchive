package com.mygdx.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by User 1 on 12/14/2015.
 */
public class HomeScreen implements Screen {

    //TODO: Add a shutter door animation with the TweenEngine for a smooth screen transition.

    private final float GAME_WORLD_WIDTH = 1920;
    private final float GAME_WORLD_HEIGHT = 1080;

    //***** VIEW FIX *****\\
    private Viewport viewport;
    private OrthographicCamera cam;

    //**** FONT BITMAP ****\\
    private FreeTypeFontGenerator titleFontGenerator;
    private FreeTypeFontParameter titleFontParam;
    private BitmapFont titleFont;
    private TextureAtlas atlas;

    //**** SPRITES ****\\
    private Sprite background;
    private SpriteBatch batch;

    //**** BUTTONS ****\\
    private Button playButton, exitButton, menuButton, storeButton, leaderButton, questionButton;

    private Stage stage;
    private Skin skin;
    private Table table, cellTableTopRight, celltableRightOfPlay, cellTableLeftOfPlay;
    private Label header;




    @Override
    public void show() {


        //////////////////////////////////////////////////////////////////
        //********************SET UP VIEWPORT***************************//
        //////////////////////////////////////////////////////////////////

        float aspectRatio = (float)Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();

        cam = new OrthographicCamera();
        viewport = new ExtendViewport(GAME_WORLD_WIDTH * aspectRatio, GAME_WORLD_HEIGHT, cam);
        viewport.apply();
        cam.position.set(GAME_WORLD_WIDTH/2, GAME_WORLD_HEIGHT/2,0);

        ////////////////////////////////////////////////////////////////
        //******************* SET UP DATA AND UI *********************//
        ////////////////////////////////////////////////////////////////

        //////////////////////
        //** SET UP FONT  **//
        //////////////////////
        titleFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Eddie.ttf"));
        titleFontParam = new FreeTypeFontParameter();
        titleFontParam.size = 85;
        titleFontParam.color = Color.GREEN;

        titleFont = titleFontGenerator.generateFont(titleFontParam);
        titleFontGenerator.dispose();

        ///////////////////////////
        //** SET UP BACKGROUND **//
        ///////////////////////////
        batch = new SpriteBatch();
        Texture backgroundTexture = new Texture("ui/homeScreen/background.png");
        background = new Sprite(backgroundTexture);
        background.setSize(GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);

        //////////////////////
        //** SET UP STAGE **//
        //////////////////////
        stage = new Stage(viewport);

        atlas = new TextureAtlas(Gdx.files.internal("ui/homeScreen/HomeScreenUI.pack"));
        skin = new Skin(atlas);
        table = new Table(skin);
        cellTableTopRight = new Table(skin);
        celltableRightOfPlay = new Table(skin);
        cellTableLeftOfPlay = new Table(skin);
        table.setBounds(0, 0, GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);

        //** TITLE **//
        LabelStyle headerStyle = new LabelStyle();
        headerStyle.font = titleFont;

        header = new Label("AGGRAVATION", headerStyle);
        header.setAlignment(1);

        //** MENU BUTTON **//
        ButtonStyle menuButtonStyle = new ButtonStyle();
        menuButtonStyle.up = skin.getDrawable("settingsUp");
        menuButtonStyle.down = skin.getDrawable("settingsDown");
        menuButtonStyle.pressedOffsetX = 1;
        menuButtonStyle.pressedOffsetY = -1;

        menuButton = new Button(menuButtonStyle);

        //** STORE BUTTON **//
        ButtonStyle storeButtonStyle = new ButtonStyle();
        storeButtonStyle.up = skin.getDrawable("storeUp");
        storeButtonStyle.down = skin.getDrawable("storeDown");
        storeButtonStyle.pressedOffsetY = -1;
        storeButtonStyle.pressedOffsetX = 1;

        storeButton = new Button(storeButtonStyle);

        //** LEADER BUTTON **//
        ButtonStyle leaderButtonStyle = new ButtonStyle();
        leaderButtonStyle.up = skin.getDrawable("leaderUp");
        leaderButtonStyle.down = skin.getDrawable("leaderDown");
        leaderButtonStyle.pressedOffsetX = 1;
        leaderButtonStyle.pressedOffsetY = -1;

        leaderButton = new Button(leaderButtonStyle);


        //** PLAY BUTTON **//
        ButtonStyle playButtonStyle = new ButtonStyle();
        playButtonStyle.up = skin.getDrawable("playUp");
        playButtonStyle.down = skin.getDrawable("playDown");
        playButtonStyle.pressedOffsetX = 1;
        playButtonStyle.pressedOffsetY = -1;

        playButton = new Button(playButtonStyle);

        playButton.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game) Gdx.app.getApplicationListener()).setScreen(new ShipScreen());
            }
        });

        //** Q's BUTTON **//
        ButtonStyle questionButtonStyle = new ButtonStyle();
        questionButtonStyle.up = skin.getDrawable("howtoUp");
        questionButtonStyle.down = skin.getDrawable("howtoDown");
        questionButtonStyle.pressedOffsetX = 1;
        questionButtonStyle.pressedOffsetY = -1;

        questionButton = new Button(questionButtonStyle);


        //** EXIT BUTTON **//
        ButtonStyle exitButtonStyle = new ButtonStyle();
        exitButtonStyle.up = skin.getDrawable("exitUp");
        exitButtonStyle.down = skin.getDrawable("exitDown");
        exitButtonStyle.pressedOffsetX = 1;
        exitButtonStyle.pressedOffsetY = -1;

        exitButton = new Button(exitButtonStyle);

        exitButton.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        //////////////////////////////////
        //******** ADD TO TABLE ********//
        //////////////////////////////////
        table.top();
        table.padTop(40);
        table.add().width(table.getWidth() / 3);
        table.add(header).width(table.getWidth()/3);
        //table.add().width(table.getWidth() / 3);
        //table.row().spaceTop(40);
        //table.add().width(table.getWidth() / 3);
        //table.add().width(table.getWidth() / 3);
        cellTableTopRight.add(storeButton).size(120);
        cellTableTopRight.add(leaderButton).size(120);
        cellTableTopRight.add(menuButton).size(120);
        table.add(cellTableTopRight).width(table.getWidth()/3).padTop(40);
        table.row().spaceTop(240);
        cellTableLeftOfPlay.add(questionButton).size(100);
        table.add(cellTableLeftOfPlay).padTop(142);
        table.add(playButton).size(250);
        table.add(exitButton).size(150).padTop(93);



        ///////////////////////////////////////
        //*********** ADD TO STAGE***********//
        //////////////////////////////////////
        stage.addActor(table);

        Gdx.input.setInputProcessor(stage);

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

        table.act(delta);
        table.debug();
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);
        cam.position.set(GAME_WORLD_WIDTH / 2, GAME_WORLD_HEIGHT / 2, 0);
        stage.getViewport().update(width,height,false);
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
        stage.dispose();
        atlas.dispose();
        skin.dispose();
    }
}
