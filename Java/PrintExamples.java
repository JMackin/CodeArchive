/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *2
 * Date:       10/09/14
 *
 * Filename:   PrintExamples.java
 *
 * Purpose:    Various examples of using System.out.println()
 *             for command line output.
 */

import java.util.Scanner;

public class PrintExamples {

    public static void main(String [] args) {
    
        String str1;
        int num1;
        Scanner input = new Scanner(System.in);
        char userOption;
        
        // a multi-line user prompt
        final String PROMPT_TEXT = "ACCOUNT OPTIONS:\n" +
                                   "Add new account    [A]\n" +
                                   "Update account     [U]\n" +
                                   "Print account info [P]\n" +
                                   "Delete account     [D]\n" +
                                   "Quit program       [Q]\n" +
                                   "Enter option >> ";
        
        // printing with String and numeric literals
        System.out.print("The answer is: ");
        System.out.println(42);
        
        // same, except printing with String and numeric variables
        str1 = "The answer is: ";
        num1 = 42;
        System.out.print(str1);
        System.out.println(num1);
        
        // ways of printing a blank line
        System.out.println();
        System.out.println("\n");  // double blank lines
        
        // embedding new lines and tabs in a print
        System.out.println("\nI need some \tblank space\t before and after me\n");
        
        // a sample user prompt, that may get reused over and over
        // note the use of multiple dot notation (unpeel from left to right)
        // in this example, it turns all user inputs to upper case
        System.out.print(PROMPT_TEXT);
        userOption = input.nextLine().toUpperCase().charAt(0);
        System.out.println("User entered: " + userOption);
        
        // explicit termination, any lines following are never executed
        System.exit(0);
        System.out.println("That's all, folks!");
            
    } // end main

} // end class

