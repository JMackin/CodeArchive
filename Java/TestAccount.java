/*
* Name:      
*
* Course:    
*
* Date:      
*
* Filename:  TestAccount.java
*
* Purpose:   ###
*/

import java.text.DecimalFormat;

public class TestAccount {

  public static void main(String [] args){    
  
    //Variables/declerations
    DecimalFormat df = new DecimalFormat("##.##");
    double monthInt, monthIntRate, wthdrwAmt, depAmt; 
  
    //new account object 'myAccount' 
    Account myAccount = new Account(5648,27000,3.9,"5/3/2015");
  
    //print monthly interest
    monthInt = (myAccount.getMonthlyInterest(myAccount.getAnnIntRate(),myAccount.getBalance()));
    System.out.println("Monthly Interest: $" + (df.format(monthInt)));
    
    //print monthly interest rate
    monthIntRate = (myAccount.getMonthlyInterestRate(myAccount.getAnnIntRate())*100);
    System.out.println("Monthly Interest Rate: " + df.format(monthIntRate) + "%");
    
    //withdraw 7500 from account
    wthdrwAmt = 7500.0;
    myAccount.setBalance(myAccount.withdraw(myAccount.getBalance(),wthdrwAmt));
    
    //print new monthly interest
    monthInt = (myAccount.getMonthlyInterest(myAccount.getAnnIntRate(),myAccount.getBalance()));
    System.out.println("Monthly Interest: $" + df.format(monthInt));
    
    //deposit 11,0000 in to account
    depAmt = 110000.0;
    myAccount.setBalance(myAccount.deposit(myAccount.getBalance(),depAmt));
  
    //print new monthly interest
    monthInt = (myAccount.getMonthlyInterest(myAccount.getAnnIntRate(),myAccount.getBalance()));
    System.out.println("Monthly Interest: $" + df.format(monthInt));
    
  }//end main 
}//end class