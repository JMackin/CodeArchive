//This is the header file queue.h. This is the interface for the class Queue,
//which is a class for a queue of symbols.
/* 
 * John Mackin
 * HW 09
 * CS 112
 * 12/08/1017
 * File:queue.h
 */

#ifndef QUEUE_H
#define QUEUE_H

    struct QueueNode
    {
        int data;
        QueueNode *link;
    };

    typedef QueueNode* QueueNodePtr;

    class Queue
    {
    public:
        Queue( );
        //Initializes the object to an empty queue.

        Queue(const Queue& aQueue);

        ~Queue( );

		void add(int item);
        //Postcondition: item has been added to the back of the queue.

		// **** The remove function has been made virtual so we
		// **** can override it
        virtual int remove( );
        //Precondition: The queue is not empty.
        //Returns the item at the front of the queue and 
        //removes that item from the queue.

        bool empty( ) const;
        //Returns true if the queue is empty. Returns false otherwise.

		//*** Changed from private to protected so we can access
		//*** front and back from derived classes
    protected:
        QueueNodePtr front;//Points to the head of a linked list.
                            //Items are removed at the head
        QueueNodePtr back;//Points to the node at the other end of the 
                           //linked list. Items are added at this end.
    };
#endif //QUEUE_H
