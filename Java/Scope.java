/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/23/14
 *
 * Filename:   Scope.java
 *
 * Purpose:    Examples of variable scope within methods and a class
 */
 
public class Scope {

    // visible to entire class and all methods,
    // but not visible externally
    private double scaleFactor = 0.50;
    
    public double addTwo(int numOne, int numTwo) {
        // visible only internal to this method
        double result;
        
        result = (numOne + numTwo) * scaleFactor;
        return result;
    }
    
    public double subTwo(int numOne, int numTwo) {
        // visible only internal to this method
        double result;
        
        result = (numOne - numTwo) * scaleFactor;
        return result;
    }
    
} // end class

