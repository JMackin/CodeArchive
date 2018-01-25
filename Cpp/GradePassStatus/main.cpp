#include <iostream>

using namespace std;

int main()
{
    double avgScore, score1, score2, score3, score4;
    bool pass;
    char repeat = 'y';

    do
    {
        cout << "Enter your 4 exam scores separated by whitespace:\n" << endl;
        cin >> score1 >> score2 >> score3 >> score4;

        avgScore = (score1 + score2 + score3 + score4)/4;

        cout << "Average Score: " << avgScore << endl;

        if (avgScore > 60)
        {
            cout << " Congrats, you passed";

        }
        else
        {
            cout << "Sorry you failed..";
        }

        cout << "Repeat? (y/n) > ";

        cin >> repeat;

    }while (repeat == 'y');


    return 0;
}
