/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/04/14
 *
 * Filename:   LoopingForEvens.java
 *
 * Purpose:    Demonstrates loop increment > 1
 *             by printing even numbers 
 */
 
public class LoopingForEvens {

    public static void main(String [] args) {
   
        // initially empty print string
        String printStr = "";

        // assemble and print the evens up to 30
        for (int i=0; i<=30; i+=2) {
            printStr += (i + " ");
        }
        System.out.println(printStr);
              
    } // end main

} // end class