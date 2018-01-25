/*
    John Mackin
    Grant Powell
    Lab 4
    09/25/2017

    A program to decode a caesar cipher encoded message
*/

#include <iostream>
#include <cstring>

using namespace std;

int main()
{

    char secMsg[] = ":mmZ\\dxZmx]Zpgy";
    char newChar;
    int msgLeng = strlen(secMsg);

    for(int y =0; y <= 100; y++){
        cout << "key #" << y << ":";
        for(int x =0; x <= msgLeng; x++){
            if((secMsg[x]+y) > 126){
                 newChar = 32 +(secMsg[x] + y) - 127;
                 cout << newChar;
            }else{
                newChar = (secMsg[x] + y);
                cout << newChar;
            }
        }
        cout << endl;

    }

    return 0;
}
