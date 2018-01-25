/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/07/14
 *
 * Filename:   MathExamples.java
 *
 * Purpose:    Examples of using the Math class
 */

public class MathExamples {

    public static void main(String [] args) {
    
        // declarations
        double num1, num2, result;
        int int1, int2, int3, smallest, answer;
                       
        // Math constants
        System.out.println();
        System.out.println("pi = " + Math.PI);
        System.out.println("natural log e = " + Math.E);
        
        // Math methods
        num1 = -15.0;
        result = Math.abs(num1);
        System.out.println("| " + num1 + " | = " + result);
        
        result = Math.log(Math.E);
        System.out.println("log e(" + Math.E + ") = " + result);
        
        num1 = 100.0;
        result = Math.sqrt(num1);
        System.out.println("sqrt(" + num1 + ") = " + result);
        
        num1 = 2.0;
        num2 = 8.0;
        result = Math.pow(num1, num2);
        System.out.println(num1 + "^" + num2 + " = " + result);
        
        num1 = 12.8;
        result = Math.round(num1);
        System.out.println("round(" + num1 + ") = " + result);
        
        num1 = 12.2;
        result = Math.round(num1);
        System.out.println("round(" + num1 + ") = " + result);
        
        num1 = 57.8;
        num2 = 67.2;
        result = Math.max(num1, num2);
        System.out.println("max(" + num1 + ", " + num2 + ") = " + result);
        
        int1 = 100;
        int2 = 93;
        answer = Math.min(int1, int2);
        System.out.println("min(" + int1 + ", " + int2 + ") = " + answer);
      
        // smallest of 3 numbers, in stages
        int1 = 50;
        int2 = 49;
        int3 = 48;
        smallest = Math.min(int1, int2);
        smallest = Math.min(smallest, int3);
        System.out.println("smallest of " + int1 + " " + int2 + " " + int3 + 
                           " is: " + smallest);
                           
        // smallest of 3 numbers, nested
        int1 = 50;
        int2 = 49;
        int3 = 48;
        smallest = Math.min(Math.min(int1, int2), int3);
        System.out.println("smallest of " + int1 + " " + int2 + " " + int3 + 
                           " is: " + smallest);
   }

}