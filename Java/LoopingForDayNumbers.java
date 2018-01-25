/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       04/10/14
 *
 * Filename:   LoopingForDayNumbers.java
 *
 * Purpose:    Example of using nested loops and switch 
 *             to print numerical dates of the year from 1-365.
 *             This example also flags several special dates.
 *
 *             This example demonstrates:
 *              for looping
 *              switch
 *              if-else if
 *              nesting (nested for, switch, if-else)
 *
 *             This example requires: SimpleData.java
 */
 
public class LoopingForDayNumbers {

    public static void main(String [] args) {
    
        // data needed
        SimpleDate date;
        int year, maxDays, count;
        final int DAYS_IN_YEAR = 365;
        
        // initializations
        year = 2015;
        count = 0;
        maxDays = 0;
        
        // some special days to be flagged
        SimpleDate christmas    = new SimpleDate(12, 25, year);
        SimpleDate instructorBD = new SimpleDate(7, 18, year);
        SimpleDate wifeBD       = new SimpleDate(10, 12, year);
        SimpleDate lastDay      = new SimpleDate(5, 20, year);
        SimpleDate endSemester  = new SimpleDate(5, 22, year);

        
        // loop over months
        for (int month=1; month<=12; month++) {
        
            // figure out days in a month
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDays = 31;
                    break;
                
                case 2:
                    maxDays = 28;
                    break;
                    
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDays = 30;
                    break;
            }
            
            // loop over days within a given month
            for (int day=1; day<=maxDays; day++) {
                date = new SimpleDate(month, day, year);
                System.out.print(++count + ":\t" + date);
                
                //-----------------------
                // flag some special days
                //-----------------------
                
                // mark the halfway point of the year
                if (count == (DAYS_IN_YEAR/2)+1) {
                    System.out.println("  <=== MIDWAY POINT");
                }
                
                // Christmas
                else if (date.equals(christmas)) {
                    System.out.println("  <=== CHRISTMAS");
                }
                
                // instructor's BD
                else if (date.equals(instructorBD)) {
                    System.out.println("  <=== INSTRUCTOR'S BD");
                }
                
                // wife's BD
                else if (date.equals(wifeBD)) {
                    System.out.println(" <=== WIFE'S BD");
                }
                
                // last day of class
                else if (date.equals(lastDay)) {
                    System.out.println(" <=== LAST DAY OF CLASS");
                }
                
                // end of semester
                else if (date.equals(endSemester)) {
                    System.out.println(" <=== END OF SEMESTER");
                }
                
                // all other days
                else {
                    System.out.println();
                }
                
            }
            System.out.println();
            
        }
            
    }

}