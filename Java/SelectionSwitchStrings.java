/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       04/12/15
 *
 * Filename:   SelectionSwitchStrings.java
 *
 * Purpose:    Examples of the switch statement using Strings
 *             A String object is entered, and then a selected option
 *              is performed upon that object.
 */

import java.util.Scanner;

public class SelectionSwitchStrings {

    public static void main(String [] args) {
   
        // variables and objects
        Scanner input = new Scanner(System.in);
        String text, option;
        String message = "";
        
        // user prompts
        String prompt = "Enter a new String: ";
        String menu = "Length of the String [LEN or 1]\n" +
                      "First character      [FIR or 2]\n" +
                      "End character        [END or 3]\n" +
                      "Upper case String    [UPP or 4]\n" +
                      "Lower case String    [LOW or 5]\n" +
                      "Enter selection: ";    

        // prompt user for inputs
        System.out.println("String Operations");
        System.out.print(prompt);
        text = input.nextLine();
        
        // prompt for an option
        System.out.print("\n" + menu);
        option = input.nextLine();
        
        // handle case sensitivity
        option = option.toUpperCase();
                      
        switch(option) {
            case "LEN":
            case "1":
                message = "string is: " + text + "\tlength = " + text.length();
                break;
                
            case "FIR":
            case "2":
                message = "string is: " + text + "\tfirst char = " + text.charAt(0);
                break;
            
            case "END":
            case "3":
                message = "string is: " + text + "\tlast char = " + text.charAt(text.length()-1);
                break;
            
            case "UPP":
            case "4":
                message = "string is: " + text + "\tupper case = " + text.toUpperCase();
                break;
            
            case "LOW":
            case "5":
                message = "string is: " + text + "\tlower case = " + text.toLowerCase();
                break;
                
            default:
                message = "Unrecognized option: " + option;
                break;
                
        } // end switch
        
        // no need to duplicate code common to ALL cases
        System.out.println(message);
               
    } // end main

} // end class