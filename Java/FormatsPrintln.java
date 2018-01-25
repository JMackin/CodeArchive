/*
 * Name:       Rob Lapkass
 *
 * Filename:   FormatsPrintln.java
 *
 * Course:     CS-12
 *
 * Date:       02/11/14
 *
 * Purpose:    
 */
 
public class FormatsPrintln {

    public static void main(String [] args) {
    
        String textString = "This is the same output as a String";
        int junkVar1 = 13;
        String promptString;
   
        // simple String literal
        System.out.println("This is some output to be printed");
        
        // output using a String variable
        System.out.println(textString);
        
        // here are two ways to print a blank line spacer
        System.out.println();
        System.out.println("\n");
        
        // here are several ways of printing a variable with some label
        // these also demonstrate string concatenation
        System.out.println("junkVar1 = " + junkVar1);
        System.out.println("junkVar1: \t" + junkVar1);
        System.out.println("Currently " + junkVar1 + " is the value of junkVar1");
        
        // print a count by junkVar1, with visual separators and column labels
        // note the extra spaces, sometimes you need to "tweak" to align just so
        System.out.println("============================================");
        System.out.println("0x\t 1x\t 2x\t 3x\t 4x\t 5x");
        System.out.println("--\t --\t --\t --\t --\t --");
        System.out.println(0*junkVar1 + "\t " + 1*junkVar1 + "\t " +
                           2*junkVar1 + "\t " + 3*junkVar1 + "\t " +
                           4*junkVar1 + "\t " + 5*junkVar1);
        System.out.println("============================================");
        
        // a multiline string can be created by inserting newlines
        promptString = "Make Deposit  [D]\n" + 
                       "Withdraw Cash [C]\n" +
                       "Check Balance [B]\n" +
                       "Enter option: ";
        System.out.println(promptString);
                    
    }

}