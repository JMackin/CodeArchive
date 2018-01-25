/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       11/25/14
 *
 * Filename:   SplitSimple1.java
 *
 * Purpose:    Demonstrates string parsing using split()
 */

public class SplitSimple1 {

    public static void main(String [] args) {
    
        String [] data;
        String input;
        
        // this is the data from an earlier assignment
        input = "One, two, three, four, can I have a little more?";
        data = input.split(",");
        
        // trim it and print it as tokens
        for (int i=0; i<data.length; i++) {
            System.out.println( (i+1) + "\t" + data[i].trim());
        }
        
    } // end main

} // end class

