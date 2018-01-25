import java.util.Stack;
import java.util.Random;
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
        int i, x = 0, y = 0;
        tokens = infix.split("(?=\\D)|(?<=\\D)");
        int length = tokens.length;
        String operator = "";
        String output = "";
        
        for (i = 0; i < length; i++)
        {
            
            if(!tokens[i].matches(".*\\d+.*") && !isOperator(tokens[i]) && 
               !tokens[i].matches("\\s+") && !tokens[i].equals("R")){
                output = "InValid";
                return output;
            }
            if (isOperator(tokens[i])){
                if (operators.empty()){
                    // 2. If the stack is empty, push the incoming operator onto the stack.
                    operators.push(tokens[i]);
                }
                else if (tokens[i].equals("(")){
                    operators.push(tokens[i]);
                }
                else if (tokens[i].equals(")")){
                    while(!operators.peek().equals("(")){
                     operator = (String)operators.pop();
                     output = output + operator + " ";
                    }
                    operators.pop();
                }
                else
                {
                    if (operatorLessPrecedence(tokens[i]))
                    // 3. If the incoming symbol has equal or lower precedence than the
                    //    symbol on the top of the stack, pop the stack and print the top
                    //    operator. Then test the incoming operator against the new top of stack.
                    //    Push the incoming symbol onto the stack.
                    {
                        do
                        {
                            operator = (String)operators.pop();
                            output = output + operator + " ";
                        }
                        while (!operators.empty() && operatorLessPrecedence(tokens[i]));
                        operators.push(tokens[i]);
                    }else{
                        // 4. If the incoming symbol has higher precedence than the top of the stack,
                        //    push it on the stack.
                        operators.push(tokens[i]);
                    }
                }
                
                if(!tokens[i].equals("(") || !tokens[i].equals(")")){y++;}
                
            }else{
                if(tokens[i].equals("R")){
                   Random r = new Random();
                   double d = r.nextDouble();
                   tokens[i] = d + "";
                  } 
                if (tokens[i].matches(".*\\d+.*")){x++;}
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
        if( x < 2 || y < 1){ return "InValid";}
        else{
         return output.trim().replaceAll(" +"," ");
        }
    }
    
    /**
     * isOperator
     */
    public boolean isOperator(String c)
    {
        if ( c.equals("*") ||
             c.equals("/") ||
             c.equals("+") ||
             c.equals("-") ||
             c.equals("^") ||
             c.equals(")") ||
             c.equals("(")   )
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
            case "(": return 1;
            case "+": return 2;
            case "-": return 2;
            case "*": return 3;
            case "/": return 3;
            case "^": return 4;
        }
        return 5;
    }
}