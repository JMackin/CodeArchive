/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/16/14
 *
 * Filename:   LiteralExamples.java
 *
 * Purpose:    Examples of various literals, to accompany lecture slide on literals.
 *             This also demonstrates printing out variables w/labels.
 */
 
public class LiteralExamples {

    public static void main(String [] args) {
   
        // integer literals
        int absoluteZero = -273;
        long cityPopulation = 4235873L;
        short opCode = 0xDE;    
        int age = 21;
        
        // floating point literals
        float salesTaxRate = 0.0875F;
        double speedOfLight = 3.0E8;
        
        // character literals
        char newline = '\n';
        char tabChar = 0x09;
        char gender = 'F';
        
        // boolean literals
        boolean isPassing = true;
        boolean heaterOn = false;
        
        // print all of the above literals
        System.out.println("absoluteZero = " + absoluteZero);
        System.out.println("cityPopulation = " + cityPopulation);
        System.out.println("opCode = " + opCode);
        System.out.println();
        
        System.out.println("salesTaxRate = " + salesTaxRate);
        System.out.println("speedOfLight = " + speedOfLight);
        System.out.println();
        
        System.out.println("There should be a newline" + newline + "in between these lines");
        System.out.println("There should be a tab" + tabChar + "right in here");
        System.out.println("gender = " + gender);
        System.out.println();
        
        System.out.println("isPassing = " + isPassing);
        System.out.println("heaterOn = " + heaterOn);
        System.out.println();
        
        System.out.println("Hello " + "World!");
        System.out.println("I want ths\nPrinted on two lines");
        System.out.println("age = \t\t" + age);
        
    } // end main

} // end class

