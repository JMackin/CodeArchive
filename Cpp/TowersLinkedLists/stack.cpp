/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   stack.cpp
 * Author: jlm1455
 * 
 * Created on November 6, 2017, 11:49 AM
 */

#include "stack.h"
#include <iostream>
#include <cstddef>

using namespace std;

Stack::Stack() : top(NULL) 
{
    
}

Stack::Stack(const Stack& a_stack) {
    
    if (a_stack.top == NULL)
    {
        top = NULL;
    }
    else
    {
        StackFramePtr temp = a_stack.top;
        StackFramePtr end;
        end = new StackFrame;
        end -> data = temp -> data;
        top = end;
        
        temp = temp -> link;
        
        while(temp != NULL)
        {
            end -> link = new StackFrame;
            end -> data = temp -> data;
            temp = temp -> link;
        }
    end -> link == NULL;
    }
}

Stack::~Stack() {
    int next;
    while (!empty())
        next = pop();
}

bool Stack::empty() const
{
    return top == NULL;
}

void Stack::push(int numIn)
{
    StackFramePtr temp_ptr;
    temp_ptr = new StackFrame;
    temp_ptr -> data = numIn;
    temp_ptr -> link = top;
    top = temp_ptr;
}

int Stack::pop()
{
    if(empty())
    {
        cout << "Cant pop emptyy stack";
        exit(1);
    }
    
    int result = top -> data;
    
    StackFramePtr temp_ptr;
    temp_ptr = top;
    top = top -> link;
    
    delete temp_ptr;
    
    return result;
}

