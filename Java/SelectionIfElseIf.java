/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/23/14
 *
 * Filename:   SelectionIfElse.java
 *
 * Purpose:    Examples for if-elseif selection
 *             This example uses UtilsFL.java statically for user inputs 
 */

public class SelectionIfElseIf {

	 public static void main(String [] args) {
	 
		  String message = new String();
		  int age;
		  
		  // prompt user for age
		  age = UtilsFL.readInt("Enter your age: ");
		  
		  // determine age-specific category
        // note that ages are mutually exclusive,
        //  earlier ones weed out ages for later ones
		  if (age < 13) {
		      message = "just a kid!";
		  }
		  else if (age < 18) {
		      message = "uh-oh, a teenager";
		  }
		  else if (age < 30) {
		      message = "time for college";
		  }
		  else if (age < 50) {
		      message = "time for a mortgage";
		  }
		  else if (age < 70) {
		      message = "how's the 401(K)?";
		  }
		  else {
		      message = "the golden years";
		  }

        // print demographic message
		  System.out.println(message);
		  
    } // end main
	 	 
} // end class