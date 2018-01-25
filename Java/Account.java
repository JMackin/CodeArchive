/*
* Name:      
*
* Course:    
*
* Date:      
*
* Filename:  Account.java
*
* Purpose:   ###
*/

public class Account {

  //Instance Variables
  private int id;
  private double balance;
  private double annualInterestRate;
  private String dateCreated;
  
  //Constructors
  public Account(){
    id = 0;
    balance = 0;
    annualInterestRate = .05;
    dateCreated = "1/1/2000";
  }
  
  public Account(int id, double balance, double annualInterestRate, String dateCreated) {
    this();
    setId(id);
    setBalance(balance);
    setAnnIntRate(annualInterestRate);
    this.dateCreated = dateCreated;
  } //-----end Constructors
  
  //Accessors and Mutators
  //Setters
  public void setId(int id){
    this.id = id;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public void setAnnIntRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }
  
  //Getters
  public int getId(){
    return id;
  }
  public double getBalance(){
    return balance;
  }
  public double getAnnIntRate(){
    return annualInterestRate;
  }
  public String getDateCreated(){
    return dateCreated;
  }//-----end Accessors & Mutators
  
  //Instance Methods  
  //Return Monthly Interest RATE based on annual interest rate
  public double getMonthlyInterestRate(double annualInterestRate){
    double monthlyInterestRate = ((annualInterestRate/12)/100);
    return monthlyInterestRate;
  }
  
  //return monthly interest based on annual interest rate and current balance
  public double getMonthlyInterest(double annualInterestRate, double balance){
    double monthlyInterestRate = getMonthlyInterestRate(annualInterestRate);
    double monthlyInterest = (balance * monthlyInterestRate);
    return monthlyInterest;
  }
  
  //Withdraw method
  public double withdraw(double balance, double wthdrwAmt){
    if ((balance - wthdrwAmt) < 0){
      System.out.print("Insufficient Funds\n");
      return balance;
      }
    else if (wthdrwAmt <= 0){
      System.out.print("Please enter a positive amount to be withdrawn\nBalance: ");
      return balance;
      }
      balance -= wthdrwAmt;
      System.out.println("Withdrew: $" + wthdrwAmt);      
      return balance; 
    }
    
  //Deposit method  
  public double deposit(double balance, double depAmt){
    if (depAmt <= 0){
      System.out.println("Please enter a positive amount to be deposited\nBalance: ");
      return balance;
    }
    balance += depAmt;
    System.out.println("Deposited: $" + depAmt);
    return balance;
  }//-----end Instance methods
  
 }//end class