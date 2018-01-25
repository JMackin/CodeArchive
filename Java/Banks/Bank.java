
/**
 * John Mackin
 * 08/25/15
 * CSCI 13
 * Bank.Java
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private BankAccount [] array;
    private int x;
    private final int MAX_SIZE = 10;

    
    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
     array = new BankAccount[MAX_SIZE];
     x = 0;
    }
    
    //Adds an account to bank array
    public void addAccount(BankAccount account)
    {
        array[x] = account;
        x++;
        
    }
    
    //prints all accounts in array
    public void printAccounts(){
      String print = "";
      for (int i =0; i < x; i++){
        System.out.println(array[i].toString());
      }
    
    }
    
    //adds monthly fee to all accounts in array
    public void monthlyFee(){
      Double fee = 2.95;
      for (int i = 0; i < x; i++){
        array[i].adjust(fee);
      }
    }
    

}//end class
