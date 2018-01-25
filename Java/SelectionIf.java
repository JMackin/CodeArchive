/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/23/14
 *
 * Filename:   SelectionIf.java
 *
 * Purpose:    Examples of simple if selection
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class SelectionIf {

    public static void main(String [] args) {
   
        // object declarations
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("$#0.00");
        
        // data declarations
        int age;
        double ticketPrice = 10.00;
        
        // prompt for inputs
        System.out.print("Enter age: ");
        age = input.nextInt();
        
        // check for 25% senior discount
        if (age >= 65) {
            ticketPrice *= 0.75;
        }   
        
        // following statement(s) are always done
        System.out.println("Please pay: " + 
                           fmt.format(ticketPrice));
                    
    } // end main

} // end class
