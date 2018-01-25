/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/20/14
 *
 * Filename:   OperatorsPrecedence1.java
 *
 * Purpose:    Examples of operator precedence
 */
 
public class OperatorsPrecedence1 {

    public static void main(String [] args) {
   
        // declarations
        int numPennies, numQuarters, numDimes, numNickels;
        final int PENNIES_PER_QUARTER = 25;
        final int PENNIES_PER_DIME = 10;
        final int PENNIES_PER_NICKEL = 5;
        
        // initializations
        numQuarters = 2;
        numDimes = 3;
        numNickels = 2;
    
        // computations
        numPennies = numQuarters * PENNIES_PER_QUARTER +
                     numDimes * PENNIES_PER_DIME +
                     numNickels * PENNIES_PER_NICKEL;
    
        // outputs
        System.out.println("numPennies = " + numPennies);
                
    } // end main

} // end class

