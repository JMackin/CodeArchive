/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingForNested.java
 *
 * Purpose:    Demonstration of nested for loops,
 *             resulting in a lower triangular shape of numbers.
 *             This one sums the gifts given in The 12 Days of Christmas.
 */
 
public class LoopingForNested {

    public static void main(String [] args) {
    
        // gifts given during The Twelve Days of Christmas
        int sum = 0;
        final int DAYS = 12;
        
        // outer loop: loops over all the days
        for (int day=1; day<=DAYS; day++) {
            
            // inner loop loops over the gifts on one day,
            // in song order (N to 1)
            for (int gift=day; gift>=1; gift--) {
                // print the gifts and tally them
                System.out.print(gift + " ");
                sum += gift;
            }
            System.out.println();   // newline after each day
        }
        
        // Report the total gift-giving aftermath
        System.out.println("Total gifts given: " + sum);
            
    } // end main

} // end class