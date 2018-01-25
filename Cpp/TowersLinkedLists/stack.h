#ifndef STACK_H
#define STACK_H



    struct StackFrame
    {
        int data;
        StackFrame *link;
    };
    typedef StackFrame* StackFramePtr;

    class Stack
    {
        public:
            Stack();
            Stack(const Stack& a_stack);

            ~Stack();

            void push(int numIn);

            int pop();

            bool empty() const;

        private:
            StackFramePtr top;
    };

#endif // STACK_H
