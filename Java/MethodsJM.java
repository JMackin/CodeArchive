	/*
 * Name:       John Mackin
 *
 * Course:     CS-12, Spring 2015
 *
 * Date:      03/09/2015
 *
 * Filename:   MethodsJM.java
 *
 * Purpose:    Experimentation with methods.
 */
 
import java.util.Scanner;
  
public class MethodsJM {
 
    // required main method of the class
    public static void main(String [] args) {
    
        performTemperatureConversion();
        System.out.println();  // blank line
        performCurrencyConversion();
                     
    } // end main
     
    // (no changes needed above this point)
    //--------------------------------------------------------------
    // (write the following methods)
     
    //--------------------------------------------------------------
     
    // write method to perform temperature conversion...
    private static void performTemperatureConversion() {
     
        // use 3 of the other 4 methods to get data, convert, print
        double tempF, tempVar;
        String inPut; 
        tempF = getUserInput("Enter temperature in F: ");
        tempVar = tempConvert(tempF);
        inPut = tempF + " deg F is " + tempVar + " deg C ";
        outPut(inPut);
     
    }
     
    //--------------------------------------------------------------
     
    // write method to perform currency conversion...
    private static void performCurrencyConversion() {
    
        // use 3 of the other 4 methods to get data, convert, print
        double curDol, curVar;
        String inPut;
        curDol = getUserInput("Enter currency in USD: ");
        curVar = curConvert(curDol);
        inPut = "$" + curDol + " is " + curVar + " Euros.";
        outPut(inPut);
    }
     
    //--------------------------------------------------------------
     
    // write method to obtain an input double value (use Scanner)...
    private static double getUserInput(String userIn) {
     
      Scanner input = new Scanner(System.in);
      double someVar;
       
      System.out.print(userIn);
      someVar = input.nextDouble();
       
      return someVar;
     
    }
    
     
    //--------------------------------------------------------------
     
    // write method to print an input string inside a formatted box...
    public static String outPut(String inPut) {
    
    System.out.print("------------------------------\n");
    System.out.print(inPut); 
    System.out.print("\n------------------------------");
    return "";
       
    }
     
    //--------------------------------------------------------------
     
    // write method to convert F to C...
    public static double tempConvert (double tempResult) {
    
    tempResult = (((tempResult - 32) * 5) / 9);
    return tempResult;
    
    }
     
    //--------------------------------------------------------------
     
    // write method to convert $ to Euros...
    public static double curConvert (double curResult) {
    
    curResult *= 0.92;
    return curResult;
    
    }
     
 
} // end class
