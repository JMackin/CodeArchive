/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/05/14
 *
 * Filename:   LoopingForBackwards.java
 *
 * Purpose:    Processes a String by printing it backwards 
 */

import javax.swing.JOptionPane;

public class LoopingForBackwards {

    public static void main(String [] args) {
   
        String forward;  // the original string
        String backward = "";
        
        forward = JOptionPane.showInputDialog(null,
                                       "Enter some text");
        
        // we always know exactly how long any string is
        // build new string up from back to front, char by char
        for (int i=forward.length()-1; i>=0; i--) {
            backward += forward.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null,
                               "Original: " + forward + 
                               "\nBackwards: " + backward);
    } // end main

} // end class