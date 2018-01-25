/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       11/17/14
 *
 * Filename:   PersonDataCorruption.java
 *
 * Purpose:    Illustrates a potential problem with PersonPhase8
 *             passing an object reference into a class method 
 */
 
public class PersonDataCorruption {

    public static void main(String [] args) {
   
        Person p = new Person();
        SimpleDate date = new SimpleDate(11, 17, 2014);
        String name = new String("Fred");
        
        // update the Person with the given date and name
        p.setBirthdate(date);
        p.setFirstName(name);
        
        // Person has been updated 
        p.print("before");
        
        // Now the outside client changes the SimpleDate and String
        date.setDate(12, 25, 2014);
        name = new String("Anne");
        
        // Uh-oh! The object's private data has changed w/o permission
        // BUT, the String is OK: strings are "immutable" in Java
        p.print("after");
                          
    } // end main

} // end class

