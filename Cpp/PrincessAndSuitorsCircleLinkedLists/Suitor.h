/* 
 * John Mackin
 * HW 08
 * 11/14/2017
 */


#ifndef SUITOR_H
#define	SUITOR_H

class SuitorNode
{
public:
SuitorNode();
SuitorNode(int initialnum);
int getNum();
SuitorNode* getNext() ;
void setNext(SuitorNode *nextNode) ;

private:
SuitorNode *next;       // Next node in linked list
int num;                // Place in line
};

typedef SuitorNode* snPtr;

#endif	/* SUITOR_H */
