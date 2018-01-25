#include <iostream>

/*
John Mackin
Cs 112
HW 2 Problem 2
*/

using namespace std;

int game (char p1Mv, char P2Mv);

int main()
{

    char p1, p2, repeat = 'y';
    int p1Score, p2Score, win;

    do
    {
        cout << "Enter your moves: \n";
        cout << "Player 1 > ";
        cin >> p1;
        cout << "\nPlayer 2 > ";
        cin >> p2;

        win = game(p1,p2);

        if (win == 3)
        {
            cout << "It's a tie..";
        }else
        {
            cout << "Winner: Player " << win << endl;
        }


        cout << "Play again? (y/n) >";
        cin >> repeat;

    }while (repeat == 'y');

    return 0;
}

int game (char p1Mv, char p2Mv)
{
    int winner;

    switch (p1Mv)
    {
        case 'r':
            if (p2Mv == 's'){ winner = 1;}
            else if (p2Mv == 'p'){winner = 2;}
            else{ winner = 3;}
            break;
        case 'p':
            if (p2Mv == 'r'){ winner = 1;}
            else if (p2Mv == 's'){winner = 2;}
            else{ winner = 3;}
            break;
        case 's':
            if (p2Mv == 'p'){ winner = 1;}
            else if (p2Mv == 'r'){winner = 2;}
            else{ winner = 3;}
            break;

    }

    return winner;

}
