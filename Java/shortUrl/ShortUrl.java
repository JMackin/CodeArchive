import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Color;


public class ShortUrl extends Program
{
    private JTextField infix, postfix;
    private JLabel infixLabel, postfixLabel;
    private JButton goButton, clearButton;
    private Bitly bit;
    
    public ShortUrl()
    {
        start();
        setSize(400, 200);
        setBackground(Color.GREEN);
    }
    
    public void init()
    {
        TableLayout table = new TableLayout(3, 2);
        setLayout(table);
        
        infix = new JTextField();
        postfix = new JTextField();
        
        postfix.setEditable(false);
        
        Dimension d = infix.getPreferredSize();
        d.setSize(200, d.getHeight());
        infix.setPreferredSize(d);
        
        infixLabel = new JLabel("<html><b>Long Url</b></html>");
        infixLabel.setForeground(Color.WHITE);
        postfixLabel = new JLabel("<html><b>Short Url</b></html>");
        postfixLabel.setForeground(Color.WHITE);
        
        goButton = new JButton("Go!");
        goButton.setActionCommand("Go!");
        clearButton = new JButton("Clear");
        clearButton.setActionCommand("Clear");
        
        add(infixLabel);
        add(infix);
        add(postfixLabel);
        add(postfix);
        add(goButton);
        add(clearButton);
        
        addActionListeners();
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String infixString = ""; // Change this line
        String postfixString;
        
        String what = ae.getActionCommand();
        if (what.equals("Clear"))
        {
            infix.setText("");
            postfix.setText("");
        }
        else if (what.equals("Go!"))
        {
            postfixString = infix.getText();
            bit = new Bitly(postfixString);
            postfix.setText(bit.getShortURL());
        }
    }
}