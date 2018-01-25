package com.mygdx.ships;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Created by User 1 on 12/18/2015.
 */
public class ShipManager {

    private Ship[] shipArray;
    private String[] shipNames;

    private final int totalShips = 3;

    public ShipManager(){
        shipArray = new Ship[totalShips];
        shipArray[0] = new BeginnerShip();
        shipArray[1] = new Velocirekter();
        shipArray[2] = new TestShip();
        shipNames = new String[totalShips];



        for(int i = 0; i < shipArray.length; i++){
            if(shipArray[i] != null){
                shipNames[i] = shipArray[i].getName();
            }
        }

    }

    public Ship getShip(int shipNumber){
        return shipArray[shipNumber];
    }

    public Ship getShipByName(String name){
        for(int i = 0; i < shipArray.length; i++){
            if(shipArray[i].getName().equals(name)){
                return shipArray[i];
            }
        }
        return null;
    }


    public String[] getShipNames(){
        return shipNames;
    }

}
