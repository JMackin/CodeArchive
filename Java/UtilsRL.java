/*
 * Name:       
 *
 * Course:     
 *
 * Date:       
 *
 * Filename:   
 *
 * Purpose:    Starter CS-12 utilities file.
 *             This class is a collection of useful utility methods
 *              which are called statically:    UtilsRL.method()
 *
 *             THIS FILE RELIES UPON SimpleDate.java IN LOCAL DIRECTORY
 */
import java.util.Scanner;
import java.util.Calendar;    // for date calcs

public class UtilsRL {

    // user input methods, by datatype ------------------------------------------
    
    // get an int value
    public static int readInt(String prompt) {
        // TODO: add a second argument for a "guiMode":
        //       if F, get input from Scanner (command line)
        //       if T, get input from JOptionPane (popup GUI)
    
        // set up data and objects
        Scanner input = new Scanner(System.in);
        int data;
        
        // prompt for an input int value
        System.out.print(prompt);
        data = input.nextInt();
        
        return data;
    }
    
    // date-related methods -----------------------------------------------------
    
    // returns today's date as a SimpleDate
    public static SimpleDate today() {
    
        // set up objects
        Calendar todayCal = Calendar.getInstance();
        SimpleDate todayDate = new SimpleDate();
        
        // transfer today's M/D/Y into the new SimpleDate
        todayDate.setDate(todayCal.get(Calendar.MONTH) + 1,  // for some reason, a needed offset
                          todayCal.get(Calendar.DATE),
                          todayCal.get(Calendar.YEAR));
        return todayDate;
    }
    
    // age-related methods ------------------------------------------------------
    
    // returns the age as of the current date (overloaded form, no changes needed)
    public static int getAge(SimpleDate dateBd) {
        int age;
        SimpleDate dateToday = today();
        
        // calls overloaded version of same method
        age = getAge(dateBd, dateToday);  
        return age;
        
    } // end 1-input version
    
    // returns the age as of some reference date (overloaded form, MODS NEEDED)
    public static int getAge(SimpleDate dateBd, SimpleDate dateRef) {
        // TODO: calculate the age correctly, given birthdate and reference date
        //       if dateBd is *after* dateRef, return -1 and print an error message
        
        return -1;
        
    } // end 2-input version
            
} // end class