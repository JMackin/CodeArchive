/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      04/19/2015
*
* Filename:  AgeClientJM.java
*
* Purpose:   Main method for age calculation
*/


public class AgeClientJM {

  public static void main(String [] args) {
  
      //declerations and objects
      int bdMonth, bdDay, bdYear, usrAge;
      boolean gui = false; // <--- False for CL input, True for GUI input
      SimpleDate usrBday = new SimpleDate();
      
      
  
      //prompt for and assign birthday date
      bdMonth = UtilsJM.readInt("Enter Your birth month: ",true);
      bdMonth = UtilsJM.readInt("Enter Your birth month: ",false);
      usrBday.setMonth(bdMonth);
    
      bdDay = UtilsJM.readInt("Enter your birth day: ",gui);
      usrBday.setDay(bdDay);
    
      bdYear = UtilsJM.readInt("Enter your birth year: ",gui);
      usrBday.setYear(bdYear);
    
      System.out.println("");
      
      //calculate and display age
      usrAge = UtilsJM.getAge(usrBday);
    
      System.out.println("Your birthday: " + usrBday);
      System.out.println("Your Age: " + usrAge + " years old");
  
  
  }//end main
  
 }//end class