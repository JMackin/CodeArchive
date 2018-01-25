/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/21/14
 *
 * Filename:   OperatorsLogical.java
 *
 * Purpose:    Examples of logical operators
 */

import java.util.Scanner;

public class OperatorsLogical {

    public static void main(String [] args) {
   
        // declarations
        Scanner input = new Scanner(System.in);
        int age;
        boolean c1, c2;
        
        // constants: preferable to hardwiring constants in the code
        final int AGE_CHILD = 12;
        final int AGE_ADULT = 18;
        final int AGE_SENIOR = 65;
        
        // user input
        System.out.print("Enter age > ");
        age = input.nextInt();
        
        // logical operators
        // both of these may SHORT-CIRCUIT if the first term alone is sufficient to evaluate
        
        c1 = ((age <= AGE_CHILD) || (age >= AGE_SENIOR));
        System.out.println("age = " + age + " ==> child or senior: " + c1);
        
        c2 = ((age >= AGE_ADULT) && (age < AGE_SENIOR));
        System.out.println("age = " + age + " ==> legal age but not yet senior: " + c2);
                            
    } // end main
    
} // end class