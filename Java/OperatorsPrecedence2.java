/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/20/14
 *
 * Filename:   OperatorsPrecedence2.java
 *
 * Purpose:    Examples of operator precedence
 */
 
public class OperatorsPrecedence2 {

    public static void main(String [] args) {
   
        // declarations
        int x, y;
        int resultBad, resultGood;
        
        // initializations
        x = 100;
        y = 25;
    
        // computations
        resultBad = x / 2 * y;
        resultGood = x / (2 * y);
     
        // outputs
        System.out.println("resultBad = " + resultBad);
        System.out.println("resultGood = " + resultGood);
                
    } // end main

} // end class

