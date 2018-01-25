package com.mygdx.ships;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by adamr_000 on 12/22/2015.
 */
public class TestShip extends Ship {

	public TestShip(){
		setName("Test Ship");
		setControl(10);
		setHealth(10);
		setMass(10);
		setShileds(10);
		setSpeed(10);
		setSpecial("Just a test ship");
		setShipTexture(new Texture(Gdx.files.internal("ships/spacestation.png")));
		setSize(4,4);
	}

}
