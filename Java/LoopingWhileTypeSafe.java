/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingWhileTypeSafe.java
 *
 * Purpose:    Example of type safe data input
 */

import java.util.Scanner;

public class LoopingWhileTypeSafe {

    public static void main(String [] args) {

        // declarations and initializations
        int age;
        Scanner input = new Scanner(System.in);
        String garbage;
        
        // program is implicitly expecting 
        // to read and echo an int value
        System.out.print("Enter your age > ");
        
        // loop until we get suitable input
        while ( !input.hasNextInt() ) {
            // flush input buffer
            garbage = input.nextLine();
            System.out.print("\nPlease enter an integer age > ");
        }
        
        // at this point, input is known to be an int
        age = input.nextInt();
        System.out.println("Your age is " + age);
            
    } // end main

} // end class