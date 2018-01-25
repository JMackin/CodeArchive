/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       03/22/14
 *
 * Filename:   SelectionConditional2.java
 *
 * Purpose:    Examples for conditional operator   
 */

import java.util.Scanner;

public class SelectionConditional2 {

	 public static void main(String [] args) {
	 
		  String message = new String();
		  Scanner scan = new Scanner(System.in);
		  int num, absValue;
		  
		  // prompt user for score
		  System.out.print("Enter an integer number: ");
		  num = scan.nextInt();
        

        // print absolute value using if-else
		  if (num > 0) {
		      absValue = num;
		  }
		  else {
		      absValue = -num;
		  }
		  System.out.println("if-else: \tabs = " + absValue);
		  
		  // print absolute value using conditional operator
		  absValue = (num > 0 ? num : -num);
		  System.out.println("conditional: \tabs = " + absValue);
        
        // we probably wouldn't actually write it either of these ways,
        // when we have an easier way
        absValue = Math.abs(num);
        System.out.println("Math.abs(): \tabs = " + absValue);
        
    } // end main
	 	 
} // end class