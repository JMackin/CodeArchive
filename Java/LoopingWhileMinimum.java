/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/01/14
 *
 * Filename:   LoopingWhileMinimum.java
 *
 * Purpose:    Example demonstrating while loop minimum finding
 */
 
public class LoopingWhileMinimum {

    public static void main(String [] args) {
   
        // declarations
        final int SENTINEL = -1;
        int score;
        int min;  // notice we initialize this later to FIRST score
        String prompt = "Enter test score, or -1 to finish: ";
        
        // priming read
        score = UtilsFL.readInt(prompt);
        
        // set initial minimum to FIRST test score (not 0)
        min = score;
        
        // loop until SENTINEL value is encountered
        while (score != SENTINEL) {
            
            // passes check?
            if (score < min) {
                min = score;
            }
            
            // update read
            score = UtilsFL.readInt(prompt);
        }
        
        System.out.println("Minimum of test scores is: " + min);
                    
    } // end main

} // end class

