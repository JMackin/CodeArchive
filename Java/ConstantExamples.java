/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       09/16/14
 *
 * Filename:   ConstantExamples.java
 *
 * Purpose:    Examples of constants, to accompany slide on constants. 
 */
 
public class ConstantExamples {

    public static void main(String [] args) {
   
        // define our program constants
        final int CARDS_IN_DECK = 52;
        final int ONE_DOZEN = 12;
        final long ONE_MILLION = 1000000L;
        final float PLACER_SALES_TAX_RATE = 0.075F;
        final double METERS_TO_INCHES = 39.37;
        final double INCHES_TO_METERS = 1/METERS_TO_INCHES;  // reciprocal
        final double EARTH_GRAVITY = -9.81;   // [m/s^2]
        final char YEN_SYMBOL = 0x00A5;
        final String PROMPT_TEXT = "Enter an input value: ";
        
        // print our constants
        System.out.println("CARDS_IN_DECK = " + CARDS_IN_DECK);
        System.out.println("ONE_DOZEN = " + ONE_DOZEN);
        System.out.println("ONE_MILLION = " + ONE_MILLION);
        System.out.println("PLACER_SALES_TAX_RATE = " + PLACER_SALES_TAX_RATE);
        System.out.println("METERS_TO_INCHES = " + METERS_TO_INCHES);
        System.out.println("INCHES_TO_METERS = " + INCHES_TO_METERS);
        System.out.println("EARTH_GRAVITY = " + EARTH_GRAVITY);
        System.out.println("YEN_SYMBOL = " + YEN_SYMBOL);
        System.out.println("PROMPT_TEXT = " + PROMPT_TEXT);
                    
    } // end main

} // end class

