/*
 * Name:       Rob Lapkass
 *
 * Filename:   MethodStaticExamplesClient.java
 *
 * Course:     CS-12
 *
 * Date:       10/07/14
 *
 * Purpose:    Demonstrates reuse of methods from another file
 *             as object method calls.
 *             However, now all method calls are static.
 */
 
public class MethodStaticExamplesClient {
    
    public static void main(String [] args) {
        
        // declarations
        int sum;
        double percent;
                
        // reuse methods appearing in another file, MethodStaticExamples.java
        sum = MethodStaticExamples.addThreeNumbers(10, 20, 30);
        MethodStaticExamples.printMessage("   Reuse some useful methods to get:");
        System.out.println("sum = " + sum);
        
        percent = MethodStaticExamples.calculatePercent(57, 89);
        MethodStaticExamples.printMessage("percentage is:\t" + percent + '%');
        
        // same steps, except wrapped inside one method call
        System.out.println();
        MethodStaticExamples.performMultipleSteps();
            
    } // end main
    
} // end class