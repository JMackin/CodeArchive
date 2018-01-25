package com.mygdx.chunks;

import com.badlogic.gdx.physics.box2d.Body;

/**
 * Created by User 1 on 12/16/2015.
 */
public class ChunkManager {

    private Body trackingBody;
    private float bodyPositionX;
    private float bodyPositionY;
    private float chunkWidth;
    private float chunkHeight;

    private float chunkStartLocationX;
    private float chunkMidLocationX;
    private float chunkEndLocationX;

    private float totalDistanceTraveled;

    private ChunkManager(Body trackingBody){

        this.trackingBody = trackingBody;

    }

    private ChunkManager(Body trackingBody, float chunkWidth, float chunkHeight){

        this.chunkHeight = chunkHeight;
        this.chunkWidth = chunkWidth;
        this.trackingBody = trackingBody;

    }

    private void initialChunk(Chunk chunk){

    }

    /**
     * Indicates when the body reaches the beginning of the chunk.
     */
    public void onStart(){

    }

    /**
     * Indicates when the body reaches the midpoint of the chunk.
     */
    public void onMid(){

    }

    /**
     * Indicates when the body reaches the end of the chunk.
     */
    public void onEnd(){

    }

}
