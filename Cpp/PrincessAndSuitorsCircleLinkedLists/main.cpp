/* 
 * John Mackin
 * HW 08
 * 11/14/2017
 */

#include <cstdlib>
#include <iostream>
#include "Suitor.h"

using namespace std;

void addSuitor(snPtr &aNode, int num);
void removeSuitor(snPtr &aNode);

int main() {

    snPtr head, suitor, temp;
    int z = 0;
    int NumOfSuits;
    
    head = new SuitorNode;
    suitor = head;
    
    cout << "Enter number of suitors > ";
    cin >> NumOfSuits;
    cout << "\n";
    
    //create a link list 1 - 9
    for(int i = 2; i < NumOfSuits + 1; i++){
        addSuitor(suitor,i);
        suitor = suitor -> getNext();
    }
    
    //link end of the list to the front
    suitor -> setNext(head);
    suitor = head;
    
    //output full linked list
    for(int i = 0; i < NumOfSuits; i++){
        cout << suitor -> getNum();
        suitor = suitor -> getNext();
    }
    
    cout << "\n";
    suitor = head; // reset beginning of cursor
    
    //Iterate through the list until only one element is left, deleting every 3rd one.
    while(suitor -> getNext() != suitor){
        cout << suitor -> getNum();
        suitor = suitor -> getNext();
        z++;
        if(z == 2){
            temp = suitor -> getNext();
            removeSuitor(suitor);
            suitor = temp;
            z=0;
        }
        
        if(suitor -> getNum() == 1) cout << "\n";
        
    }
}


void addSuitor(snPtr &aNode, int num){
    snPtr tempSt;
    
    tempSt= new SuitorNode(num);
    aNode -> setNext(tempSt);
    
}

void removeSuitor(snPtr &aNode){
    
    snPtr tempSt, before, after;
    tempSt = aNode;
    
    while(tempSt -> getNext() != aNode){
        tempSt = tempSt -> getNext();
    }
    
    before = tempSt;
    after = aNode -> getNext();
    before->setNext(after);
    
    delete aNode;
    
}