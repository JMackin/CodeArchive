/*
 * Name:       Rob Lapkass   
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   SelectionSwitchNumbers.java
 *
 * Purpose:    Demonstrate usage of switch with numeric cases
 */
 
public class SelectionSwitchNumbers {

    public static void main(String [] args) {
    
        String message;
        int num;
        
        // prompt for user input
        num = UtilsFL.readInt("Enter a number from 1-4: ");
             
        // switch #1: demonstrate nominal case
        switch (num) {
            case 1:
                message = "one";
                break;
                
            case 2:
                message = "two";
                break;
                
            case 3:
                message = "three";
                break;
            
            case 4:
                message = "four";
                break;
                            
            default:
                message = "???";
                break;
                
        } // end switch 1
        System.out.println("num = " + message);
        
        
        // switch #2: demonstrate stacked cases
        switch (num) {
            case 1:
            case 3:
                System.out.println("num is odd");
                break;
            
            case 2:
            case 4:
                System.out.println("num is even");
                break;
                
            // no default case this time
        } // end switch 2
        
        
        // switch #3: demonstrate using an expression
        switch (num % 2) {
            case 0:
                message = "is even";
                break;
            case 1:
                message = "is odd";
                break;
        } // end switch 3
        System.out.println(num + " " + message);
        
    } // end main
    
} // end class