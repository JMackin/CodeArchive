/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       03/22/14
 *
 * Filename:   SelectionConditional1.java
 *
 * Purpose:    Examples for conditional operator 
 */
 
import java.util.Scanner;

public class SelectionConditional1 {

	 public static void main(String [] args) {
	 
		  String message = new String();
		  Scanner scan = new Scanner(System.in);
		  int score;
		  
		  // prompt user for score
		  System.out.print("Enter score: ");
		  score = scan.nextInt();


        // print message using if-else
		  if (score >= 70) {
		      message = "pass!";
		  }
		  else {
		      message = "fail!";
		  }
		  System.out.println("if-else: " + message);
		  
        
		  // print same message using conditional operator
		  message = (score >= 70 ? "pass!" : "fail!");
		  System.out.println("conditional: " + message);
        
    } // end main
	 	 
} // end class