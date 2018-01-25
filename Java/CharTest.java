public class CharTest {

   public static void main(String args[]) {
   
      //Declerations
      String disMenu = "\nFOR-LOOPING DEMO \n" +
                       "[S]     Start Value\n" +
                       "[I]     Increment value\n" +
                       "[E]     End Value\n" +
                       "[F]     For Looping\n" +
                       "[G/C]   GUI/CMD input\n" +
                       "[Q]     Quit\n";
                           
      String sequence = "";               
      char aChar;
      int sVar = 1;
      int eVar = 10;
      int iVar = 1;
      boolean gui = false;
      boolean quit = false;
      boolean badChar =false;
   
      while (quit != true) {
      
      System.out.print(disMenu);
      aChar = UtilsJM.readChar("Enter an option:  ",gui, badChar);
        
         
        switch (aChar) {
        
          case 's':
            sVar = UtilsJM.readInt("Enter start value: ",gui);
              if (sVar < -1000) { System.out.println(box("Enter larger value!")); break;}
            badChar = false;
            break;
          
          case 'i':
            iVar = UtilsJM.readInt("Enter incrimental value: ",gui);
            badChar = false;
            break;
          
          case 'e':
            eVar = UtilsJM.readInt("Enter end value: ",gui);
              if (eVar > 1000) { System.out.println(box("Enter smaller value!")); break;}
            badChar = false;
            break;
          
          case 'f':
            badChar = false;
            
            if (sVar <= eVar && iVar >= 1) {
                    
              for (int i = sVar; i <= eVar; i+= iVar) {
                sequence += i + " ";
              }
            }
            else if (sVar >= eVar && iVar <= -1) {
            
              for (int i = sVar; i>= eVar; i -= iVar) {
                sequence += i + " ";
              }  
            }
            else {
            
              System.out.println(box("That's an impossible sequence!"));
              
              break;
            }
            
            System.out.println(box(sequence));
            
            break;          
          
          case 'q':
            quit = true;
            badChar = false;
            break;
                   
          case 'g':
            gui = true;
            badChar = false;
            break;
            
          case 'c':
            gui = false;
            badChar = false;
            break;
          
          case 'x':
            badChar = false;
            break;
          
          default:
            badChar = true;
             
        } //end switch
                    
      }// end while
               
   }//end main
   
   
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
}//end class