/* 
 * John Mackin
 * HW 09 - part 2
 * CS 112
 * 12/08/17
 * 
 */

#include <cstdlib>
#include <iostream>


using namespace std;


class Account{
private:
    double balance;
public:
    Account(double initialDeposit)
    {
        balance = initialDeposit;
    }
    double getBalance()
    {
        return balance;
    }
    double deposit(double amount)
    {
        try{
        if(amount > 0)
            balance += amount;
        else
            throw amount;
        }catch(double amount){
            cout << "\n\nError: Deposit amount must be larger than 0." << endl;
        }
        return balance;
    }
    double withdraw(double amount)
    {
        try{
        if((amount > balance)||(amount < 0))
            throw amount;
        else
            balance -= amount;
        }
        catch(double amount){
            cout << "\n\nError: Insufficient Funds for the withdrawl of $" << amount << endl;
        }
        
        return balance;
    }
};


/*
 * 
 */
int main(int argc, char** argv) {

    Account a(225.45);
    
    cout <<"Depositing $1000.10";
    a.deposit(1000.10);
    
    cout << "\nCurrent balance: $" << a.getBalance();
    
    cout << "\nWithdrawing: $523.65";
    a.withdraw(523.65);
    
    cout << "\nCurrent balance: $" << a.getBalance();
    
    cout << "\nWithdrawing: $800.00";
    a.withdraw(800.00);
    
    cout << "\nDepositing -$500";
    a.deposit(-500.0);
    return 0;
}

