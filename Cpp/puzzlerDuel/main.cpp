#include <iostream>
#include <cstdlib>
#include <ctime>



using namespace std;

void shoot(bool& isAlive, double accuracy);
char startDuel();

int main()
{
    srand(time(0));
    char winner, repeat = 'y';
    int aScore, bScore, cScore, x;

    do
    {
        aScore =0; bScore = 0; cScore = 0;

    for (x=0;x<1000;x++){

        winner = startDuel();

        switch(winner)
        {
        case 'a':
            aScore++;
            break;
        case 'b':
            bScore++;
            break;
        case 'c':
            cScore++;
            break;
        default:
            cout << "something went wrong";
            break;
        }
    }

    cout << "Score\n" << "Aaron: " << aScore
                    << "\nBob: " << bScore
                    << "\nCharlie: " << cScore;

    cout << "\n\ngo again? (y/n) > ";
    cin >> repeat;

    }while (repeat != 'n');

    return 0;
}

void shoot(bool& isAlive, double accuracy)
{
    double shot =0;
    shot = rand() % 100;

    if (shot < accuracy){
        isAlive = false;
    }else{
        isAlive = true;
    }
}

char startDuel()
{
    double aaron = 33, bob = 50, charlie = 100;
    bool aaronAlive, charlieAlive, bobAlive;
    char winner = 'n';

    /*
        Begin shooting algorithm.
        #########################
    */

    shoot(charlieAlive, aaron); //aaron shoots charlie

    if (charlieAlive == false)
    {
        do
        {

            shoot(aaronAlive, bob); //if charlie dies, aaron shoots bob.
            if(aaronAlive == false)
            {
                winner = 'b';
                return winner; //if bob dies, aaron wins
            }
            else
            {
                shoot(bobAlive,aaron); //if aaron misses bob shoots aaron
                if (bobAlive == false)
                {
                    winner = 'a';  //is aaron dies, bob wins
                    return winner;
                }
            }

        }while(winner == 'n');
    }

    shoot(charlieAlive, bob); //if charlie lives, bob shoots charlie

    if (charlieAlive == false)
    {
        do
        {

            shoot(aaronAlive, bob); //if charlie dies, bob shoots aaron
            if(aaronAlive == false)
            {
                winner = 'b';
                return winner;  // if aaron dies, bob wins
            }
            else
            {
                shoot(bobAlive,aaron); //if bob misses, aaron shoots bob
                if (bobAlive == false)
                {
                    winner = 'a';  // if bob dies aaron wins
                    return winner;
                }
            }

        }while(winner == 'n');
    }else
    {
        shoot(aaronAlive,charlie);  //if charlies lives after both bob and aaron shoot him, charlie shoots aaron, who dies.

        shoot(charlieAlive, bob);
        if (charlieAlive == false) winner = 'b';  //bob shoots at charlie, if charlie dies bob wins, if he misses charlies wins.
        else winner = 'c';

        return winner;


    }



}
