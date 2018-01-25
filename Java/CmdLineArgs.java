/*
 * Name:				Rob Lapkass
 *
 * Course:        CS-12
 *
 * Date:          05/11/14
 *
 * Filename:		CmdLineArgs.java
 *
 * Purpose:			Prototype for command line arguments
 */        

public class CmdLineArgs {

	 public static void main(String [] args) {
		  
		  System.out.print("there are " + args.length + " cmd line args");
        
        // conditional statement for an (optional) substring
		  System.out.println( ( (args.length > 0) ? ", they are:" : "") );
		  
        for (int i=0; i < args.length; i++) {
		      System.out.println( (i+1) + ": " + args[i]);
		  }
		  
    } // end main
	 	 
} // end class