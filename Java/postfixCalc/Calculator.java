import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Color;


public class Calculator extends Program
{
    private JTextField infix, postfix, result;
    private JLabel infixLabel, postfixLabel, resultLabel;
    private JButton goButton, clearButton;
    private InToPost intoPost = new InToPost();
    private PostEval eval = new PostEval();
    
    public Calculator()
    {
        start();
        setSize(400, 200);
        setBackground(Color.GREEN);
    }
    
    public void init()
    {
        TableLayout table = new TableLayout(4, 2);
        setLayout(table);
        
        infix = new JTextField();
        postfix = new JTextField();
        result = new JTextField();
        
        postfix.setEditable(false);
        result.setEditable(false);
        
        Dimension d = infix.getPreferredSize();
        d.setSize(200, d.getHeight());
        infix.setPreferredSize(d);
        
        infixLabel = new JLabel("<html><b>infix</b></html>");
        infixLabel.setForeground(Color.WHITE);
        postfixLabel = new JLabel("<html><b>postfix</b></html>");
        postfixLabel.setForeground(Color.WHITE);
        resultLabel = new JLabel("result");
        resultLabel.setForeground(Color.WHITE);
        
        goButton = new JButton("Go!");
        goButton.setActionCommand("Go!");
        clearButton = new JButton("Clear");
        clearButton.setActionCommand("Clear");
        
        add(infixLabel);
        add(infix);
        add(postfixLabel);
        add(postfix);
        add(resultLabel);
        add(result);
        add(goButton);
        add(clearButton);
        
        addActionListeners();
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String infixString = infix.getText();
        String expression = "";
        String postfixString;
        
        String what = ae.getActionCommand();
        if (what.equals("Clear"))
        {
            infix.setText("");
            postfix.setText("");
            result.setText("");
        }
        else if (what.equals("Go!"))
        {
            postfixString = intoPost.toPostfix(infixString);
            if (postfixString.equals("InValid")){JOptionPane.showMessageDialog(null,"Invalid syntax, please re-enter");}
            postfix.setText("" + postfixString);
            result.setText("" + eval.evaluate(postfixString));
        }
    }
}