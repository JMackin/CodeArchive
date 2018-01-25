/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/09/14
 *
 * Filename:   DialogExamples.java
 *
 * Purpose:    Prototypes for JOptionPane dialogs
 */
 
import javax.swing.JOptionPane;

public class DialogExamples {

    public static void main(String [] args) {
    
        String name, ageStr;
        int ageNum;
        final int DAYS_PER_YEAR = 365;
        
        // prompt for name and age
        name = JOptionPane.showInputDialog(null, "What is your name?");
        ageStr = JOptionPane.showInputDialog(null, "What is your age?");
        
        // show that age is a String, then convert it with a wrapper class
        System.out.println("Length of input string " + ageStr + " is " + ageStr.length());
        ageNum = Integer.parseInt(ageStr);
        
        // show that age is now numeric, and create an output string
        JOptionPane.showMessageDialog(null,
                                      name + ", your approximate age is:\n" +
                                      (ageNum * DAYS_PER_YEAR) + " days");
              
    }

}