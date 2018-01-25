/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       02/24/14
 *
 * Filename:   MethodExampleTrapezoid.java
 *
 * Purpose:    This example demonstrates creating a simple method,
 *             here calculating the area ofa trapezoid.
 */
 
public class MethodExampleTrapezoid {

    public static void main(String [] args) {
    
        double base, top, height, area;;
        
        base = 10;
        top = 8;
        height = 2;
        area = calculateTrapezoidArea(base, top, height);
        
        System.out.println("base = " + base +
                           "\ttop = " + top +
                           "\theight = " + height +
                           "\ntrapezoid area = " + area);
     
    } // end main
    
    // this method calculates the area of a trapezoid, given its dimensions
    public static double calculateTrapezoidArea(double b1, double b2, double h) {
    
        double area;
        area = ((b1 + b2) * h) / 2;
    
        return area;
        
    } // end method

} // end class

