/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      02/18/2015
*
* Filename:  UsefulClassesJM.java
*
* Purpose:   ###
*/

import java.util.Scanner;
import java.util.Random;

public class UsefulClassesJM {

  public static void main(String [] args) {
  
  //Declare & Initialize
  Scanner input = new Scanner(System.in);
  Random rand = new Random();
  
  System.out.print("Enter minimum number: ");
  int min = input.nextInt();
  System.out.print("Enter maximum number: ");
  int max = input.nextInt();
  rand.nextInt();
  
  //1
  int doe = rand.nextInt(max - min + 1) + min;
  int ray = rand.nextInt(max - min + 1) + min;
  int mee = rand.nextInt(max - min + 1) + min;
  int fah = rand.nextInt(max - min + 1) + min;
  
  System.out.println("1) Boundary values: min = " + min + " max = " + max
                     + "\n   Random object values: " + doe + " " + ray
                     + " " + mee + " " + fah + "\n");
  
  //2                   
  int small = Math.min(fah,(Math.min(mee,(Math.min(doe,ray)))));
  int large = Math.max(fah,(Math.max(mee,(Math.max(doe,ray)))));
  System.out.println("2) Smallest random int: " + small
                     + "\n   Largest random int: " + large);
  
  //3
  System.out.print("\n3) Enter two leg lengths of a right triangle\n   1> ");
  int leg1 = input.nextInt();
  System.out.print("   2> ");
  int leg2 = input.nextInt();
    
  double hyp = Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2));
  System.out.println("   Hypotenuse: ~" + Math.round(hyp));
  
  //4
  double rad = 1.5;
  System.out.print("\n4) Sphere Radius: " + rad);
  double vol = (4 / 3) * (Math.PI) * (Math.pow(rad,3));
  System.out.print("\n   Sphere Volume: ~" + Math.round(vol) + " cubic units");
  
  }
  
 }