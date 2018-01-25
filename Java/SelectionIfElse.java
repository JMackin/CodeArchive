/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/23/14
 *
 * Filename:   SelectionIfElse.java
 *
 * Purpose:    Examples for if-else selection
 *             This example uses UtilsFL.java statically for user inputs
 */
 
public class SelectionIfElse {

    public static void main(String [] args) {
   
        // data initializations
        int score;
        boolean status;
        final int PASSING_SCORE = 70;
        
        String passMessage = "You passed, you da man!";
        String failMessage = "You didn't pass, keep trying";
        String message = new String();
        
        // read input using utility method statically
        // encapsulates details of setting up Scanner/JOptionPane
        score = UtilsFL.readInt("Enter test score: ");
        
        // decide outcome and set flag
        if (score >= PASSING_SCORE) {
            status = true;
        }
        else {
            status = false;
        }
        
        // a boolean flag by itself can represent a condition
        // a bit contrived, but just to illustrate a point
        if (status) {
            message = passMessage;
        }
        else {
            message = failMessage;
        }
        System.out.println(message);
        
    } // end main

} // end class
