/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       09/18/14
 *
 * Filename:   OperatorsShortcut.java
 *
 * Purpose:    Examples of using the shortcut operators.
 */
 
public class OperatorsShortcut {

    public static void main(String [] args) {
   
        // data declarations and initializations
        int var1 = 10;
        int var2 = 10;
        int var3 = 10;
        int var4 = 10;
            
        // computations, algorithms
      
        // outputs
        System.out.println("Before: var1 = " + var1);
        System.out.println("During: var1 = " + ++var1);
        System.out.println("After:  var1 = " + var1);
        System.out.println();

        System.out.println("Before: var2 = " + var2);
        System.out.println("During: var2 = " + var2++);
        System.out.println("After:  var2 = " + var2);
        System.out.println();

        System.out.println("Before: var3 = " + var3);
        System.out.println("During: var3 = " + --var3);
        System.out.println("After:  var3 = " + var3);
        System.out.println();

        System.out.println("Before: var4 = " + var4);
        System.out.println("During: var4 = " + var4--);
        System.out.println("After:  var4 = " + var4);
        System.out.println();
                 
        // when used alone in a statement, there is NO difference  
        System.out.println("Before: var1 = " + var1);
        ++var1;
        System.out.println("After:  var1 = " + var1);
        System.out.println();

        System.out.println("Before: var2 = " + var2);
        var2++;
        System.out.println("After:  var2 = " + var2);
        System.out.println();

        System.out.println("Before: var3 = " + var3);
        --var3;
        System.out.println("After:  var3 = " + var3);
        System.out.println();

        System.out.println("Before: var4 = " + var4);
        var4--;
        System.out.println("After:  var4 = " + var4);
        System.out.println();
        
    } // end main

} // end class

