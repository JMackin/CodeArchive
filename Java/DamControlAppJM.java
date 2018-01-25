/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      05/24/2015
*
* Filename:  UtilsJM.java
*
* Purpose:   Dam control app - DamArray
*/

import java.io.IOException;

public class DamControlAppJM{
    
       public static void main(String [] args) throws IOException {
   
      //Declerations
      String disMenu = "\nCA DAM CONTROL APP \n" +
                       "------------------------------------\n" +
                       "[N]     Add new dam from cmd line\n" +
                       "[A]     Add new random dam\n" +
                       "[F]     Add new dams from file\n" +
                       "[U]     Update parameters of dam\n" +
                       "[X]     Clear all dams from array\n" +
                       "------------------------------------\n" +
                       "[O]     Print overall array usage\n" +
                       "[S]     Print summary of all dams\n" +
                       "[D]     Print details of one dam\n" +
                       "[H]     Print overall water health\n" +
                       "------------------------------------\n" +
                       "[R]     Release water from a dam\n" +
                       "[I]     Import water to a dam\n" +
                       "[M]     More outflow from a dam\n" +
                       "[K]     Less outflow from a dam\n" +
                       "------------------------------------\n" +
                       "[Q]     Quit\n";
                           
      
      char aChar;
      boolean gui = false;
      boolean quit = false;
      boolean badChar =false;
      DamArrayJM dams = new DamArrayJM(10);
      
      //Repeat menu prompt until escape character is entered
      while (quit != true) {
     
        System.out.print(disMenu);
        aChar = UtilsJM.readChar("Enter an option:  ",gui, badChar);
        badChar = false;
        
        
        
        //Begin Switch 
        switch (aChar) {
        
          case 'n':
          case 'N':
              dams.addDamFromUser();
            break;
          
          case 'a':
          case 'A':
              dams.addDamRandom();
            break;
          
          case 'f':
          case 'F':
              
              dams.addDamFromFile();
              break;
            
          
          case 'u':
          case 'U':
              dams.updateDam();
              break;          
          
          case 'x':
          case 'X':
              dams.clearDams();
              break;
                   
          case 'o':
          case 'O':
              dams.print();
            break;
            
          case 's':
          case 'S':
              dams.printDamsSummary();
            break;
          
          case 'd':
          case 'D':
              dams.printDamDetails();
            break;
          
          case 'h':
          case 'H':
              dams.printDamsWaterHealth();
            break;
              
          case 'r':
          case 'R':
              dams.releaseWater();
            break;
              
          case 'i':
          case 'I':
              dams.importWater();
            break;
              
          case 'm':
          case 'M':
              dams.increaseOutflow();
            break;
              
          case 'l':
          case 'L':
              dams.reduceOutflow();
            break;
              
          case 'q':
          case 'Q':
            quit = true;
            break;
              
          default:
            badChar = true;
             
        } //end switch
                    
      }// end while
               
   }//end main
   
  /* 
   //Small method for formatting output
   public static String box (String length) {
     
     String box = "";
     int end = length.length();
     for (int i = 0; i <= end; i++) {
       box += "#";
     }     
     box = "\n" + box + "\n" + length + "\n" + box;    
     return box;
   }
       */
       
}//end class

