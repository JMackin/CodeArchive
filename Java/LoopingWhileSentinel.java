/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/30/14
 *
 * Filename:   LoopingWhileSentinel.java
 *
 * Purpose:    Example of echoing user input until a sentinel is encounted
 */
 
public class LoopingWhileSentinel {

    public static void main(String [] args) {

        // declarations
        final int SENTINEL = -1;
        String prompt = "Enter integer, or " + 
                         SENTINEL + " to terminate > ";
        int num;
        
        // priming read
        num = UtilsFL.readInt(prompt);
        
        // loop body
        while (num != SENTINEL) {
            System.out.println("You entered: " + num);
            
            // update read
            num = UtilsFL.readInt(prompt);
            
        } // end while
        
        // SENTINEL was encountered
        System.out.println("Termination commanded, goodbye!");
                    
    } // end main

} // end class

