/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/16/14
 *
 * Filename:   Unicode.java
 *
 * Purpose:    Examples of Unicode formatting and display  
 */

public class Unicode {

    public static void main(String [] args) {
    
        // Unicode characters
        char euro1 = '\u20AC';    // Euro symbol as a Unicode variable literal
        char euro2 = 0x20AC;      // Euro symbol as a Unicode variable hex literal
        
        System.out.println("as a char variable literal: \t\t" + euro1);
        System.out.println("as a char variable hex constant: \t" + euro2);
        System.out.println("in a string literal: \t\t\t\u20AC");
        
    }

}