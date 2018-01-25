/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/31/14
 *
 * Filename:   LoopingWhileAccumulation.java
 *
 * Purpose:    Example demonstrating while loop accumulation
 */
 
public class LoopingWhileAccumulation {

    public static void main(String [] args) {
   
        // declarations
        final int SENTINEL = -1;
        int num;
        int sum = 0;
        String prompt = "Enter a number to be summed, or -1 to finish: ";
        
        // priming read
        num = UtilsFL.readInt(prompt);
        
        // loop until SENTINEL value is encountered
        while (num != SENTINEL) {
            sum += num;
            // update read
            num = UtilsFL.readInt(prompt);
        }
        
        System.out.println("The sum is: " + sum);
                    
    } // end main

} // end class

