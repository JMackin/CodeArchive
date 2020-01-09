// CS 235 Fall 2019 Assignment #2
// ButtonTest.java file

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * set up an display a frame with 3 buttons
 * 
 * adapted from "Core Java", Chapter 10
 * 
 * @author C. Horstmann
 * @author adapted by Sharon Tuttle
 * @author further adapted by David C. Tuttle
 * @version 2019-10-17
 */

public class ButtonTest
{
    /**
     * creates a simple 3-button frame
     * 
     * @param args not used here
     */
    
    public static void main(String[] args) {   
        // it is safer to configure Swing components that might be sensitive
        // to user actions in the Event Dispatch Thread (EDT).  This code is
        // designed to allow everything else to be set up before it's run.
        
        EventQueue.invokeLater(

            // an anonymous inner class!
                               
            new Runnable() {
                public void run() {
                    ButtonFrame aFrame = new ButtonFrame();            
                    aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    aFrame.setVisible(true);
                }
            }
        );
    }
}

/**
 * a frame with a 3-button panel
 */

class ButtonFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    
    /**
     * construct a button-panel frame instance
     */
    
    public ButtonFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setTitle("ButtonTest");
        
        // create and add a button panel to my frame

        ButtonPanel aButtonPanel = new ButtonPanel();
        this.add(aButtonPanel);
    }
}

/**
 * a panel with 3 buttons
 */

class ButtonPanel extends JPanel {
    /**
     * constructs a button panel instance
     */
    
    public ButtonPanel() {
        // create some buttons!
        
        // Yellow button (with commented-out options)
        JButton yellowButton = new JButton("Yellow");
        // Some available methods to customize JButton include:
        // yellowButton.setFont(new Font("Monospaced", Font.BOLD, 50));
        // yellowButton.setForeground(Color.YELLOW);
        // yellowButton.setBackground(Color.YELLOW);
        
        // Other buttons
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");
        
        // add these buttons to the new panel
        
        this.add(yellowButton);
        this.add(blueButton);
        this.add(redButton);
        
        // We want to associate listeners with these buttons --
        // JButton has an addActionListener method, to add an action
        // listener to that button.  ActionListener is an interface
        // that requires an actionPerformed method, to do whatever
        // is desired when the Action (a button click) occurs
        //
        
        // this listener must be an object of type ActionListener
        
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        yellowButton.addActionListener(yellowAction);
        
        ColorAction blueAction = new ColorAction(Color.BLUE);
        blueButton.addActionListener(blueAction);
        
        // Note the alternate form in which this can be written
        
        redButton.addActionListener(new ColorAction(Color.RED));
    }
    
    /**
     * this is an inner class!
     * An action listener that sets the containing panel's background color
     * when the Action of a button click occurs
     * 
     * note: a class implementing ActionListener must implement a method
     * with this signature:
     *     public void actionPerformed(ActionEvent event)
     */
    
    private class ColorAction implements ActionListener {
        // data fields
        
        private Color backgroundColor;
        
        /**
         * create an instance of this action listener
         * 
         * @param aColor the desired color for the background
         */
        
        public ColorAction (Color aColor) {
            this.backgroundColor = aColor;
        }
        
        /**
         * set the background color when a button that
         *     has this listener added is clicked
         * 
         * @param event the button push requesting a background
         *        color
         */


        public void actionPerformed(ActionEvent event) {
            ButtonPanel.this.setBackground(this.backgroundColor);
        }
    }
    
}
