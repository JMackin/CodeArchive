import java.util.Stack;
import java.lang.Math;
/**
 * Write a description of class PostEval here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostEval
{
    // instance variables - replace the example below with your own
    private Stack doit = new Stack();

    /**
     * Constructor for objects of class PostEval
     */
    public PostEval()
    {
    }

    public String evaluate(String postfix)
    {
     String[] tokens = new String[100];
     int i; 
     double x, y, z;
     tokens = postfix.split("\\s+");
     int length = tokens.length;
     String operator, operand;
     String output = "";
     
     for (i = 0; i < length; i++)
     {
         if (isOperator(tokens[i])){
             y = Double.parseDouble(doit.pop()+ "");
             x = Double.parseDouble(doit.pop() + "");
             z = operate(tokens[i],x,y);
             operand = z + "";
             doit.push(z);
             System.out.println(x);
             System.out.println(y);
             System.out.println(z);
         }
         else
         {
            doit.push(tokens[i]);
         }
     }
     output = doit.pop() + "";
     return output;
    }
    
    public boolean isOperator(String c)
    {        
        if ( c.equals("*") ||
             c.equals("/") ||
             c.equals("+") ||
             c.equals("-") ||
             c.equals("^") )
            return true;
        else
            return false;
    }
    
    public double operate(String c, double x, double y)
    {
        double z = 0;
        switch (c)
        {
            case "+": z = x + y; break;
            case "-": z = x - y; break;
            case "*": z = x * y; break;
            case "/": z = x / y; break;
            case "^": z = Math.pow(x,y); break;
        }
        return z;
    }
        
}
