/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2014
 *
 * Date:       11/10/14
 *
 * Filename:   Person.java
 *
 * Purpose:    Step-by-step creation of a Person class
 */
 
public class Person {

    // instance variables ------------
    private String firstName;   // person's first name
    
    // constants ---------------------
    
    // other class data --------------
    
    // data above here
    //===============================================
    // methods below here
    
    // constructors ------------------
    
    // default constructor
    public Person() {
        firstName = "unknown";
    }
    
    // full constructor
    public Person(String firstName) {
        this.firstName = firstName;
    }
    
    // display methods ---------------
    
    // string version of object data
    public String toString() {
        return firstName;
    }
    
    // formatted version of object data
    public void print() {
        System.out.println("firstName:\t" + firstName);
    }
    
    // overloaded version of print, accepts a label string
    public void print(String message) {
        System.out.println("======================");
        System.out.println(message);
        System.out.println("======================");
        print();
    }
    
    // accessors, mutators -----------
    
    // equivalance -------------------
    
    // derived data accessors --------
    
    // utility methods ---------------
        
} // end class