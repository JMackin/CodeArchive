/*
 * Name:       John Mackin *
 *
 * Course:     cs-12, Spring 2015
 *
 * Date:       02/27/15
 *
 * File:       ExternalInputJM.java
 *
 * Purpose:    Demonstrate use of operators.
 */
 
 import java.util.Scanner;
 
 public class ExternalInputJM{

   public static void main(String [] args){
   
    
   // Declarations 
  
   // Scanner
   Scanner input = new Scanner(System.in);
 
   int eggsNum, eggsRemain;
   int widget1, widget2, widgetShip;
   float sandWich, chips, soda, lunchMeal;
   float shirtCost, totalCost;
   float batHits, batAts, batAvg;
   double circRadius, circArea;
   final byte ONE_DOZEN = 12;
   final float PLACER_TAX = 0.075F;
   final double PI = Math.PI;
 
 
   // input initializations
 
 
   //1.
   System.out.print("Enter price of sandwich: $");
   sandWich = input.nextFloat();
   System.out.print("Enter price of chips: $");
   chips = input.nextFloat();
   System.out.print("Enter price of soda: $");
   soda = input.nextFloat();
   lunchMeal = sandWich + chips + soda;
  
   //2. 
   System.out.print("Enter amount of eggs: ");
   eggsNum = input.nextInt();
   eggsNum = eggsNum / ONE_DOZEN;
  
   //3.
   eggsRemain = eggsNum % ONE_DOZEN;
  
   //4.
   System.out.print("Enter price of shirt: $");
   shirtCost = input.nextFloat();
   totalCost = (shirtCost * PLACER_TAX) + shirtCost;
  
   //5.
   System.out.print("Enter radius of circle: ");
   circRadius = input.nextDouble();
   circArea = PI * (circRadius * circRadius);
  
   //6.
   System.out.print("Enter number of at bats: ");
   batAts = input.nextFloat();
   System.out.print("Enter number of hits: ");
   batHits = input.nextFloat();
   batAvg = batAts / batHits;
  
   //7.
   System.out.print("Enter initial inventory for widget 1: ");
   widget1 = input.nextInt();
   // calculation with relevant output.
      
   //8
   System.out.print("Enter initial inventory for widget 2: ");
   widget2 = input.nextInt();
   System.out.print("Enter amount of widgets recieved in shipment: ");
   widgetShip = input.nextInt();
   // calculation with relevant output.

  
   // Calculations, output prints
   System.out.println("\n1.");
   System.out.println("Sandwich: \t$" + sandWich);
   System.out.println("Chips: \t\t$" + chips);
   System.out.println("Soda: \t\t$" + soda);
   System.out.println("Lunch Meal: \t$" + lunchMeal + "\n");
  
   System.out.println("2.");
   System.out.println("There are " + eggsNum + " multiples of a dozen eggs out of 872 \n");
  
   System.out.println("3.");
   System.out.println("Following the division of 872 by a dozen, there are " + eggsRemain + " \n");
                      
   System.out.println("4.");
   System.out.println("The total cost of shirt is $" + shirtCost + " Placer sales tax is " + PLACER_TAX + 
                      "% and the total cost w/ tax is $" + totalCost + " \n");
                     
   System.out.println("5.");
   System.out.println("The area of a circle with a radius of " + circRadius + "m is " + circArea + 
                      " meters squared\n");
                     
   System.out.println("6");
   System.out.println("Batting average for " + batHits + " hits and " + batAts + " at bats is " + batAvg +"\n"); 
  
   System.out.println("7.");
   System.out.println("Inventory originally was " + widget1);    
   // Widget deincriment
   widget1--;
   System.out.println("then it was " + widget1 + " after one sold.\n");
  
   System.out.println("8.");
   System.out.println("Inventory was originally " + widget2);    
   // Widget incriment of 20
   widget2 += widgetShip;
   System.out.println("Then it was " + widget2 + " after a shipment of " + widgetShip + " more");
   
   // End Main  
  }
}