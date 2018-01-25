package com.mygdx.ships;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;

/**
 * Created by User 1 on 12/18/2015.
 * Ships created by MillionthVector
 */
public class BeginnerShip extends Ship {

    public BeginnerShip(){

        Texture shipTexture = new Texture(Gdx.files.internal("ships/clunker.png"));

        setSpecial("This ship has seem some explosive demolition derbies. She's one tuff customer with enough mass to split a small moon in half. Unfortunately, she's old tech, and has no slots for primary weapons. Ram away!");
        setShipTexture(shipTexture);
        setHealth(2);
        setShileds(1);
        setSpeed(2);
        setMass(10);
        setControl(2);
        setName("Junker");
        setMAX_HEALTH(100);
        setSize(4,2);


    }

}
