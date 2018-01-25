package com.mygdx.ships;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Created by User 1 on 12/18/2015.
 */
public class Ship {

    private float health;
    private float MAX_HEALTH;
    private float shield;
    private float MAX_SHIELD;
    private float speed;
    private float control;
    private float mass;
    private String special;
    private String name;
    private float shipCostDarkMatter;
    private float shipCostCredits;

    private Texture shipTexture;
    private Sprite shipSprite;
    private Skin shipSkin;
    private float shipSpriteHeight;
    private float shipSpriteWidth;


    private Rectangle hitBox;
    private float positionX, positionY;

    public Ship(){
        health = 0;
        shield = 0;
        speed = 0;
        control = 0;
        special = "null";
        name = "null";
        mass = 1;
        MAX_HEALTH = 1;
        MAX_SHIELD = 1;

        shipTexture = new Texture(Gdx.files.internal("ships/error.png"));
        shipSprite = new Sprite(shipTexture);

        positionX = 0;
        positionY = 0;

        hitBox = new Rectangle(0,0,0,0);

    }


    ////////////////////
    // ** MUTATORS ** //
    ////////////////////

    /**
     * Sets the Ship's name.
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the ship's Texture for drawing.
     * @param shipTexture
     */
    public void setShipTexture(Texture shipTexture){
        this.shipTexture = shipTexture;
        shipSprite = new Sprite(shipTexture);
    }

    /**
     * Sets the health of the ship. Usually set equal to the ShipHealth. In a case where an object insta kills the player, it is set to -1.
     * @param health
     */
    public void setHealth(float health){
        this.health = health;
    }

    /**
     * Sets the maximum health of the ship.
     * @param MAX_HEALTH
     */
    public void setMAX_HEALTH(float MAX_HEALTH){
        this.MAX_HEALTH = MAX_HEALTH;
    }

    /**
     * Sets teh shield of the ship. In a case where an object insta destroys a player's sheild, it is set to 0.
     * @param shield
     */
    public void setShileds(float shield){
        this.shield = shield;
    }

    /**
     * Sets how fast a ship moves.
     * @param speed
     */
    public void setSpeed(float speed){
        this.speed = speed;
    }

    /**
     * Sets how easy it is to control the ship.
     * @param control
     */
    public void setControl(float control){
        this.control = control;
    }

    /**
     * Sets the mass of the ship for striking damage. (Direct contact with other objects.)
     * @param mass
     */
    public void setMass(float mass){
        this.mass = mass;
    }

    /**
     * Sets the discription of the special ability of the ship.
     * @param special
     */
    public void setSpecial(String special){
        this.special = special;
    }

    /**
     * Sets the size of the ship, along with the size of the hitbox.
     * @param width
     * @param height
     */
    public void setSize(float width, float height){
        shipSpriteHeight = height;
        shipSpriteWidth = width;
        hitBox.setSize(width, height);
    }

    /**
     * Sets the position of the ship's hitbox.
     * @param X
     * @param Y
     */
    public void setPosition(float X, float Y){
        positionX = X;
        positionY = Y;
        hitBox.setPosition(X,Y);
    }

    /**
     * Sets the maximum shield for the object
     * @return
     */
    public void setMAX_SHIELD(float MAX_SHIELD){
        this.MAX_SHIELD = MAX_SHIELD;
    }


    /////////////////////
    // ** ACCESSORS ** //
    /////////////////////

    public float getHealth(){
        return health;
    }

    public float getShield(){
        return shield;
    }

    public float getSpeed(){
        return speed;
    }

    public float getControl(){
        return control;
    }

    public float getMass(){
        return mass;
    }

    public String getSpecial(){
        return special;
    }

    public Texture getShipTexture(){
        return shipTexture;
    }

    public Sprite getShipSprite(){
        return shipSprite;
    }

    public String getName(){
        return name;
    }


    public float getShipSpriteHeight(){
        return shipSpriteHeight;
    }

    public float getShipSpriteWidth(){
        return shipSpriteHeight;
    }

    public float getShipPositionX(){
        return positionX;
    }

    public float getShipPositionY(){
        return positionY;
    }

    ////////////////////////////////
    // ***** FUNCTIONALITY ***** //
    ///////////////////////////////

    /**
     * Used to reduce the health of the ship.
     * @param damage
     */
    public void strikeShip(float damage){
        if(shield <= 0){
            health -= damage;
        } else {
            shield -= damage;
        }
    }

    /**
     * Increase the health of the ship if an object is picked up that repairs the ship.
     * @param amount
     */
    public void healthUp(float amount){
        if(health < MAX_HEALTH){
            if( (health + MAX_HEALTH) > MAX_HEALTH){
                health = MAX_HEALTH;
            } else {
                health += amount;
            }
        }
    }

    /**
     * Increase the sheild of the ship if an object is picked up that repairs the ship.
     * @param amount
     */
    public void shieldUp(float amount){
        if(shield < MAX_SHIELD){
            if( (shield + MAX_SHIELD) > MAX_SHIELD){
                shield = MAX_SHIELD;
            } else {
                shield += amount;
            }
        }
    }

    /**
     * Checks to see if the player's ship is still alive or not.
     * @return
     */
    public boolean isAlive(){
        if(health <= 0){
            return false;
        } else {
            return true;
        }
    }




}
