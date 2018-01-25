/*
 * John Mackin
 * Philip Toulinov
 * Tadhg Murray
 * 
 * Lab 11
 * 
 * 11/06/17
 * 
 */


#include <cstdlib>
#include <iostream>
#include <string>
#include "stack.h"

using namespace std;

void reverse(Stack &head);

int main(int argc, char** argv) {
    
    Stack s;
    reverse(s);
    
    return 0;
}

void reverse(Stack &head)
{
    int next, ans;
    
    cout << "Input Numbers, negative quits" << endl;
    
    do
    {
        cin >> next;
        head.push(next);
    }while(next >= 0);
    
    cout << "Written backwards: ";
    while (!head.empty())
    {
        cout << head.pop();
    }
    
    cout << endl;
}

