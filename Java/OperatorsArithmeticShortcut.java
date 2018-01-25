/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       09/18/14
 *
 * Filename:   OperatorsArithmeticShortcut.java
 *
 * Purpose:    Examples of using the arithmetic shortcut operators.
 */
 
public class OperatorsArithmeticShortcut {

    public static void main(String [] args) {
   
        // data declarations and initializations
        int intVar1 = 10;
        int intVar2 = 20;
        int intVar3 = 30;
        int intVar4 = 40;
        int intVar5 = 50;
        double dblVar1 = 10.1;
        double dblVar2 = 20.2;
        double dblVar3 = 30.3;
        double dblVar4 = 40.4;
            
        // computations, outputs
        
        System.out.println("Before: intVar1 = " + intVar1);
        intVar1 += 3;
        System.out.println("After:  intVar1 = " + intVar1);
        System.out.println();

        System.out.println("Before: intVar2 = " + intVar2);
        intVar2 -= 10;
        System.out.println("After:  intVar2 = " + intVar2);
        System.out.println();

        System.out.println("Before: intVar3 = " + intVar3);
        intVar3 *= 4;
        System.out.println("After:  intVar3 = " + intVar3);
        System.out.println();

        System.out.println("Before: intVar4 = " + intVar4);
        intVar4 /= 7;
        System.out.println("After:  intVar4 = " + intVar4);
        System.out.println();
                 
        System.out.println("Before: intVar5 = " + intVar5);
        intVar5 %= 10;
        System.out.println("After:  intVar5 = " + intVar5);
        System.out.println();
        
        // these operators work for floating point types, also
        // (modulus rreally doesn't make sense here)

        System.out.println("Before: dblVar1 = " + dblVar1);
        dblVar1 += 3.1;
        System.out.println("After:  dblVar1 = " + dblVar1);
        System.out.println();

        System.out.println("Before: dblVar2 = " + dblVar2);
        dblVar2 -= 10.1;
        System.out.println("After:  dblVar2 = " + dblVar2);
        System.out.println();

        System.out.println("Before: dblVar3 = " + dblVar3);
        dblVar3 *= 4.1;
        System.out.println("After:  dblVar3 = " + dblVar3);
        System.out.println();

        System.out.println("Before: dblVar4 = " + dblVar4);
        dblVar4 /= 7.1;
        System.out.println("After:  dblVar4 = " + dblVar4);
        System.out.println();
                 
    } // end main

} // end class

