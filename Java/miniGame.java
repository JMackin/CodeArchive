/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      02/18/2015
*
* Filename:  MiniGame.java
*
* Purpose:   ###
*/

import java.util.Random;

public class MiniGame {

  public static void main(String [] args) {
  
    // Variables for health, damage, attack, characters
    int playerHealth = 100;
    int foeHealth = 100;
    double playerDamage = runAttack(playerHealth);
    System.out.println(Math.round(playerDamage * 100));
    
  }
  
  // Methods for attack
  private static double runAttack(int playerHealth){
    
    Random rando = new Random();
    
    double playerAttack = rando.nextDouble();
        
    double playerDamage = playerHealth - runDefense(playerAttack);
        
    return playerDamage;
  }
  
  private static double runDefense(double playerAttack) {
  
    Random rando = new Random();
    
    double playerDefense = rando.nextDouble();
    
    
    return playerDefense;
  
  }
  
 }//end class