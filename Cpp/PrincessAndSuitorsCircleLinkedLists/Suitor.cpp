/* 
 * John Mackin
 * HW 08
 * 11/14/2017
 */


#include <iostream>
#include "Suitor.h"

SuitorNode::SuitorNode() : num(1), next(NULL){
    
}

SuitorNode::SuitorNode(int initialnum) : num(initialnum) {
}

int SuitorNode::getNum(){
    return num;
}

SuitorNode* SuitorNode::getNext(){
    return next;
}

void SuitorNode::setNext(SuitorNode *nextNode){
    next = nextNode;
}

