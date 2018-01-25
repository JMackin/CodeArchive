/*
John Mackin
HW 4 #3
09/23/2017
*/
#include <iostream>
#include <cstring>

using namespace std;

int main()
{
    const int SSZE = 11;
    char instr[SSZE];
    int x = 0;

    cout << "Enter up to ten letters to be reversed ending with a period (.) " << endl;


    //Reads letters in to an array
    while (instr[x-1] != '.'){
        cin >> instr[x];
        x++;
    }

    //starts two positions back to omit the '\0' and '.' characters
    x -=2;

    //print array backwards.
    while (x >= 0){
        cout << instr[x];
        x--;
    }

    return 0;
}
