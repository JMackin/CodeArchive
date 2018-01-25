import java.util.Stack;
/**
 * Uses shunting yard algorithm to convert an equation string to postfix format
 * 
 * John Mackin - CSCI 13
 * 10/18/15
 */
public class InToPost
{
    private Stack operators = new Stack();

    /**
     * Constructor for objects of class InfixToPostfix
     */
    public InToPost()
    {
        
    }

    /**
     * toPostfix
     */
    public String toPostfix(String infix)
    {
        String[] tokens = new String[100];
        int i;
        tokens = infix.split("\\s+");
        int length = tokens.length;
        String operator;
        String output = "";
        
        for (i = 0; i < length; i++)
        {
            if (isOperator(tokens[i])){
                if (operators.empty()){
                    // 2. If the stack is empty, push the incoming operator onto the stack.
                    operators.push(tokens[i]);
                }else
                {
                    if (operatorLessPrecedence(tokens[i]))
                    // 3. If the incoming symbol has equal or lower precedence than the
                    //    symbol on the top of the stack, pop the stack and print the top
                    //    operator. Then test the incoming operator against the new top of stack.
                    //    Push the incoming symbol onto the stack.
                    {
                        do
                        {
                            output = output + operators.pop() + " ";
                        }
                        while (!operators.empty() && operatorLessPrecedence(tokens[i]));
                        operators.push(tokens[i]);
                    }else{
                        // 4. If the incoming symbol has higher precedence than the top of the stack,
                        //    push it on the stack.
                        operators.push(tokens[i]);
                    }
                }

            }else{
                // 1. Print operands as they arrive.
                output = output + tokens[i] + " ";
            }
        }
        while (!operators.empty())
        {
            // 5. At the end of the expression, pop and print all operators on the stack.
            operator = (String)operators.pop();
            output = output + operator + " ";
        }
        return output.trim();
    }
    
    /**
     * isOperator
     */
    public boolean isOperator(String c)
    {
        if ( c.equals("*") ||
             c.equals("/") ||
             c.equals("+") ||
             c.equals("-") )
            return true;
        else
            return false;
    }
    
    /**
     * operatorLessPrecedence
     * Compare operator with top of stack
     * Assume association left to right
     */
    public boolean operatorLessPrecedence(String o)
    {
        int operatorPrecedence = precedence(o);
        int tosPrecedence = precedence((String)operators.peek());
        return (operatorPrecedence <= tosPrecedence);
    }
    
    /**
     * precedence
     */
    public int precedence(String o)
    {
        switch (o)
        {
            case "+": return 1;
            case "-": return 1;
            case "*": return 2;
            case "/": return 2;
        }
        return 5;
    }
}