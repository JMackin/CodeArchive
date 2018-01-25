/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   ComparingNumbers.java
 *
 * Purpose:    Example file for Java numerics
 */       

public class ComparingNumbers {

	 public static void main(String [] args) {
	 
	     final double TOL = 0.0001;
		  double d1 = 0.0;            // running sum for addition
		  double d2 = 0.0;            // running sum for multiplication
		  int n = 10;
		  boolean test1, test2;
		  
		  d1 = 0.0;
		  
		  // this is a for loop, which we will cover soon
		  // for now, this is a compact way of adding 0.1 N times
		  for (int i=1; i<=n; i++) {
		      d1 += 0.1;
		  }
		  d2 = 0.1 * n;
		  
		  test1 = (d1 == d2);
		  test2 = (Math.abs(d1 - d2) < TOL);
		  
        // compare results of adding 10x and multiplying x10, same??
		  System.out.println("n=" + n + "  d1=" + d1 + "  d2=" + d2);
		  System.out.println( "test1 (equality) : " + (test1 ? "equal" : "not equal") );
        System.out.println( "test2 (tolerance): " + (test2 ? "equal" : "not equal") );
		  
    } // end main
	 	 
} // end class