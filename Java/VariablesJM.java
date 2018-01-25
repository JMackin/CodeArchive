/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      02/24/2015
*
* Filename:  VariablesJM.java
*
* Purpose:   Practice datatypes and declerations.
*/

public class VariablesJM {

  public static void main(String [] args) {
  
  // inputs, constants, declarations, initializations
  final byte ONE_DOZEN = 12;
  boolean lightState = false;
  int zipCode = 95661;
  float paddleBoard = 899.93F;
  int boardStock = 50;
  double dowClose = 18140.44;
  float placerSalesTax = 7.5F;
  char bobsGrade = 'B';
  String bobsName = "Bob Sherman";
  long cornBookIsbn = 9780823422456L;
  byte circleRadius = 5;
  final double PI = Math.PI;
  double circleArea = ( PI * ((circleRadius)^2) );
  
 
  
  // computations, algorithms
  
  // outputs, formatting, display
  System.out.print("One Dozen = " + ONE_DOZEN + "\n");
  System.out.print("The light is on = " + lightState + "\n");
  System.out.print("Zipcode: " + zipCode + "\n");
  System.out.print("Discount Paddleboard at REI: $" + paddleBoard + "\n");
  System.out.print("Number of boards in stock: " + boardStock + "\n");
  System.out.print("Yesterdays DOW closing: " + dowClose + "\n");
  System.out.print("Placer county sales tax: " + placerSalesTax + "%" + "\n");
  System.out.print("Bobs Grade in Csci12: " + bobsGrade + "\n");
  System.out.print("Bobs full name: " + bobsName + "\n");
  System.out.print("ISBN for a book about corn: " + cornBookIsbn + "\n");
  System.out.print("Area of a circle with radius of 5: " + circleArea);
  
  }
  
 }