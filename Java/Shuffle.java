import java.util.Scanner;

public class Shuffle {
  
  public static void main(String[] args){
    
    String input = getInput();
    
    System.out.println(input);
    
 }
 
  public static String getInput(){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter list...");
    
    String list = scan.next();
    
    return list;
  
  }
 
}