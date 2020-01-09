
// CS 235 Fall 2019 Assignment #3 Problem 2

import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;

/**
 * A GUI application including JTextFields for numeric
 * input and output; lets user enter 2 numbers for multiplying
 *
 * @author Sharon Tuttle
 * @author Adapted by David C. Tuttle
 * @version 2019-11-05
 */

public class Mult2 {
    /**
     * creates a Mult2Frame
     *
     * @param args not used here
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        Mult2Frame mainFrame = new Mult2Frame();
                        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        mainFrame.setVisible(true);
                    }
                });
    }
}
/**
 * A frame with a panel containing several elements to allow a user
 * to find the product of two values
 */
class Mult2Frame extends JFrame {
    // data fields
    private final static int DEFAULT_WIDTH = 325;
    private final static int DEFAULT_HEIGHT = 250;
    /**
     * constructs a Mult2Frame instance
     */
    public Mult2Frame() {
        this.setTitle("Mult2");
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        // add Mult2 panel to frame
        Mult2Panel panel = new Mult2Panel();
        this.add(panel);
    }
}
/**
 * A panel containing elements to determine the product
 *    for two values
 */
class Mult2Panel extends JPanel {
    // data fields for Mult2Panel
    private JTextField val1Field, val2Field;
    private JTextField resultField;
    /**
     * constructs a Mult2 panel instance
     */
    public Mult2Panel() {
        // set up a welcome label for the panel
        JLabel welcome =  new JLabel("Mult2");
        welcome.setForeground(Color.BLUE);
        this.add(welcome);
        // set up user instructions
        JLabel instructions = new JLabel("Enter values to be multiplied, then click multiply");
        this.add(instructions);
        // set up places to enter the desired values
        val1Field = new JTextField(5);
        val1Field.setText("0");
        this.add(val1Field);
        val2Field = new JTextField(5);
        val2Field.setText("0");
        this.add(val2Field);
        // set up button user uses to ask for multiplication to be done
        JButton multButton = new JButton("Multiply Values");
        this.add(multButton);
        multButton.addActionListener(new MultAction());
        // set up the result label and textfield
        JLabel resultLabel = new JLabel("   And the product is:   ");
        this.add(resultLabel);
        resultField = new JTextField("0", 8);
        resultField.setForeground(Color.blue);
        this.add(resultField);
    } // end Mult2Panel constructor
    /**
     * An action listener that tries to multiply the values in
     * val1Field and val2Field and show the result in resultField
     */
    private class MultAction implements ActionListener {
        // default constructor will suffice, in this case
        /**
         * tries to multiply the values in val1Field and val2Field
         * and display the result in resultField
         *
         * @param event the mult button push
         */
        public void actionPerformed(ActionEvent event) {
            double currVal1 = Double.parseDouble(val1Field.getText());
            double currVal2 = Double.parseDouble(val2Field.getText());
            // set product computed appropriately
            double currProduct = currVal1 * currVal2;
            resultField.setText("" + currProduct);
        }
    }
}
