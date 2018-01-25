/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/01/14
 *
 * Filename:   LoopingWhileEndless.java
 *
 * Purpose:    Examples of endless while loops
 */

import java.util.Scanner;

public class LoopingWhileEndless {

    public static void main(String [] args) {
   
        // declarations, initializations
        double tempF = 90.0;
        
        Scanner input = new Scanner(System.in);
        String prompt = "Enter item price: ";
        double itemCost;
        double total = 0.0;
        
        // endless loop 1: no update
        while (tempF >= 75.0) {
            System.out.println("Hey! " + tempF + " is too hot in here!");
            // how would you fix this??
        } 
        
        // endless loop 2: no update read
        System.out.print(prompt);
        itemCost = input.nextDouble();
        
        while (itemCost > 0.0) {
            total += itemCost;
            //System.out.println("total cost is: " + total);
            // endless loop, "hangs" because no update read
            //System.out.print(prompt);
            //itemCost = input.nextDouble();
        }
        System.out.println("total cost is: $" + total);
        
        // endless loop 3: sometimes we actually DO want this
        // (for example, in embedded systems development)
        while (true) {
            System.out.println("task is executed forever...");
        }
        
    } // end main

} // end class

