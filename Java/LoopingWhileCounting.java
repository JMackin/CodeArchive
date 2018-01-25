/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/01/14
 *
 * Filename:   LoopingWhileCounting.java
 *
 * Purpose:    Example demonstrating while loop counting
 */
 
public class LoopingWhileCounting {

    public static void main(String [] args) {
   
        // declarations
        final int SENTINEL = -1;
        int num;
        int count = 0;
        String prompt = "Enter a number > 0 to be counted, or -1 to finish: ";
        
        // priming read
        num = UtilsFL.readInt(prompt);
        
        // loop until SENTINEL value is encountered
        while (num != SENTINEL) {
            
            // passes check?
            if (num > 0) {
                count++;
            }
            
            // update read
            num = UtilsFL.readInt(prompt);
        }
        
        System.out.println("Count of numbers > 0: " + count);
                    
    } // end main

} // end class

