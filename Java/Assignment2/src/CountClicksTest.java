/**
 * CS 235 Fall 2019 - Assignment 2
 * John Mackin
 * Last Modified: 11/06/19
 *
 */

import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;

/**
 * A GUI application with a button for which the number
 * of clicks is kept track of and displayed
 * 
 * @author Sharon Tuttle
 * @author Adapted by David C. Tuttle
 * @author Expanded by John Mackin
 * @version 2019-11/06/2019
 */

public class CountClicksTest  {
    /**
     * creates a CountClicks frame
     *
     * @param args not used here
     */
    
    public static void main(String args[]) {
        EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        CountClicksFrame mainFrame =  new CountClicksFrame();
                        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        mainFrame.setVisible(true);
                    }
                });
    }
}

/** 
 * A frame with a panel containing two labels and a button
 */

class CountClicksFrame extends JFrame {
    // data fields
    
    private final static int DEFAULT_WIDTH = 150;
    private final static int DEFAULT_HEIGHT = 200;

    /**
     * constructs a count-clicks frame instance
     */

    public CountClicksFrame() {
        this.setTitle("Button-click Counter");
        this.setSize(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);

        // add count-clicks panel to frame
        
        CountClicksPanel panel = new CountClicksPanel();

        this.add(panel);
    }
}

/**
 * A panel with two labels and a button, that displays how many times
 * the button has been clicked
 */

class CountClicksPanel extends JPanel {
    // data fields for CountClicksPanel
    
    private int numClicks;         // keeps track of the number of button clicks
    private JLabel showNumClicks;  // displays the number of button clicks
    
    /**
     * constructs a count-clicks panel instance
     */
    
    public CountClicksPanel() {
        // button has not been clicked yet
        
        this.numClicks = 0;
        
        // create the labels and button for this panels
        
        JLabel welcome = new JLabel("Button-Click Counter");
        welcome.setForeground(Color.BLUE);

        JLabel name = new JLabel("John Mackin");
        name.setForeground(Color.RED);

        JButton clickMe = new JButton("Click Me");
        clickMe.setForeground(Color.BLUE);

        JButton clear = new JButton("Clear");

        this.showNumClicks = new JLabel("# of clicks: " + this.numClicks);

        this.setLayout(new FlowLayout());
        
        // add labels and button to this panel
        
        this.add(welcome);
        this.add(name);
        this.add(clickMe);
        this.add(clear);
        this.add(showNumClicks);
        
        // create button action (so clicks will be counted),
        //    and associate that action with clickMe button
        
        CountClicksAction countAction = new CountClicksAction();
        clickMe.addActionListener(countAction);

        ClearAction ClearCount = new ClearAction();
        clear.addActionListener(ClearCount);

    } // end CountClicksPanel constructor  
    
    /**
     * An action listener that counts the number of times the
     * clickMe button has been clicked
     */
    
    private class CountClicksAction implements ActionListener {   
        // default constructor will suffice, in this case
        
        /**
         * increases and displays the number of clicks of this
         * button
         * 
         * @param event a click of the clickMe button
         */
        
        public void actionPerformed(ActionEvent event) {
            CountClicksPanel.this.numClicks++;
            CountClicksPanel.this.showNumClicks.setText(
                "# of clicks: " 
                + CountClicksPanel.this.numClicks);
        }
    }

    private class ClearAction implements ActionListener {

        public void actionPerformed(ActionEvent event)
        {
            CountClicksPanel.this.numClicks = 0;
            CountClicksPanel.this.showNumClicks.setText(
                    "# of clicks: "
                    + CountClicksPanel.this.numClicks);
        }
    }

} // end of class CountClicksPanel
