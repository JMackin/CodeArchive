/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       09/30/14
 *
 * Filename:   ObjectReferences.java 
 *
 * Purpose:    Deomstrate various aspects of object references
 */
public class ObjectReferences {

    public static void main(String [] args) {
    
        SimpleDate today;
        SimpleDate tomorrow;
        
        // dates now have data, one day apart
        today = new SimpleDate(10, 1, 2014);
        tomorrow = new SimpleDate(10, 2, 2014);
        
        System.out.println("today is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // now both dates point to same memory
        today = tomorrow;
        
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // change tomorrow, today will follow along
        tomorrow.setDay(30);
        
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);

        // tomorrow goes away, but today is unchanged
        // this is how we can delete objects (JVM will do garbage collection)
        tomorrow = null;
        
        System.out.println("\ntoday is:\t" + today);
        System.out.println("tomorrow is:\t" + tomorrow);
        
        // this will cause a NullPointerException
        // comment this line out if you want the program to free-run
        tomorrow.nextDay();
    
    }
        
}