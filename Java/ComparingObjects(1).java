/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   ComparingObjects.java
 *
 * Purpose:    Example of comparing two SimpleDate objects,
 *              adapted from textbook example of same name. 
 */
 
public class ComparingObjects {

    public static void main(String [] args) {
   
        // set up several new objects
        SimpleDate d1 = new SimpleDate(4, 10, 2006);
        SimpleDate d2 = new SimpleDate(4, 10, 2006);
        SimpleDate d3 = d1;
        SimpleDate d4 = new SimpleDate(12, 1, 2006);
        
        // simple equality comparisons: point to same memory?
        System.out.println("d1 == d2\t" + (d1 == d2));
        System.out.println("d1 == d3\t" + (d1 == d3)); 
        System.out.println("d1 == d4\t" + (d1 == d4)); 
        
        // content equality comparisions: content equal?
        System.out.println("d1.equals(d2)\t" + d1.equals(d2));
        System.out.println("d1.equals(d3)\t" + d1.equals(d3));
        System.out.println("d1.equals(d4)\t" + d1.equals(d4));     
                   
    } // end main

} // end class