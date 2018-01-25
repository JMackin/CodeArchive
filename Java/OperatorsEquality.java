/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/21/14
 *
 * Filename:   OperatorsEquality.java
 *
 * Purpose:    Examples of various equality operators, including for strings.  
 */
 
public class OperatorsEquality {

	 public static void main(String [] args) {
	 
        // declarations
        int age = 21;
        final int MIN_AGE = 21;
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str2;
        boolean c1, c2, c3, c4, c5;
        
        // equality operator expressions
        c1 = (age == MIN_AGE);
        c2 = (age != MIN_AGE);
        c3 = (str1 == str2); // compares object refs, not data
        c4 = (str3 == str2); // compares object refs, not data
        c5 = (str1.equals(str2));
        
        System.out.println("c1 = " + c1);	
        System.out.println("c2 = " + c2);
        System.out.println();
        System.out.println("c3 = " + c3);    // these point to different data
        System.out.println("c4 = " + c4);    // these point to the same data
        System.out.println("c5 = " + c5);    // now we are comparing string data, not addresses
                
    } // end main
	 	 
} // end class