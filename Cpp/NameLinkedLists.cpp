/* 
 * John Mackin
 * HW 07 - Names w/ Linked Lists
 * 11/05/2017
 * CS 112
 *  
 * 
 * Purpose: Creates a linked list structure out of Node objects, each containing name as data
 *          Inserts new node into the list
 *          Safely removes node from list
 */

#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

// Structure with name data and link pointer to connect nodes
struct Node
{
    string name;
    Node *link;
};

typedef Node* NodePtr;

int main(int argc, char** argv) 
{
    //listPtr is head pointer
    NodePtr listPtr, tempPtr, here;
    
    //Creates new head node w/ name data "Emily" 
    listPtr = new Node;
    listPtr -> name = "Emily";
    
    //Creates new node "James" and connects it to the head node
    tempPtr = new Node;
    tempPtr -> name = "James";
    listPtr -> link = tempPtr;
    
    //Creates new node and connects it to "James" node.
    tempPtr -> link = new Node;
    tempPtr = tempPtr -> link;  //reassigns tempPtr to its link
    tempPtr -> name = "Joules"; //assigns data "Joules" to new Node
    tempPtr -> link = NULL; //Connects NULL to "Joules" node to end list.
    
    //----------------------------------
    
    here = listPtr; //Node Pointer to keep track of position in list   
    //loop to step through list and output names.
    while(here != NULL)
    {
        cout << here -> name << endl;
        here = here -> link;    //Step to next node by reassigning "here" to current nodes link
    }    
    cout << endl;
    
    //----------------------------------
    
    here = listPtr;
    //Step through list and stop at "James Node"
    while(here->name != "James"){
        here = here -> link;
    }
    
    //New Node to mark subsequent Node "Joules"
    NodePtr afterMe = here -> link;
    tempPtr = here;
    
    //connecting new node to "James" node
    tempPtr -> link = new Node;
    tempPtr = tempPtr -> link;  //Moving tempPtr to the new Node
    tempPtr -> name = "Joshua";  // Setting new Node data to "Joshua"
    tempPtr -> link = afterMe;  // connecting "Joules" Node to "Joshua" node
    
    //Moving here pointer back to head
    here = listPtr;
    
    //Loop to iterate through list and output data
    while(here != NULL)
    {
        cout << here -> name << endl;
        here = here -> link;
    }
    cout << endl;
    
    //----------------------------------
    
    //Moving here pointer back to head
    here = listPtr;   
    //Iterate through list until we reach "Joshua Node"
    while (here->name != "Joshua")
    {
        here = here -> link;
    }
    
    //create new nodes
    NodePtr discard, before;
    
    before = here;  //assign "before" to current position "Joshua"    
    discard = here -> link;   //assign "discard" to node to be deleted "Joules"
    before -> link = discard -> link;   //assign "Joshua" Node connection to "Joules" Node connection NULL
    
    delete discard; //discard "Joules" node to freestore
    
    
    //Moving here pointer back to head
    here = listPtr;
    //Loop to iterate through list and output data
    while(here != NULL)
    {
        cout << here -> name << endl;
        here = here -> link;
    }
    cout << endl;
    
    
    
    return 0;
}

