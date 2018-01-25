import java.util.Scanner;

public class DPHoldEm {

   public static void main(String [] args){
   
   Scanner in = new Scanner(System.in);
   
   String input = in.next();
   
   double foo = Character.getNumericValue(input.charAt(0));
   
   double bar = 0;
   
   
   for (int i = 0; i < input.length(); i++){
   
   bar = Math.pow((Character.getNumericValue(input.charAt(i))), 2);
   
   System.out.println(bar);
   }
   
   System.out.println(bar);
   
   }//end main
 }//end class