/*
 * Name:       Rob Lapkass
 *
 * Filename:   SimpleDateUsage.java
 *
 * Course:     CS-12
 *
 * Date:       09/30/14
 *
 * Purpose:    An example which exercises the SimpleDate API
 *
 */

public class SimpleDateUsage {

   public static void main( String [] args ) {
	
      // declarations
		int day, month, year;
      boolean result1, result2, result3;
      
	   // declarations and initializations
      // using both full AND default constructors
      // this is how we CREATE new SimpleDate objects
      SimpleDate independenceDay = new SimpleDate(7, 4, 1776);
      SimpleDate myBirthday      = new SimpleDate(7, 18, 2015);
      SimpleDate defaultDate     = new SimpleDate();
		
		// print current dates explicitly 
      // (use API toString() method call)
      System.out.println("Print date objects explicitly using toString():");
		System.out.println("Independence Day is " + independenceDay.toString());
		System.out.println("My next BD is: " + myBirthday.toString());
		System.out.println("Default SimpleDate is " + defaultDate.toString());
      System.out.println("");  // blank line in output
      
      // print a date implicitly
      // (just pass object, its toString() gets automatically used)
      System.out.println("Print date objects implicitly without using toString():");
		System.out.println("Independence Day is " + independenceDay);
		System.out.println("My next BD is: " + myBirthday);
		System.out.println("Default SimpleDate is " + defaultDate);
      System.out.println("");  // blank line in output
      
		// reset default date and print:
		defaultDate.setDate(10, 31, 2015);
		System.out.println("Next Halloween is " + defaultDate.toString());
		
		// up date by two months and print
		defaultDate.setMonth(12);
		System.out.println("Modified defaultDate: " + defaultDate.toString());
      System.out.println(); // blank line in output
		
		// extract just individual fields and print
      // note that entire RHS expression evaluates to a variable of the indicated type
      month = independenceDay.getMonth();
      System.out.println("month = " + month);
      
		day = independenceDay.getDay();
      System.out.println("day = " + day);
      
      year = independenceDay.getYear();
		System.out.println("year = " + year);
		
		// advance independence day by 1 day, and print
		independenceDay.nextDay();
		System.out.println("Day after Independence Day is " + independenceDay.toString());
      
      // output separator
      System.out.println("\n--------------------------------------------------\n"); 
      
      // check the equivalence of two dates
      result1 = independenceDay.equals(myBirthday);
      result2 = myBirthday.equals(independenceDay);
      System.out.println("Are Independence Day and my birthday the same? \t" + result1);
      System.out.println("Are Independence Day and my birthday the same? \t" + result2);
      
      result3 = defaultDate.equals(defaultDate);
      System.out.println("defaultDate had better be the same as itself: \t" + result3);
      
   } // end main
   
} // end class
