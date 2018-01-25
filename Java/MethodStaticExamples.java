/*
 * Name:       Rob Lapkass
 *
 * Filename:   MethodStaticExamples.java
 *
 * Course:     CS-12
 *
 * Date:       10/07/14
 *
 * Purpose:    Examples of simple methods to be called elsewhere,
 *             except now they are static methods
 */
 
public class MethodStaticExamples {
    
    // note that this class has no instance variables (data),
    // for now, it's just a collection of methods
    
    // add three integers together
    public static int addThreeNumbers(int num1, int num2, int num3) {
    
        int sum;
        
        sum = num1 + num2 + num3;
        return sum;
    }
    
    // calculate the percentage represented by two ints
    public static double calculatePercent(int num1, int num2) {
    
        double result;
        
        result = (double) num1/num2 * 100.0;
        return result;
    }
    
    // format a string and print it: a header, in this example
    public static void printMessage(String str) {
    
        System.out.println("======================================");
        System.out.println(str);
        System.out.println("======================================");
        
    }
    
    // do all 3 above steps internally inside one method
    // ADDED since initial posting on Canvas
    public static void performMultipleSteps() {
    
        int sum;
        double percent;
        
        sum = addThreeNumbers(10, 20, 30);
        printMessage("Same sum from inside one method: sum = " + sum);
        
        percent = calculatePercent(57, 89);
        printMessage("Same sum from inside one method: percent = " + percent + "%");
        
    }

} // end class