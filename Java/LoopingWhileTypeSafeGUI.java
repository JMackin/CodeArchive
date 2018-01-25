/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingWhileTypeSafeGUI.java
 *
 * Purpose:    Example of type safe data input using JOptionPane
 */

import javax.swing.JOptionPane;

public class LoopingWhileTypeSafeGUI {

    public static void main(String [] args) {
    
        // declarations
        int age = 0;
        String ageStr;
        String prompt = "Please enter your age: ";
        boolean failed = true;
        
        while (failed == true) {
            try {
                // this is fine: anything we enter can become a String
                ageStr = JOptionPane.showInputDialog(null, prompt);
                
                // this next statement could possibly fail
                age = Integer.parseInt(ageStr);
                
                // if we get here, good input, so toggle the flag
                failed = false;
            }
            catch(NumberFormatException nfe) {
                // intercepts a failed attempt to convert to an int
            }
        }
        
        // echo the resulting input, and demonstrate it's really an int
        JOptionPane.showMessageDialog(null, 
                           "You are " + (age++) + " years old.\n" +
                           "Next year you will be: " + age);
        
    } // end main
        
} // end class