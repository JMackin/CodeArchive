/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   SelectionSwitchComparison.java
 *
 * Purpose:    Demonstrates contrast between if-else and switch.
 *             Best seem by stepping thru with a debugger. 
 */
 
public class SelectionSwitchComparison {

    public static void main(String [] args) {
   
        // declarations
        int value;
        String responseText = "You entered the number: ";
        String errorText = "The number entered is NOT from 1-3, it is: ";
        
        // get user input using static utility
        value = UtilsFL.readInt("Enter a number from 1-3: ");
        
        // using if-else if logic
        if (value == 1) {
            System.out.println(responseText + value);
        }   
        else if (value == 2) {
            System.out.println(responseText + value);
        }
        else if (value == 3) {
            System.out.println(responseText + value);
        }
        else {
            System.out.println(errorText + value);
        }
        
        // using a switch statement
        switch (value) {
            case 1:
                System.out.println(responseText + value);
                break;
            
            case 2:
                System.out.println(responseText + value);
                break;
                
            case 3:
                System.out.println(responseText + value);
                break;
            
            default:
                System.out.println(errorText + value);
                break;
        
        } // end switch
                 
    } // end main

} // end class