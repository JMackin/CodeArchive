/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   SelectionSwitchChars.java
 *
 * Purpose:    Sample code for reading command line keyboard input
 */

import java.util.Scanner;
 
public class SelectionSwitchChars {

    public static void main(String [] args) {
    
        Scanner scan = new Scanner(System.in);
        char ch;
        String menu = "User Options:\n" +
                      "Execute Plan A       [A]\n" +
                      "Brainstorm Some More [B]\n" +
                      "Die in Committee     [C]\n" +
                      "Quit                 [Q]\n" +
                      "Enter option: ";
       
        
        // prompt for an input character, and peel off first character
        System.out.print(menu);
        ch = scan.nextLine().charAt(0);
        
        // case insensitivity
        // another way is to convert to UPPER or lower case for switch
        //ch = scan.nextLine().toUpperCase().charAt(0);
        
        switch (ch) {
            case 'A':
            case 'a':
                executePlanA();
                break;
                
            case 'B':
            case 'b':
                brainstormSomeMore();
                break;
                
            case 'C':
            case 'c':
                dieInCommittee();
                break;
                
            case 'Q':
            case 'q':
                System.out.println("Exiting, goodbye!");
                break;
                
            default:
                System.out.println("Unrecognized option: " + ch);
                break;
            
        } // end switch
              
    } // end main
    
    //---------------------------------------------------------------
    
    // option A handling
    private static void executePlanA() {
        // provide some pseudocode until "real code" is developed
        System.out.println("Execute Plan A...");
    }

    // option B handling
    private static void brainstormSomeMore() {
        // provide some pseudocode until "real code" is developed
        System.out.println("Brainstorm some more...");
    }

    // option C handling
    private static void dieInCommittee() {
        // provide some pseudocode until "real code" is developed
        System.out.println("Die in committee...");
    }

} // end class