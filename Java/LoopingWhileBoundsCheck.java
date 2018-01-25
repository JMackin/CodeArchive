/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/30/14
 *
 * Filename:   LoopingWhileBoundsCheck.java
 *
 * Purpose:    Example of do-while to perform bounds checking.
 */
 
public class LoopingWhileBoundsCheck {

    public static void main(String [] args) {

        // declarations
        final int MINVAL = 1;
        final int MAXVAL = 10;
        int num;
        int ntimes = 0;
        String prompt = "Enter a number within the range [" +
                         MINVAL + "-" + MAXVAL + "] > ";
                         
        // loop body
        do {
            if (ntimes == 1) {
                // make the prompt a bit more pointed if repeated
                prompt = "Seriously? " + prompt;
            }
            
            // update read
            num = UtilsFL.readInt(prompt);
            ntimes++;
            
        } while ((num < MINVAL) || (num > MAXVAL));
        
        // closing actions
        if (ntimes == 1) {
            System.out.println("Thanks, you entered " + num);
        }
        else {
            System.out.println("After " + ntimes + " tries, " +
                               "you FINALLY entered: " + num);
        }
           
    } // end main

} // end class

