/*
John Mackin
HW 06
CS 112
10/26/1017

PURPOSE:
    Rolls one of three dies selected by user. Used to demonstrate use of classes and objects.
*/

#include <iostream>
#include <stdlib.h>
#include <time.h>


using namespace std;

//Class for die objects with definable number of sides

class GameDie
{
public:
    GameDie(int desiredNumSides);
// constructor
    int roll();
// return the number of rolls
    int getNumSides() const;
//accessor: how many sides die has
    int getNumRolls() const;
//accessor: # of times this die rolled
private:
    int numRolls = 1;
// # times die rolled
//Initialized to 1 because this value is returned on the first roll. Not sure why.
//If its not initialized a large irrelevant number is returned instead
    int numSides;
//sides on die
};

int main()
{

    int choice;
    char cont = 'y';

    GameDie cube(6), dodeca(12), icosa(20); //Create dice objects

    // While loop that allows for user to roll a die of their choosing as many times as they'd like.
    while(cont != 'n'){

        cout << "Which Die do you want to roll? (Enter 1, 2, or 3)\n (1)Cube (2)Dodecahedron (3)Icosahedron\n" << endl;
        cout << "> ";
        cin >> choice;
        cout << "\n\n";

        switch(choice)
        {
        case(1):
            cout << "Cube\n----------\n" << "Result: " << cube.roll()
                                << "\nTimes rolled: " << cube.getNumRolls()
                                << "\nNum of sides: " << cube.getNumSides();
            break;
        case(2):
             cout << "Dodecahedron\n----------\n" << "Result: " << dodeca.roll()
                                << "\nTimes rolled: " << dodeca.getNumRolls()
                                << "\nNum of sides: " << dodeca.getNumSides();
            break;
        case(3):
             cout << "Icosahedron\n----------\n" << "Result: " << icosa.roll()
                                << "\nTimes rolled: " << icosa.getNumRolls()
                                << "\nNum of sides: " << icosa.getNumSides();
            break;
        default:
            cout << "Not an option, choose 1, 2, or 3" << endl;
            break;
        }


        cout << "\n\nRoll again? (y/n) > "; //only exited by entering 'n'
        cin >> cont;
        cout << endl;
    }

    return 0;
}


// GameDie Member Function constructors
//-------------------------------------

GameDie::GameDie(int desiredNumSides)   //Default constructor
{
    numSides = desiredNumSides;
}

int GameDie::getNumSides() const
{
    return numSides;
}

int GameDie::getNumRolls() const
{
    return numRolls;
}

int GameDie::roll()
{
    int result;

    srand(time(0));                     //Seed random number
    result = (rand() % numSides) + 1;   //generate random number between 1 and number of sides on the die.

    numRolls++;                         //Increments number of times the die has been rolled.
    return result;
}
//-----------------------------------
