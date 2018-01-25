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
   
    // first name accessor
    public String getFirstName() {
        return firstName;
    }
    
    // first name mutator
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // overloaded mutator version, prompts for data
    public void setFirstName(boolean inputMode) {
        String data = UtilsRL.readString("Enter first name > ", inputMode);
        setFirstName(data);
    }
    
    // equivalance -------------------
    
   // this is the standard interface for equals()
    public boolean equals(Object obj) {
    
        // first, check whether objects of same type
        if (!(obj instanceof Person)) {
            // stop, we aren't comparing apples to apples
            return false;
        }
        
        else {
            // typecast into the intended object types
            Person p = (Person) obj;
            
            // check field-by-field on ALL fields
            if ( (p.getFirstName().equals(this.firstName)) ) {
                return true;
            }
            else {
                return false;
            }
        } 
        
    } // end equals
    
    // derived data accessors --------
    
    // utility methods ---------------
    
    // unit test code ----------------
    
    // test driver for this class
    public static void main(String [] args) {
    
        Person p1 = new Person();
        Person p2 = new Person("Fred");
        
        System.out.println(p1);  // implicit toString()
        p1.print();
        p1.print("Default constructor Person is:");
        System.out.println();
        
        System.out.println(p2);  // implicit toString()
        p2.print();
        p2.print("Full constructor Person is:");
        System.out.println();
        
        // test accessor(s)
        System.out.println("p2 firstName = " + p2.getFirstName());
        System.out.println();
        
        // test mutator(s)
        p2.setFirstName("Dave");
        p2.print("p2 after mutators");
        System.out.println();
        
        p2.setFirstName(false);
        p2.print("p2 after mutator prompts");
        System.out.println();
        
        // test equality
        
        // two different objects should differ
        System.out.println("p1 equals p2? " + p1.equals(p2));
        
        // same object is equal to itself
        System.out.println("p2 equals p2? " + p2.equals(p2));
        
        // a Person can't equal another object
        String temp = new String("junk");
        System.out.println("p2 equals temp? " + p2.equals(temp));
        
    } // end main
        
} // end class