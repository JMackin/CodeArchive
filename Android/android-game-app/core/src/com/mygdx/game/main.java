package com.mygdx.game;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.screens.GDXSplash;
import com.mygdx.screens.PlayScreen;
import com.mygdx.screens.ShipScreen;

public class main extends Game{

	private boolean isDebugging;

	@Override
	public void create () {
		isDebugging = true;
		if(isDebugging){
			setScreen(new ShipScreen());
		} else {
			setScreen(new GDXSplash());
		}
	}

	public main() {
		super();
	}

	@Override
	public void dispose(){
		super.dispose();
		//world.dispose();

	}


	@Override
	public void render () {

		super.render();
	}

	@Override
	public void resize(int width, int height){
		super.resize(width, height);
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
	}

	@Override
	public Screen getScreen() {
		return super.getScreen();
	}

	@Override
	public void pause(){

	}

	@Override
	public void resume(){
		super.resume();
	}
}
