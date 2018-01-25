/*
 * Name:       Rob Lapkass
 *
 * Filename:   ScannerAppNote.java
 *
 * Course:     CS-12
 *
 * Date:       02/18/14
 *
 * Purpose:    Example code for Scanner app note  
 */

// the following statement is REQUIRED, goes outside the class statement
import java.util.Scanner;   // (step 1)

public class ScannerAppNote {

    public static void main(String [] args) {
   
        // ---- data declarations ----
        
        // new input object of type Scanner
        Scanner input = new Scanner(System.in);  // step (2)
        
        // input data needed
        float numFloat;
        double numDouble;
        int numInt;
        long numLong;
        
        // ---- data initializations ----
        
        // obtain inputs using Scanner
        // each data input requires a prompt, use print() to stay on same line
        // note that you can reuse the same "input" object for all data input
        
        System.out.print("Enter a float number: ");  // step (3)
        numFloat = input.nextFloat();                // step (4)
        
        System.out.print("Enter a double number: ");
        numDouble = input.nextDouble();
        
        System.out.print("Enter an int number: ");
        numInt = input.nextInt();
        
        System.out.print("Enter a long number: ");
        numLong = input.nextLong();
     
        // ---- calculations ----
        // (N/A for this example)
        
        // ---- data outputs ----
        
        System.out.println("numFloat:\t" + numFloat);
        System.out.println("numDouble:\t" + numDouble);
        System.out.println("numInt:\t\t" + numInt);
        System.out.println("numLong:\t" + numLong);
            
    } // end main

} // end class