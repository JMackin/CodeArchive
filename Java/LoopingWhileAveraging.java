/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/01/14
 *
 * Filename:   LoopingWhileAveraging.java
 *
 * Purpose:    Example demonstrating while loop averaging
 */

import java.text.DecimalFormat;

public class LoopingWhileAveraging {

    public static void main(String [] args) {
   
        // 2 decimal places, required leading zero
        DecimalFormat fmt = new DecimalFormat("#0.00"); 
        
        // declarations
        final int SENTINEL = -1;
        int score;
        int sum = 0;
        int count = 0;
        double avg;
        String prompt = "Enter test score, or -1 to finish: ";
        
        
        // priming read
        score = UtilsFL.readInt(prompt);
        
        // loop until SENTINEL value is encountered
        while (score != SENTINEL) {
        
            sum += score;
            count++;
            
            // update read
            score = UtilsFL.readInt(prompt);
        }
        
        avg = (double) sum/count;
        System.out.println("Average of " + count + 
                           " scores is: " + fmt.format(avg));
                    
    } // end main

} // end class

