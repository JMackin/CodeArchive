/*
 * Name:       Rob Lapkass
 *
 * Filename:   MethodsStillMoreEfficient.java
 *
 * Course:     CS-12
 *
 * Date:       02/24/15
 *
 * Purpose:    Classroom examples of simple Java methods    
 */

public class MethodsStillMoreEfficient {

    public static void main(String [] args) {
   
        // data declarations
        double r;
        
        // data initialization, computation, display
        // (same variables get reused, by reordering statements)
        r = 1.0;
        displayCircle(r);
               
        r = 2.0;
        displayCircle(r);
        
        r = 3.0;
        displayCircle(r);
        
        r = 4.6;
        displayCircle(r);
        
        r = 5.8;
        displayCircle(r);
                        
    } // end main
    
    //----------------- utility methods -------------------
    
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
    
    // display one circle's properties (radius and area)
    public static void displayCircle(double radius) {
    
        // data declaration and calculation
        double area = calculateArea(radius);
    
        // output display, nothing gets returned
        System.out.println("r = " + radius + ", area = " + area);
        
        return;
        
    } // end displayCircle
        
} // end class