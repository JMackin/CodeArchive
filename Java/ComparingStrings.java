/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   ComparingStrings.java
 *
 * Purpose:    Exmples of String comparisons
 */
 
public class ComparingStrings {

    public static void main(String [] args) {
   
        String str1 = new String("Hello World");     
        String str2 = new String("Hello World");
        String str3 = new String("Hello world");
        
        // equality comparisons
        System.out.println("str1 == str2\t\t\t" + (str1 == str2));
        System.out.println("str1 == str3\t\t\t" + (str1 == str3) + "\n");
        
        // equals comparisons
        System.out.println("str1.equals(str2)\t\t" + str1.equals(str2));
        System.out.println("str1.equals(str3)\t\t" + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3)\t" + str1.equalsIgnoreCase(str3) + "\n");
        
        // lexicographical comparisons
        System.out.println("str1.compareTo(str2)\t\t" + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3)\t\t" + str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str3)\t" + str1.compareToIgnoreCase(str3));

        
    } // end main

} // end class