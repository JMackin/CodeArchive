/**
 * John Mackin
 * 08/25/15
 * CSCI 13
 * BankAccount.Java
 */
public class BankAccount
{
 // instance variables - replace the example below with your own
 String owner;
 int account;
 double balance;

/**
 * Constructor for objects of class BankAccount
 */
 public BankAccount(String o, int a)
 {
 // initialise instance variables
 owner = o;
 account = a;
 balance = 0.0;
 }

/**
 * toString - display bank account information as a string
 *
 */
 public String toString()
 {
 return(owner + " owns the account " + account + " with a balance of $" + balance);
 }

 /**
 * adjust - adjust the balance of an account
 * 
 */
 public void adjust(double amount)
 {
 balance += amount;
 }
 
}//end class