/* 
 * File:   main.cpp
 * Author: Melanos
 *
 * Created on October 26, 2017, 12:33 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
class GameDie
{
public:
    GameDie();
    void roll();
};

int main()
{

    GameDie aDie;
    
    aDie.roll();
    
    return 0;
}

void GameDie::roll()
{
    cout << "Its 3, its always 3\n";
    
}


