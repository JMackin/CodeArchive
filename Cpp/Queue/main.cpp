/* 
 * John Mackin
 * HW 09
 * CS 112
 * 12/08/1017
 * File:main.cpp
 */

#include <cstdlib>
#include <iostream>
#include "queue.h"
#include "priorityQueue.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    priorityQueue p;
    
    
    //demonstration of the priority queue.
    // adds multiple random numbers to the queue, and then removes each one in order of
    // least to greatest until the queue is empty
    
    p.add(2);
    p.add(100);
    p.add(400);
    p.add(507);
    p.add(13);
    p.add(1);
    p.add(0);
    p.add(0);
    p.add(-80);
    p.add(30);
    p.add(1000);
    p.add(-90);
    
    while(!p.empty()){
       cout << p.remove()<< endl;
    }
    
    return 0;
}

