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
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.tween.SpriteAccessor;


/**
 * Created by User 1 on 12/13/2015.
 */
public class GDXSplash implements Screen {

    private final float GAME_WORLD_WIDTH = 128;
    private final float GAME_WORLD_HEIGHT = 64;


    private SpriteBatch batch;
    private Sprite splashTexture;
    private TweenManager titleManager;

    private OrthographicCamera cam;
    private Viewport viewport;

//    private FreeTypeFontGenerator titleFontGenerator;
//    private FreeTypeFontParameter titleFontParam;
//    private BitmapFont titleFont;


    @Override
    public void show() {


        //////////////////////////////////////////////////////////////////
        //********************SET UP VIEWPORT***************************//
        /////////////////////////////////////////////////////////////////

        float aspectRatio = (float)Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();

        cam = new OrthographicCamera();
        viewport = new ExtendViewport(GAME_WORLD_WIDTH * aspectRatio, GAME_WORLD_HEIGHT, cam);
        viewport.apply();
        cam.position.set(GAME_WORLD_WIDTH/2, GAME_WORLD_HEIGHT/2,0);

        /////////////////////////////////////////////////////////////////
        //************************ DATA SETUP *************************//
        /////////////////////////////////////////////////////////////////

        batch = new SpriteBatch();

        Texture block = new Texture("madeWith.jpg");
        splashTexture = new Sprite(block);
        splashTexture.setSize(GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);
        //splashTexture.setPosition(GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);

        ////////////////////////////////
        //*********** TITLE **********//
        ///////////////////////////////

//        titleFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Zombie_Holocaust.ttf"));
//        titleFontParam = new FreeTypeFontParameter();
//        titleFontParam.size = 200;
//        titleFontParam.color = Color.GREEN;
//
//        titleFont = titleFontGenerator.generateFont(titleFontParam);
//        titleFontGenerator.dispose();
//


         //-----------------------------------\\
        //********** TITLE TWEEN SET **********\\
        titleManager = new TweenManager();
        Tween.registerAccessor(Sprite.class, new SpriteAccessor());
        Tween.set(splashTexture, SpriteAccessor.ALPHA).target(0).start(titleManager);
        Tween.to(splashTexture, SpriteAccessor.ALPHA, 2).delay(2).target(1).repeatYoyo(1,1).setCallback(new TweenCallback() {

            @Override
            public void onEvent(int type, BaseTween<?> source) {
                ((Game) Gdx.app.getApplicationListener()).setScreen(new HomeScreen());
            }
        }).start(titleManager);


    }

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        cam.update();

        titleManager.update(delta);
        batch.begin();
        batch.setProjectionMatrix(cam.combined);
        splashTexture.draw(batch);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);
        cam.position.set(GAME_WORLD_WIDTH/2, GAME_WORLD_HEIGHT/2,0);
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
//        titleFont.dispose();
    }
}
