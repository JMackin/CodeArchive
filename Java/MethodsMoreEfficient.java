/*
 * Name:       Rob Lapkass
 *
 * Filename:   MethodsMoreEfficient.java
 *
 * Course:     CS-12
 *
 * Date:       02/20/14
 *
 * Purpose:    Classroom examples of simple Java methods    
 */

public class MethodsMoreEfficient {

    public static void main(String [] args) {
   
        // data declarations
        double r1, area1;
        double r2, area2;
        double r3, area3;
        double r4, area4;
        double r5, area5;
        
        // data initializations
        r1 = 1.0;
        r2 = 2.0;
        r3 = 3.0;
        r4 = 4.6;
        r5 = 5.8;
            
        // computations, algorithms
        area1 = calculateArea(r1);
        area2 = calculateArea(r2);
        area3 = calculateArea(r3);
        area4 = calculateArea(r4);
        area5 = calculateArea(r5);
      
        // outputs, display
        System.out.println("r = " + r1 + ", area = " + area1);
        System.out.println("r = " + r2 + ", area = " + area2);
        System.out.println("r = " + r3 + ", area = " + area3);
        System.out.println("r = " + r4 + ", area = " + area4);
        System.out.println("r = " + r5 + ", area = " + area5);
            
    } // end main
    
    // calculate the area of a circle, given the radius
    public static double calculateArea(double radius) {
    
        // data declarations
        final double PI = 3.1415927;
        double area;
        
        // computations
        area = PI * radius * radius;
        
        // outputs
        return area;
    
    } // end calculateArea
        
} // end class