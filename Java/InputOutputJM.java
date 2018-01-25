/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      03/24/2015
*
* Filename:  InputOutputJM.java
*
* Purpose:   Demonstration of I/O classes, casting, and formating.
*/

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InputOutputJM {

  public static void main(String [] args) {
  
  //Objects
  Scanner input = new Scanner(System.in);
  DecimalFormat batAvgFrmt = new DecimalFormat(".000");
  DecimalFormat voteFrmt = new DecimalFormat("0.00%");
  
  //1
  System.out.println("1) Enter The following...");
  System.out.print("Player name: ");
  String plyrNme = input.nextLine();
  System.out.print("# of hits: ");
  int hitNum = input.nextInt();
  System.out.print("# of at-bats: ");
  int abatNum = input.nextInt();
    
  float batAvg = (float) hitNum / abatNum;
  
  
  System.out.println("Batting Average for " + plyrNme + ": "
                     + batAvgFrmt.format(batAvg));
  
  
  
  //2
  String numRec = JOptionPane.showInputDialog(null, "# of vote recieved");
  int numRec2 = Integer.parseInt(numRec);
  String numCas = JOptionPane.showInputDialog(null, "# of votes cast");
  int numCas2 = Integer.parseInt(numCas);
  
  double perSup = (double) numRec2 / numCas2;
  
  JOptionPane.showMessageDialog(null, "Votes cast: " + numCas2
                                + "\nVotes recieved: " + numRec2
                                + "\nPecentage of support: " + voteFrmt.format(perSup));
  
  }//end main
  
 }//end class