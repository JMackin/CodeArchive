/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      05/24/2015
*
* Filename:  UtilsJM.java
*
* Purpose:   Utilities class - DamArray
*/

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Calendar;    // for date calcs
import java.util.Random;

public class UtilsJM {
     // user input methods, by datatype ------------------------------------------
    
    // get an int value
    public static int readInt(String prompt, boolean guiMode) {
        // TODO: add a second argument for a "guiMode":
        //       if F, get input from Scanner (command line)
        //       if T, get input from JOptionPane (popup GUI)
        
        String notIntError = "That wont work, please enter an integer type number...";
    
        if (guiMode == true) {
        
          //prompt for and parse an input int value
          boolean check = false;
          int data = 0;
          
          while (check == false) {
          
           try {              
              //get int input
              String input = JOptionPane.showInputDialog(null, prompt);
              data = Integer.parseInt(input);
              check = true;
            }
              
            catch (NumberFormatException nfe) {            
              //handles non-integer exceptions
              JOptionPane.showMessageDialog(null,notIntError);
            }                         
          }
          return data;
        }
                
        else {        
          // set up data and objects
          Scanner input = new Scanner(System.in);
          int data;
          String trash;
        
          // prompt for an input int value
          System.out.print(prompt);
        
          // verify integer data type
          while ( !input.hasNextInt() ) {        
            trash = input.nextLine();
            System.out.println(notIntError);
            System.out.print(prompt);
        
          }
        
          data = input.nextInt();
        
          return data;
         }
    } //end get int value
    
    
    //get a char value
    public static char readChar(String prompt, boolean guiMode, boolean badChar) {
    
      //Declerations
      char data = 'x';
      String badCharError = "That won't work, please enter a different character...";
      
      //GUI mode
      if (guiMode == true) {
      
        //bad char flag check
        if (badChar == true) {
          JOptionPane.showMessageDialog(null,badCharError);        
        } 
        
        //get input & catch exception caused by clicking cancel in gui-mode   
        try {
          String input = JOptionPane.showInputDialog(null, prompt);
          input = input.toLowerCase();
          data = input.charAt(0);
          return data;
        }
        catch (NullPointerException npe){data = 'q'; }
        catch (StringIndexOutOfBoundsException siobe) { }
        return data; 
             
      }//end if        
      
      //CMD line mode
      else {
        
        //bad char flag check
        if (badChar == true) {
          System.out.println(badCharError);        
        }        
        //get input
        Scanner input = new Scanner(System.in);    
        System.out.print(prompt);
        data = input.next().toLowerCase().charAt(0);
        
        return data;
      }      
    }// end get char
    
    //Reads and returns Double type number
    public static double readDouble(String prompt, boolean guiMode){
      String notDoubError = "That wont work, please enter an double type number...";
      if (guiMode == true){
        boolean check = false;
        
        while (check == false) {
          
          try {              
            //get int input
            String input = JOptionPane.showInputDialog(null, prompt);
            double data = Double.parseDouble(input);
            check = true;
          }
              
          catch (NumberFormatException nfe) {            
            //handles non-integer exceptions
            JOptionPane.showMessageDialog(null,notDoubError);
          } 
          
        }//end while
      }
      else{
        Scanner input = new Scanner(System.in);
        double data;
        String notDoubleError = "Error: please enter a number of type Double";
        String trash;
      
        System.out.println(prompt);     
      
        while (!input.hasNextDouble()){
          trash = input.nextLine();
          System.out.println(notDoubleError);
          System.out.println(prompt);        
        }
        
      data = input.nextDouble();
      return data;
      }
        return 0;
    }//end get double
    
    //Read and return string (NOTE only reads first word)    
    public static String readString (String prompt){
      Scanner input = new Scanner(System.in);
      String data;
    
      System.out.println(prompt);
      data = input.next();
      return data;
    
    }//end get string
    
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
        
        //Declerations and assignments
        int dayBd, monthBd, yearBd, dayRef, monthRef, yearRef, usrAge;        
        dayBd = dateBd.getDay();
        monthBd = dateBd.getMonth();
        yearBd = dateBd.getYear();    
        dayRef = dateRef.getDay();
        monthRef = dateRef.getMonth();
        yearRef = dateRef.getYear();
        
        
        //Age algorithm
         
        usrAge = yearRef - yearBd;
        
        if (((monthBd > monthRef) || (monthBd == monthRef) && (dayBd > dayRef)) && (yearBd <= yearRef)) {       
        
          usrAge -= 1;
          
          if (usrAge <= -1) {
          
            usrAge = -1;
            System.out.println("Error: The entered date has not yet come to pass!"); 
            return usrAge;
            }
          
          return usrAge;
        }
        
        else if (usrAge <= -1) { 
        
            usrAge = -1;
            System.out.println("Error: The entered date has not yet come to pass!"); 
            return usrAge; 
        }              
        
         else {
         
           return usrAge;
       
       } //end age algorithm 
        
    } // end 2-input version
    
    public static int randomInt(int minVal, int maxVal){
        Random rand = new Random();
        int randInt = 0;
        
        randInt = rand.nextInt(maxVal - minVal + 1) + minVal;
        
        return randInt;
    }
    
    public static String randomString(int length){
        
        String randString = "abcdefghijklmnopqrstuvwxyz";
        String rNewStr = "";
        int rs;
        Random rand = new Random();
        
        for (int i = 0; i < length; i++){
            rs = rand.nextInt(25);
            
            rNewStr += randString.charAt(rs);
        }
        
        
        
        return rNewStr;
    }
    
    
}//end class
