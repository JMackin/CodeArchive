/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       02/21/15
 *
 * Filename:   OperatorsMixedTypes.java
 *
 * Purpose:    Simple illustration of mixed type calculations
 *             using implicit casting 
 */
 
public class OperatorsMixedTypes {

    public static void main(String [] args) {
   
        // data declaration/initialization
        int qty = 10;
        float retailPrice = 2.99F;   
        double salePrice;
        
        // calculations
        
        //   the following implicit casting takes place
        //   1) float x int --> float (RHS)
        //   2) double (LHS) <-- float (RHS)
        salePrice = retailPrice * qty;
        
        // outputs
        System.out.println("The sale price of " + qty +
                           " items which retail for $" + retailPrice +
                           " is:\n$" + salePrice);
                    
    } // end main

} // end class

