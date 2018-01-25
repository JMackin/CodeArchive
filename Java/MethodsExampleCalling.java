/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       03/07/15
 *
 * Filename:   MethodsExampleCalling.java
 *
 * Purpose:    Example of CREATING a method, and then CALLING that method.
 *             This example also shows how method calls might be "daisy-chained"
 *             together, such that one method's output is the next method's input.
 *
 *             Notice that EACH method constitutes a "mini program": it has inputs,
 *             calculations, and outputs.
 *
 */
 
public class MethodsExampleCalling {

    public static void main(String [] args) {
        // declarations, initializations
        double input = 5.0;
        double step1, step2;
        
        // calculations
        
        // NOTE: to CALL a method, we just provide the expected datatype data, 
        // we don't need to redeclare it again
        step1 = methodA(input);
        step2 = methodB(step1);
        
        // outputs
        System.out.println("input: " + input + "\tstep1: " + step1 + "\tstep2: " + step2);
        
    } // end main
    
    //------------------------------------------------------------------------
    
    // method A expects a double input, and returns a double output
    public static double methodA(double input) {
        // declarations
        double result;   // this is what we're going to calculate
        
        // calculations
        result = 2 * input;
        
        // outputs
        return result;   // this is the expected double output in: public static DOUBLE... 
    }
    
    //------------------------------------------------------------------------
    
    // method A expects a double input, and returns a double output
    public static double methodB(double input) {
        // declarations
        double result;   // this is what we're going to calculate
        
        // calculations
        result = input + 50;
        
        // outputs
        return result;   // this is the expected double output in: public static DOUBLE... 
    }
    
} // end class