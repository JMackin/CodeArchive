/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/28/14
 *
 * Filename:   SelectionNested2.java
 *
 * Purpose:    Example of hybrid nested selection: activities,
 *              depending upon wind/temperature combination
 */

public class SelectionNested2 {

    public static void main(String [] args) {

        // declarations and constants
        final int MAX_WIND = 20;
        final int MAX_TEMP = 80;
        int wind, temp;
        String activity1 = "Suggested activity 1: ";
        String activity2 = "Suggested activity 2: ";
        
        // obtain weather conditions
        wind = UtilsFL.readInt("Enter wind speed [mph]: ");
        temp = UtilsFL.readInt("Enter temperature [deg F]: ");
        
        // determine suggested activity in two ways
        
        // sequential if-else, 4 compound conditions
        if ((wind <= MAX_WIND) && (temp <= MAX_TEMP)) {
            activity1 += "hiking";
        }
        else if ((wind <= MAX_WIND) && (temp > MAX_TEMP)) {
            activity1 += "beach";
        }
        else if ((wind > MAX_WIND) && (temp <= MAX_TEMP)) {
            activity1 += "kite flying";
        }
        else {
            activity1 += "movies";
        }
        System.out.println(activity1);
        
        // nested if-else, 2 levels of single conditions
        if (wind <= MAX_WIND) {
            if (temp <= MAX_TEMP) {
                activity2 += "hiking";
            }
            else {
                activity2 += "beach";
            }
        }
        else {
            if (temp <= MAX_TEMP) {
                activity2 += "kite flying";
            }
            else {
                activity2 += "movies";
            }
        }
        System.out.println(activity2);
                            
    } // end main

} // end class