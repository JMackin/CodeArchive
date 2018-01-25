/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingWhileTypeUnsafe.java
 *
 * Purpose:    Example of type unsafe data input
 */

import java.util.Scanner;

public class LoopingWhileTypeUnsafe {

    public static void main(String [] args) {

        // declarations and initializations
        int age;
        Scanner input = new Scanner(System.in);
        
        // program is implicitly expecting 
        // to read and echo an int value
        System.out.print("Enter your age > ");
        age = input.nextInt();
        System.out.println("Your age is " + age);
            
    } // end main

} // end class