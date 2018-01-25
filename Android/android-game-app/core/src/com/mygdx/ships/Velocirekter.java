package com.mygdx.ships;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by User 1 on 12/20/2015.
 */
public class Velocirekter extends Ship {

    public Velocirekter(){

        setName("Velocirekter");
        setSpeed(10);
        setHealth(4);
        setSpeed(5);
        setMass(2);
        setShileds(4);
        setControl(5);

        setSpecial("Bob");

        Texture tempTexture = new Texture(Gdx.files.internal("ships/velocirekter.png"));
        setShipTexture(tempTexture);


        setSize(4,4);

    }


}
