/*
 *CS 235 Fall 2019 Assignment 1
 * John Mackin
 * 10/03/10
 **/

public class CookeryFanTest
{
  
  public static void main(String[] args)
  {

   CookeryFan cf = new CookeryFan("John","Mackin","jlm1455@humboldt.edu",true);
   CookeryFan cf2 = new CookeryFan("Bob","Ligmabalz","liggymcnumnums@humboldt.edu",false);
   CookeryFan cf3 = new CookeryFan("Sally","mcboogerbams","duhdoiiii@humboldt.edu",true);
   
    System.out.println("Printing cookeryfan isntances using toString() method...\n\n");
    System.out.println(cf2.toString());
    System.out.println(cf.toString());
    System.out.println(cf3.toString());
    
    System.out.println("\n\nPrinting cookeryfan isntances using accessor() methods...\n");
    
    System.out.println("CookeryFan instance 1:\n");
    System.out.println(cf.getFName());
    System.out.println(cf.getLName());
    System.out.println(cf.getEmail());
    System.out.println(cf.recievesEmail());
    System.out.println(cf.idNum());
    System.out.println(cf.getYear());
    
    System.out.println("CookeryFan instance 2:\n");
    System.out.println(cf2.getFName());
    System.out.println(cf2.getLName());
    System.out.println(cf2.getEmail());
    System.out.println(cf2.recievesEmail());
    System.out.println(cf2.idNum());
    System.out.println(cf2.getYear());
    
    System.out.println("CookeryFan instance 3:\n");
    System.out.println(cf3.getFName());
    System.out.println(cf3.getLName());
    System.out.println(cf3.getEmail());
    System.out.println(cf3.recievesEmail());
    System.out.println(cf3.idNum());
    System.out.println(cf3.getYear());
  }
  
}