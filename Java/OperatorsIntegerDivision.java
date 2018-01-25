/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       MM/DD/14
 *
 * Filename:   OperatorsIntegerDivision.java
 *
 * Purpose:    Examples of applying integer division and modulus
 */
 
public class OperatorsIntegerDivision {

    public static void main(String [] args) {

        // declarations, initializations
        int number, divisor;
        int numItems, numPerBox;
        int totalCents;
        final int CENTS_PER_QUARTER = 25;
        int result, remainder;
        
        // computations + outputs
        // combined because we are re-using outputs
        
        number = 100;
        divisor = 15;
        result = number / divisor;
        remainder = number % divisor;
        System.out.println(divisor + " goes into " + 
                           number + " " +
                           result + " times with " + 
                           remainder + " left over");
                           
        numItems = 126;
        numPerBox = 12;
        result = numItems / numPerBox;
        remainder = numItems % numPerBox;
        System.out.println(numItems + " ==> " +
                           result + " boxes with " + 
                           remainder + " left over"); 
        
        totalCents = 108;
        result = totalCents / CENTS_PER_QUARTER;
        remainder = totalCents % CENTS_PER_QUARTER;
        System.out.println(totalCents + " cents is " +
                           result + " quarters plus " +
                           remainder + " pennies");        
            
    } // end main

} // end class

