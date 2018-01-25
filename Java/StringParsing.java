/*
 * Name:       Rob Lapkass
 *
 * Filename:   StringParsing.java
 *
 * Course:     CS-12
 *
 * Date:       10/02/14
 *
 * Purpose:    Simple demonstration of string parsing and
 *             extraction of a particular substring
 */
 
public class StringParsing {

    public static void main(String [] args) {
    
        // objective: extract tigers as TIGERS
        
        // declarations
        String inStr = new String("lions, tigers, bears, oh my");
        int loc1, loc2;
        char sepChar = ',';
        String tigerStr;
        
        // find the delimiters (the substring bounds)
        loc1 = inStr.indexOf(sepChar);
        loc2 = inStr.indexOf(sepChar, loc1+1);
        
        // extract the substring, clean it up, upper case it
        tigerStr = inStr.substring(loc1+1, loc2);
        
        // clean up the extracted substring
        tigerStr = tigerStr.trim();
        
        // convert the string to upper case
        tigerStr = tigerStr.toUpperCase();
        
        // output the string and its length, to be certain it's right
        System.out.println("substring: " + tigerStr + 
                           "\nlength: " + tigerStr.length());
              
    } // end main

} // end class