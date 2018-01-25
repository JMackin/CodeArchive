/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      03/11/2015
*
* Filename:  SimpleDateClientJM.java
*
* Purpose:   Demonstration of SimpleDate objects.
*/

import java.util.Scanner;

public class SimpleDateClientJM {

   public static void main(String [] args) {
  
   // inputs, constants, declarations, initializations
   Scanner input = new Scanner(System.in);
  
   int Month, Day, Year;
   boolean Result;
   SimpleDate myDate1 = new SimpleDate();
   SimpleDate myDate2 = new SimpleDate();
  
   // 1)
   System.out.println("1) " + myDate1.toString());
   
   // 2)
   System.out.println("2) " + myDate1);
   
   // 3)   
   myDate1.nextDay();
   myDate1.nextDay();
   myDate1.nextDay();
    
   System.out.println("3) " + myDate1);
   
   // 4)
   System.out.println("Enter the day of your birthday: ");
   Day = input.nextInt();
   myDate1.setDay(Day);
   
   System.out.println("Enter the month of your birthday: ");
   Month = input.nextInt();
   myDate1.setMonth(Month);
   
   System.out.println("Enter the year of your birthday: ");
   Year = input.nextInt();
   myDate1.setYear(Year);
   
   System.out.println("4) Your Birthday is " + myDate1 + "\n");
   
   // 5)
   System.out.println("Enter todays calander day: ");
   Day = input.nextInt();
   myDate2.setDay(Day);
   
   System.out.println("Enter todays month: ");
   Month = input.nextInt();
   myDate2.setMonth(Month);
   
   System.out.println("Enter todays year: ");
   Year = input.nextInt();
   myDate2.setYear(Year);
   
   System.out.println("5) Today is " + myDate2 + "\n");
   
   // 6)
   Result = myDate1.equals(myDate2);
   System.out.println("6) Is today your birthday? " + Result + "\n");
   
   //7)
   System.out.println("Enter day of Halloween: ");
   Day = input.nextInt();  
   
   System.out.println("Enter month of Halloween: ");
   Month = input.nextInt();  
   
   System.out.println("Enter year of Halloween: ");
   Year = input.nextInt();
   
   myDate2.setDate(Month, Day, Year);
   
   System.out.println("7) Halloween is on " + myDate2 + "\n");
   
   //8)
   Day = myDate1.getDay();
   Month = myDate1.getMonth();
   Year = myDate1.getYear();
   
   System.out.println("8) My Birthday is on " +
   Month + "-" + Day + "-" + Year);

   }
  
}