/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/18/14
 *
 * Filename:   OperatorsArithmetic.java
 *
 * Purpose:    Examples of using operators
 */
 
public class OperatorsArithmetic {

    public static void main(String [] args) {
    
        // data declarations and initialization
        double lunchItem = 5.99;
        double softDrink = 1.89;
        double lunchPrice;
        
        int currentYear = 2015;
        int birthYear = 1963;
        int age;
        int daysAlive;   // does not account for leap years
        
        double miles, gallons, mpg;
        
        // constants
        final double PLACER_SALES_TAX = 0.075;
        final int DAYS_PER_YEAR = 365;
        
        // notice: if we want to REUSE variables (and we can do this),
        // we may want to intersperse print statements, rather than 
        // all of them at the end
        
        // computations, outputs
        
        // lunch calcs
        lunchPrice = lunchItem + softDrink;
        System.out.println("Lunch w/o tax costs: \t$" + lunchPrice);
        
        lunchPrice = lunchPrice * (1.0 + PLACER_SALES_TAX);
        System.out.println("Lunch with tax costs: \t$" + lunchPrice);
        
        // age calcs
        age = currentYear - birthYear;
        daysAlive = age * DAYS_PER_YEAR;
        
        System.out.println("Current age:\n" + age);
        System.out.println("Days alive (approx.):\n" + daysAlive);
        
        // mileage calcs
        miles = 272.4;
        gallons = 12.521;
        mpg = miles / gallons;
        System.out.println("miles: " + miles +
                           "\t gallons: " + gallons +
                           "\t mpg: " + mpg);
        
                
    } // end main

} // end class