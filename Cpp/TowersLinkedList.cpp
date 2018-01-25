
/* 
 * John Mackin
 * Kevin Montas
 * 10/30/2017
 * Lab 10
 */

#include <cstdlib>
#include <cstring>
#include <unistd.h>
#include <iostream>

using namespace std;

struct Tower
{
    Tower();
    Tower *createTower(string name, Tower *link);
    Tower* getLink();
    string getName();
    string name;
    Tower *link;
};

Tower Tower::*createTower(string name, Tower *link)
{
    Tower *newTower;
    newTower -> name = name;
    newTower -> link = link;
    return newTower;
}

Tower* Tower::getLink(){
    return link;
}
string Tower::getName(){
    return name;
}

int main(int argc, char** argv) {
    
    Tower* head;
    head = createTower("minas",NULL);
   
    return 0;
}

