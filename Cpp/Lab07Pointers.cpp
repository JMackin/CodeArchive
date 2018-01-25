/*
John Mackin
Cindy Batres

Lab 07

*/

#include <iostream>

using namespace std;

void addOne(int *ptrNum);

int main()
{
    int *ptrNum;
    ptrNum = new int;
    *ptrNum = 0;

    addOne(ptrNum);

    cout << *ptrNum;



    return 0;
}


void addOne(int *ptrNum){

    *ptrNum += 1;

}

