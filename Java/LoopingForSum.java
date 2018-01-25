/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingForSum.java
 *
 * Purpose:    Example of summing N numbers
 */
 
public class LoopingForSum {

    public static void main(String [] args) {
   
        // declarations
        int max;
        int total = 0;
        int num;
        
        // determine max limit
        max = UtilsFL.readInt("Enter how many numbers to sum: ");
        
        // sum numbers 1 to max
        for (int i=1; i<=max; i++) {
            num = UtilsFL.readInt("Enter number: ");
            total += num;
        }
        
        // display the final total
        System.out.println("The sum of these " + max + 
                           " numbers is: " + total);
                    
    } // end main

} // end class