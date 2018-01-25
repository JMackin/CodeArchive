/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/07/14
 *
 * Filename:   WrapperExamples.java
 *
 * Purpose:    Examples of using wrapper classes to convert String data
 */

import javax.swing.JOptionPane;  // for GUI dialog input

public class WrapperExamples {

   public static void main(String [] args) {
   
      // declarations
      String str, strSalary;
      int num;
      double salary, raisePct;
            
      // here we are performing string concatenation
      str = "55";
      System.out.println("string " + str + "+" + str + " = " + (str + str));
      
      // but here, we are actually performing the intended addition
      num = Integer.parseInt(str);
      System.out.println("integer " + str + "+" + str + " = " + (num + num));
      
      // wrapper classes are used to convert GUI output strings to numerical data
      strSalary = JOptionPane.showInputDialog(null, "Enter salary:");
      salary = Double.parseDouble(strSalary);    // turn a string into a number
      
      raisePct = 5.0;
      salary *= (1 + (raisePct/100));
      System.out.println("Give yourself a " +  raisePct + "% raise to: " + salary);
      
   }

}