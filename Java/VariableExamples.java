/* Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/16/14
 *
 * Filename:   VariableExamples.java
 *
 * Purpose:    Examples of variable declaration, initialization,
 *             and both together.
 *             NOTE: This file won't compile as-is, because 
 *             the final portion redeclares all the variables.
 *             Need to comment out first two sections OR the last section.
 */
 
public class VariableExamples {

    public static void main(String [] args) {
   
        // variable or constant declaration alone
        byte age;
        short xCursor;
        int testScore;
        long cityPopulation;
        float salesTaxRate;
        double yearlySalary;
        char gender;
        boolean isEmpty;       
               
        // variable or constant initialization alone
        age = 21;
        xCursor = 45;
        testScore = 98;
        cityPopulation = 125000L;
        salesTaxRate = 0.075F;
        yearlySalary = 89400.0;
        gender = 'M';
        isEmpty = false;  
        
        // Run these two sections above ONLY...
        //----------------------------------------------------------
        // OR, just this section below
        
        // variable or constant declaration + initialization
        byte age = 21;
        short xCursor = 45;
        int testScore = 98;
        long cityPopulation = 125000L;
        float salesTaxRate = 0.075F;
        double yearlySalary = 89400.0;
        char gender = 'M';
        boolean isEmpty = false;  
        
    } // end main

} // end class