/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/01/14
 *
 * Filename:   LoopingWhileSwitchMenu.java
 *
 * Purpose:    Demonstrates a while loop around a switch menu,
 *             and proper continuation conditions for the while loop.
 */

import java.util.Scanner;

public class LoopingWhileSwitchMenu {

    public static void main(String [] args) {
    
        // declarations, initializations
        Scanner input = new Scanner(System.in);
        char option;
        String menu = "List of menu options:\n" +
                      "Option A [A]\n" +
                      "Option B [B]\n" +
                      "Quit     [Q]\n" +
                      "Option > ";
                      
        // priming read
        System.out.print(menu);
        option = input.nextLine().charAt(0);
        
        // loop until terminating char(s) NOT encouontered
        while ((option != 'Q') && (option != 'q')) {
        
            switch (option) {
                case 'A':
                case 'a':
                    System.out.println("Perform option A instructions here...\n");
                    break;
                    
                case 'B':
                case 'b':
                    System.out.println("Perform option B instructions here...\n");
                    break;
                    
                default:
                    System.out.println("Unrecognized option " + option + ", please try again\n");
                    break;
                    
            }
            
            // update read
            System.out.print(menu);
            option = input.nextLine().charAt(0);
            
        }
        
        // termination action(s)
        System.out.println("Exit upon user request");
            
    } // end main

} // end class

