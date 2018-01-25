package com.mygdx.weapons.projectiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by adamr_000 on 1/11/2016.
 */
public class Bullet {

	private Rectangle hitBox;
	private float angle, time, speed, height, width, hitDamage;

	private Texture bulletTexture;
	private Sprite bulletSprite;

	//TODO: THOSE DAMN ANGLES!

	/**
	 * Default constructor.
	 */
	public Bullet(){
		hitBox = new Rectangle(0,0,1,1);

		angle = 0;
		time = 4;
		bulletTexture = new Texture(Gdx.files.internal("weapons/lasers/frame0.png"));


		bulletSprite = new Sprite(bulletTexture);

	}

	public Bullet(float x, float y, float width, float height, float angle, float speed){
		hitBox = new Rectangle(x,y,width,height);
		time = 1;
		this.angle = angle;
		this.speed = speed;

		bulletTexture = new Texture(Gdx.files.internal("weapons/lasers/frame0.png"));
		bulletSprite = new Sprite(bulletTexture);
		bulletSprite.setSize(width, height);
		bulletSprite.rotate90(true);
		bulletSprite.setPosition(hitBox.x, hitBox.y);
		bulletSprite.setCenter(hitBox.x, hitBox.y);
		bulletSprite.setOriginCenter();
		bulletSprite.rotate((float)Math.toDegrees(angle));
	}

	/////////////////////
	// ** MUTATORS  ** //
	/////////////////////

	/**
	 * Sets the texture of the bullet.
	 * @param texture
	 */
	public void setBulletTexture(Texture texture){
		bulletTexture = texture;
	}

	/**
	 * Sets the height of the HitBox and Sprite.
	 * @param height
	 */
	public void setHeight(float height){
		this.height = height;
		hitBox.setHeight(height);
		bulletSprite.setSize(bulletSprite.getWidth(), height);
	}

	/**
	 * Sets the width of the HitBox and Sprite.
	 * @param width
	 */
	public void setWidth(float width){
		this.width = width;
		hitBox.setWidth(width);
		bulletSprite.setSize(width,bulletSprite.getHeight());
	}

	public void setHitDamage(float hitDamage){
		this.hitDamage = hitDamage;
	}

	/////////////////////
	// ** ACCESSORS ** //
	/////////////////////


	/**
	 * Returns the rectagular hitbox of the object.
	 * @return
	 */
	public Rectangle getHitBox(){
		return hitBox;
	}

	/**
	 * The sprite for drawing.
	 * @return
	 */
	public Sprite getBulletSprite(){
		return bulletSprite;
	}


	/////////////////////////
	// ** FUNCTIONALITY ** //
	/////////////////////////

	/**
	 * Updates the Bullet's position.
	 * @param delta
	 */
	public void update(float delta){

		hitBox.x += speed * (float)Math.cos(angle) * delta;
		hitBox.y += speed * (float)Math.sin(angle) * delta;

		bulletSprite.setCenter(hitBox.x, hitBox.y);
		bulletSprite.setPosition(hitBox.x, hitBox.y);
		bulletSprite.setOriginCenter();
		bulletSprite.rotate(angle);

		time-=delta;

	}

	public void draw(SpriteBatch batch){
		bulletSprite.draw(batch);
	}

	public boolean isAlive(){
		if(time<0){
			return false;
		} else {
			return true;
		}
	}

}
