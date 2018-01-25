/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/23/14
 *
 * Filename:   ScopeClient.java
 *
 * Purpose:    Client driver class for Scope class   
 */
 
public class ScopeClient {

    public static void main(String [] args) {
   
        // declarations
        int value1 = 100;
        int value2 = 50;
        double answer;
        Scope obj = new Scope();
        
        // results
        answer = obj.addTwo(value1, value2);
        System.out.println("addTwo(" + value1 + ", " + 
                                       value2 + ") = " + answer); 
                                        
        answer = obj.subTwo(value1, value2);
        System.out.println("subTwo(" + value1 + ", " + 
                                       value2 + ") = " + answer);                   
    } // end main

} // end class

