/*
 * Name:       Rob Lapkass
 *
 * Filename:   MethodExamplesClient.java
 *
 * Course:     CS-12
 *
 * Date:       09/30/14
 *
 * Purpose:    Demonstrates reuse of methods from another file
 *             as object method calls.
 */
 
public class MethodExamplesClient {

    public static void main(String [] args) {
        
        // declarations
        int sum;
        double percent;
        MethodExamples obj = new MethodExamples();
        
        // reuse methods appearing in another file, MethodExamples.java
        sum = obj.addThreeNumbers(10, 20, 30);
        obj.printMessage("   Reuse some useful methods to get:");
        System.out.println("sum = " + sum);
        
        percent = obj.calculatePercent(57, 89);
        obj.printMessage("percentage is:\t" + percent + '%');
        
        // same steps, except wrapped inside one method call
        System.out.println();
        obj.performMultipleSteps();
            
    } // end main
    
} // end class