/*
 * Name:       Rob Lapkass
 *
 * Filename:   Formats.java
 *
 * Course:     CS-12
 *
 * Date:       10/07/13
 *
 * Purpose:    Code prototypes for String formatting 
 */
 
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Formats {

    public static void main(String [] args) {
    
        // batting average formats (percentages)
        DecimalFormat batAvgFormatDF = new DecimalFormat("0.000");
        DecimalFormat batAvgFormatDF2 = new DecimalFormat("##%");
        NumberFormat batAvgFormatNF = NumberFormat.getPercentInstance();
        
        // currency formats (currency)
        DecimalFormat usdFormatDF = new DecimalFormat("$###,###.00");
        NumberFormat usdFormatNF = NumberFormat.getCurrencyInstance();
        DecimalFormat jpyFormatDF = new DecimalFormat("###,###,###.00" +
                                                      "\u00A5");
        
        // spy formats (leading zeroes)
        DecimalFormat spyFormatDF = new DecimalFormat("000");
        
        // program data and constants
        final double PLACER_SALES_TAX = 0.075;
        final double FOREX_USD_TO_JPY = 98.4045;
        
        // program data
        int hits = 100;
        int atBats = 300;
        float batAvg;
        double carPrice = 34587.85;
        double totalPrice, totalPriceYen;
        int spyEmployeeId;
        String spyName;
        
        
        // batting average
        batAvg = (float) hits/atBats;
        System.out.println("batting average: " + batAvg + 
                           "   " + batAvgFormatDF.format(batAvg) +
                           "   " + batAvgFormatDF2.format(batAvg) +
                           "   " + batAvgFormatNF.format(batAvg));
        
        // total cost in USD
        totalPrice = (1.0 + PLACER_SALES_TAX) * carPrice;
        System.out.println("\ncar price: " + carPrice);
        System.out.println("price with tax: " + totalPrice +
                           "   " + usdFormatDF.format(totalPrice) +
                           "   " + usdFormatNF.format(totalPrice));
        // total cost in JPY
        totalPriceYen = totalPrice * FOREX_USD_TO_JPY;
        System.out.println("price in JPY: " + totalPriceYen +
                           "   " + jpyFormatDF.format(totalPriceYen));
                           
        // spy IDs
        spyName = new String("James Bond");
        spyEmployeeId = 7;
        System.out.println("\nAgent: " + spyName + "\t" +
                           "ID: " + spyFormatDF.format(spyEmployeeId));
          
    }

}