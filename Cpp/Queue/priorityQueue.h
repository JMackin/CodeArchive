/* 
 * John Mackin
 * HW 09
 * CS 112
 * 12/08/1017
 * File:priorityQueue.h
 */

#ifndef PRIORITYQUEUE_H
#define	PRIORITYQUEUE_H

#include "queue.h"

class priorityQueue: public Queue {
public:
    priorityQueue();
    priorityQueue(const priorityQueue& orig);
    virtual ~priorityQueue();
    virtual int remove();
};

#endif	/* PRIORITYQUEUE_H */

