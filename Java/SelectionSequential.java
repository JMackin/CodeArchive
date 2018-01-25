/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   SelectionSequential.java
 *
 * Purpose:    Example of hybrid sequential selection: largest of 3 numbers
 */
 
public class SelectionSequential {

    public static void main(String [] args) {
   
        // declarations
        int num1, num2, num3;
        int largest;
        
        // inputs
        num1 = UtilsFL.readInt("Enter integer #1: ");
        num2 = UtilsFL.readInt("Enter integer #2: ");
        num3 = UtilsFL.readInt("Enter integer #3: ");
        
        // find largest one
        
        // find largest of the first two
        if (num1 > num2) {
            largest = num1;
        }
        else {
            largest = num2;
        }
        
        // this step depends upon the prior step
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("largest number is: " + largest);
            
    } // end main

} // end class