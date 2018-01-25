/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-123
 *
 * Date:       10/23/13
 *
 * Filename:   LoopingForIntervalOutput.java
 *
 * Purpose:    Demonstrate spaced output with for loops
 */

import java.text.DecimalFormat;

public class LoopingForIntervalOutput {

    public static void main(String [] args) {
    
        // one decimal place accuracy
        DecimalFormat temps = new DecimalFormat("##0.0");
    
        // temperature table range and delta
        final char DEGS = 0x00B0;
        int minTempF = 50;
        int maxTempF = 100;
        int delTempF = 5;
        
        // print headers
        System.out.println(DEGS + "F\t" + DEGS + "C");
        
        // do this for each row of the table
        for (int t=minTempF; t<=maxTempF; t+=delTempF) {
        
            // method call on each loop iteration
            double tempC = convertF2C(t);
            
            // print data in 2-column F/C format
            System.out.println(temps.format(t) + "\t" + 
                               temps.format(tempC));
        }
              
    } // end main
    
    // convert temperature from Fahrenheit to Celsius
    private static double convertF2C(double tempF) {
        double tempC;
        tempC = (5.0/9.0) * (tempF - 32);
        return tempC;
        
    } // end convertF2C

} // end class