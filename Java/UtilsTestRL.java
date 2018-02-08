/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       04/14/15
 *
 * Filename:   UtilsTestRL.java
 *
 * Purpose:    Test program for age algorithm correctness of PRGM19
 *             (instructor-provided).
 *             A series of test birthdates are provided, along with
 *             the expected age, and age results compared against expected.
 *
 *             INSTRUCTIONS: Do global replace of utility class name:
 *              in jGRASP: Edit: Find/Replace
 *              change UtilsJM ==> your Utils class name
 *             Then run this program and inspect pass/fail results.
 *             Do not make any other changes to this file - it must run as-provided!
 */
 
public class UtilsTestRL {

    public static void main(String [] args) {
    
        
        // declarations
        SimpleDate bd, ref, now;
        int month, day, year;
        String label;
        
        // date initializations
        bd = new SimpleDate();
        ref = new SimpleDate();
        now = UtilsJM.today();    // won't change
    
        // program output header
        System.out.println("======================");
        System.out.println("age calcs test program");
        System.out.println("======================");
        
        // test for birthdays BEFORE current date
        System.out.println("Birthdays BEFORE current date:");
        
            // day before (won't work on 1st)
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay()-1, 1986);
            test1(bd, 29);
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay()-1, UtilsJM.today().getYear());
            test1(bd, 0);
        
            // prior month, early day
            bd.setDate(2, 1, 1980);
            test1(bd, 35);
            bd.setDate(1, 9, 2015);
            test1(bd, 0);            
            
            // prior month, late day
            bd.setDate(1, 30, 1990);
            test1(bd, 25);
            bd.setDate(3, 29, 2015);
            test1(bd, 0);
            
            // this month, earlier day
            bd.setDate(4, 10, 1930);
            test1(bd, 85);
            bd.setDate(4, 3, 2015);
            test1(bd, 0);
           
        // test for birthdays AFTER current date
        System.out.println("\nBirthdays AFTER current date:");
            
            // tomorrow (won't work on last day)
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay()+1, 1986);
            test1(bd, 28);
            
            // future month, early day
            bd.setDate(11, 9, 2001);
            test1(bd, 13);
            bd.setDate(10, 12, 1964);
            test1(bd, 50);
            
            // future month, late day
            bd.setDate(12, 31, 2004);
            test1(bd, 10);
            bd.setDate(9, 14, 2014);
            test1(bd, 0);
        
        // test for birthdays ON current date
        System.out.println("\nBirthdays ON current date:");
        
            // today, prior year
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay(), 1986);
            test1(bd, 29);
            
            // today, born today
            bd = UtilsJM.today();
            test1(bd, 0);
            
            // millenials
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay(), 1990);
            test1(bd, 25);
            
            // baby boomers
            bd.setDate(UtilsJM.today().getMonth(), UtilsJM.today().getDay(), 1963);
            test1(bd, 52);
        
        // test for future dates
        System.out.println("\nBirthdays in FUTURE:");
        System.out.println("==> error message to user **generated by getAge()** must display for EACH future date\n");
        
            // tomorrow
            bd = UtilsJM.today();
            bd.nextDay();
            test1(bd, -1);
            
            // future date this month
            bd.setDate(4, 30, 2015);
            test1(bd, -1);
        
            // future month this year, early date
            bd.setDate(5, 1, 2015);
            test1(bd, -1);
            
            // future month this year, late date
            bd.setDate(10, 31, 2015);
            test1(bd, -1);
            
            // future year, early month
            bd.setDate(2, 15, 2018);
            test1(bd, -1);
            
            // future year, late month
            bd.setDate(11, 9, 2016);
            test1(bd, -1);
            
        // test age on milestone dates
        System.out.println("\nBirthdays on future milestone dates:");
        
            // George Washington 300th
            bd.setDate(2, 22, 1732);
            ref.setDate(2, 22, 2032);
            test2(bd, ref, 300, "George Washington 300th");
            ref.setDate(2, 21, 2032);
            test2(bd, ref, 299, "George Washington 300th, day before");            
        
            // instructor 65th
            bd.setDate(7, 18, 1963);
            ref.setDate(7, 18, 2028);
            test2(bd, ref, 65, "instructor 65th");
            ref.setDate(7, 17, 2028);
            test2(bd, ref, 64, "instructor 65th, day before");    
            
    } // end main
    
    //-----------------------------------------------------------------------------
    
    // test the single-input age form with a BD and an expected age
    public static void test1(SimpleDate bd, int expectedAge) {
    
        // test the 1-input form (age as of TODAY)
        int age = UtilsJM.getAge(bd);
        
        // display test results
        System.out.println("bd: " + bd + 
                           "\tas of: " + UtilsJM.today() +
                           "\tage: " + age +
                           "\texpected: " + expectedAge +
                           "\tpass: " + (age==expectedAge ? true : false));
    } // end test1

    // test the two-input age form with a BD, milestone date, and an expected age
    public static void test2(SimpleDate bd, SimpleDate ref, int expectedAge, String text) {
    
        // test the 2-input form (age as of some reference date)
        int age = UtilsJM.getAge(bd, ref);
        
        // display test results
        System.out.println("bd: " + bd + 
                           "\tas of: " + ref +
                           "\tage: " + age +
                           "\texpected: " + expectedAge +
                           "\tpass: " + (age==expectedAge ? true : false) +
                           "\t" + text);
    } // end test2
    
} // end class