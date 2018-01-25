/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      03/17/2015
*
* Filename:  StringsJM.java
*
* Purpose:   Demonstrates use of String objects.
*/

public class StringsJM {

   public static void main(String [] args) {
  
   // inputs, constants, declarations, initializations
   String Rope, Thread;
   int Air, Water, Earth;
  
   //1
   String myStr = "One, Two, Three, Four, can I have a little more?";
   System.out.println("1) myStr is: " + myStr + "\n");
  
   //2
   System.out.println("2) myStr length: " + myStr.length() + "\n");
   
   //3
   System.out.println("3) First Character of myStr: " + myStr.charAt(0) 
                      + "\n   Last Character: " + myStr.charAt(myStr.length()-1) + "\n");
   
   //4
   System.out.println("4) myStr uppercase: " + myStr.toUpperCase() 
                      + "\n   myStr unaltered original: " + myStr + "\n");
  
   //5
   System.out.println("5) myStr lowercase: " + myStr.toLowerCase() 
                      + "\n   myStr unaltered original: " + myStr + "\n");
                      
   //6
   Air = 17;
   System.out.println("6) myStr character at position " + Air + ": " + myStr.charAt(Air) + "\n");
   
   //7
   Rope = myStr.substring(myStr.indexOf("can"),myStr.length()-1);
   System.out.println("7) substring of myStr: " + Rope + "\n");
   
   //8
   Air = myStr.indexOf(",");
   System.out.println("8) Index of first ',': " + Air + "\n");
   
   //9
   Rope = myStr.substring((Air+1),(myStr.length()-1));
   Water = Rope.indexOf(",") + (Air+1);
   System.out.println("9) Index of second ',': " + Water + "\n");
      
   //10
   Rope = myStr.substring((Water+1),(myStr.length()-1));
   Earth = Rope.indexOf(",") + (Water+1);
   System.out.println("10) Index of third ',': " + Earth + "\n");
   
   
   //11
   Rope = myStr.substring((Water+1),Earth);
   System.out.println("11) myStr substring between 2nd & 3rd ',': " + Rope 
                      + "\n    length of this substring: " + Rope.length() + "\n");
   //12
   Thread = Rope.trim();
   System.out.println("12) myStr substring between 2nd & 3rd ',': " + Thread
                      + "\n    length of this substring: " + Thread.length() + "\n");

  
   }
  
 }