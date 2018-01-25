/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       03/06/15
 *
 * Filename:   MethodsExampleNested.java
 *
 * Purpose:    Example of an application shell having nested methods,
 *             similiar to what's needed on a Methods assignment.
 *
 *             These are the simplest possible methods (0-inputs, 0-outputs)
 *             Adapt them to the method interfaces needed.
 *
 */
 
public class MethodsExampleNested {

    public static void main(String [] args) {
        method1();
        System.out.println();
        method2();
    } // end main
    
    // first level of nesting -----------------------------------------
    
    // be sure to one-line summarize EVERY method
    public static void method1() {
        System.out.println("method1() is called, details TBD...");
        method3();
        method5();
        method4();
    }

    // be sure to one-line summarize EVERY method
    public static void method2() {
        System.out.println("method2() is called, details TBD..."); 
        method3();
        method6();
        method4(); 
    }
    
    // next level of nesting ------------------------------------------
    
    // be sure to one-line summarize EVERY method
    public static void method3() {
        System.out.println("   method3() is called, details TBD...");
    }

    // be sure to one-line summarize EVERY method
    public static void method4() {
        System.out.println("   method4() is called, details TBD...");    
    }
    
    // be sure to one-line summarize EVERY method
    public static void method5() {
        System.out.println("   method5() is called, details TBD...");
    }

    // be sure to one-line summarize EVERY method
    public static void method6() {
        System.out.println("   method6() is called, details TBD...");    
    }
    
} // end class