/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       11/25/14
 *
 * Filename:   SplitSimple2.java
 *
 * Purpose:    Demonstrates string parsing using split()
 */

import java.text.DecimalFormat;

public class SplitSimple2 {

    public static void main(String [] args) {
    
        String item;
        int inventory;
        double price;
        DecimalFormat moneyFmt = new DecimalFormat("$###,###.00");
        String [] data;
        String input;
        
        // this is a string we want to split into tokens
        input = "widget, 30, 2.99";
        data = input.split(",");
        
        // trim off any extra whitespace
        for (int i=0; i<data.length; i++) {
            data[i] = data[i].trim();
        }
        
        // convert data into intended core datatypes
        item = data[0];
        inventory = Integer.parseInt(data[1]);
        price = Double.parseDouble(data[2]);
        
        // demonstrate the tokens are now numeric:
        // what is the value of inventory?
        System.out.println(item + ":\t" + 
                           moneyFmt.format((price * inventory)));
                           
    } // end main

} // end class