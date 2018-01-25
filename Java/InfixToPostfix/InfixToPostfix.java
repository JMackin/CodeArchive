import java.util.Stack;
/**
 * Write a description of class InfixToPostfix here.
 * 
 * Tim McGowen
 * 10/11/2015
 */
public class InfixToPostfix
{
    private Stack operators = new Stack();

    /**
     * Constructor for objects of class InfixToPostfix
     */
    public InfixToPostfix()
    {
        
    }

    /**
     * toPostfix
     */
    public String toPostfix(String infix)
    {
        char[] characters = new char[100];
        int i;
        int length = infix.length();
        infix.getChars(0, length, characters, 0);
        char operator;
        String output = "";
        
        for (i = 0; i < length; i++)
        {
            if (isOperator(characters[i]))
                if (operators.empty())
                    // 2. If the stack is empty, push the incoming operator onto the stack.
                    operators.push(characters[i]);
                else
                {
                    if (operatorLessPrecedence(characters[i]))
                    // 3. If the incoming symbol has equal or lower precedence than the
                    //    symbol on the top of the stack, pop the stack and print the top
                    //    operator. Then test the incoming operator against the new top of stack.
                    //    Push the incoming symbol onto the stack.
                    {
                        do
                        {
                            output = output + operators.pop();
                        }
                        while (!operators.empty() && operatorLessPrecedence(characters[i]));
                        operators.push(characters[i]);
                    }
                    else
                        // 4. If the incoming symbol has higher precedence than the top of the stack,
                        //    push it on the stack.
                        operators.push(characters[i]);
                }
            else
                // 1. Print operands as they arrive.
                output = output + characters[i];
        }
        while (!operators.empty())
        {
            // 5. At the end of the expression, pop and print all operators on the stack.
            operator = (char)operators.pop();
            output = output + operator;
        }
        return output;
    }
    
    /**
     * isOperator
     */
    public boolean isOperator(char c)
    {
        if ( c == '*' ||
             c == '/' ||
             c == '+' ||
             c == '-')
            return true;
        else
            return false;
    }
    
    /**
     * operatorLessPrecedence
     * Compare operator with top of stack
     * Assume association left to right
     */
    public boolean operatorLessPrecedence(char o)
    {
        int operatorPrecedence = precedence(o);
        int tosPrecedence = precedence((char)operators.peek());
        return (operatorPrecedence <= tosPrecedence);
    }
    
    /**
     * precedence
     */
    public int precedence(char o)
    {
        switch (o)
        {
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
        }
        return 5;
    }
}
