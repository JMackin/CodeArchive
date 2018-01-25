/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/21/14
 *
 * Filename:   OperatorsRelational.java
 *
 * Purpose:    Examples of various relational operators  
 */
 
public class OperatorsRelational {

	 public static void main(String [] args) {
	 
        // declarations
        int age = 21;
        final int MIN_AGE = 21;
        boolean c1, c2, c3, c4;
        
        // relational operators
        c1 = (age <  MIN_AGE);
        c2 = (age <= MIN_AGE);
        c3 = (age >  MIN_AGE);
        c4 = (age >= MIN_AGE);
        
        System.out.println("c1 = " + c1);	
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        	  
    } // end main
	 	 
} // end class