/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/23/14
 *
 * Filename:   SelectionScope.java
 *
 * Purpose:    Examples of variable scope within if structures
 */
 
public class SelectionScope {

    public static void main(String [] args) {
    
        // declarations
        final int PASS_MINIMUM = 60;
        int grade;
        //char letterGrade;
        
        // obtain input from user
        grade = UtilsFL.readInt("Enter numerical test score: ");
        
        // display outcome
        if (grade >= PASS_MINIMUM) {
            char letterGrade = 'P';
        }
        else {
            letterGrade = 'F';
        }
        System.out.println("Your grade is: " + letterGrade);
            
    } // end main

} // end class
