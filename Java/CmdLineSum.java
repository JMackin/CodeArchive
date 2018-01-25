/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       05/07/15
 *
 * Filename:   CmdLineSum.java
 *
 * Purpose:    Demonstrates summing up data from the command line,
 *              use jGRASP args dialog
 */
 
public class CmdLineSum {

    public static void main(String [] args) {
   
        double sum = 0.0;
        int count = 0;
        
        // loop over all input arguments, if any
        for (int i=0; i < args.length; i++) {
            // intercept any non-number exceptions
            try {
                count++;   // up the count
                sum += Double.parseDouble(args[i]);
            }
            catch (NumberFormatException nfe) {
                count--;   // reverse the count, if needed
            }
        } // end for
        
        // echo total of numeric input arguments
        System.out.println("The sum of the " + count + 
                           " (good) inputs is: " + sum);
                    
    } // end main

} // end class