/* 
 * John Mackin
 * HW 09
 * CS 112
 * 12/08/1017
 * File:priorityQueue.cpp
 */
#include <iostream>
#include <cstdlib>
#include <cstddef>
#include "priorityQueue.h"

using namespace std;


priorityQueue::priorityQueue() {
}

priorityQueue::priorityQueue(const priorityQueue& orig) {
}

priorityQueue::~priorityQueue() {
}

int priorityQueue::remove(){
    
    if (empty( ))
        {
            cout << "Error: Removing an item from an empty queue.\n";
            exit(1);
        }

    
    QueueNodePtr discard = front;
    QueueNodePtr behind = NULL;
    
    QueueNodePtr next = front -> link;
    QueueNodePtr here = front;
    int result = front -> data;
    int count = 1;
    
    
    //Following while block iterates through the queue and compares the data
    //of the next item with the current. If it is less than the current value of "result"
    //then the value is reassigned.
    
    while(here != back){
        if (result > (here -> link) -> data){
            result = (here -> link) -> data;
            discard = (here -> link);
            if (discard != back)
                next = (here -> link) -> link;
            behind = here;
        }
        
        here = here -> link;
        count++;
    }
    
    
    //The following conditional block handles 4 conditions each requiring different
    //handling methods;
    //1: if there is only one item in the queue
    //2: if the priority item is the first item in the queue, and there are multiple items.
    //3: if the priority item is the last item in the queue and there are multiple items.
    //4: all other cases.
    
    if (count == 1){
        discard = here;
        front = NULL;
        back = NULL;
    }else if(count > 1 && discard == front){
        discard = front;
        front = front -> link;
    }else if(discard == back){
        here = front;
        while(here -> link != back){
            here = here -> link;
        }
        back = here;
    }else{
        behind -> link = next;
    }
    
    
    delete discard;
    return result;
}

