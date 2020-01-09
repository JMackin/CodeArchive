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
 * @author John Mackin
 * @version 11/06/2019
 *
 */

public class DieRoller {

    /**
     * Creates die frame
     * @param args not used
     */
    public static void main(String[] args)
    {

        EventQueue.invokeLater(
                new Runnable(){
                    public void run() {
                        DieFrame dieFrame = new DieFrame();
                        dieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        dieFrame.setVisible(true);
                    }
                });

    }
}

/**
 *  a frame with 2 labels and a button on a panel
 */
class DieFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 200;
    public static final int DEFAULT_HEIGHT = 150;

    /**
     * Construct die-roller frame and add panel
     */
    public DieFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setTitle("Roll That Die Boys!");

        DiePanel diePanel = new DiePanel();

        this.add(diePanel);
    }
}

class DiePanel extends JPanel {
    /**
     * Constructs a label panel instance
     */

    private int dieSidesNum;
    private int rollResultNum = 1;
    private GameDie gameDie;
    private JLabel rollResultLabel;

    /**
     * Constructs Die Rolling Panel Instance
     */
    public DiePanel() {

        // Prompt user for input to determine number of sides on this die instance
        dieSidesNum  = Integer.parseInt(JOptionPane.showInputDialog("Enter number of sides for the die."));
        gameDie = new GameDie(dieSidesNum);

        //Build button and paneles
        JButton rollButton = new JButton("Roll");
        JLabel title = new JLabel("Die Roller");

        //Set layout manager
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

        // Add in title panel and align center
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(title);
        this.add(Box.createRigidArea(new Dimension(0,5)));

        // Add in roll button and align center
        rollButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(rollButton);
        this.add(Box.createRigidArea(new Dimension(0,5)));

        // Add in results label, updates w/ roll result when roll-button is pressed
        this.rollResultLabel = new JLabel("Result: " + this.rollResultNum + "");
        rollResultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(rollResultLabel);

        this.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));


        // Attach action listener that calls roll function to die button
        RollDieAction rollDie = new RollDieAction();
        rollButton.addActionListener(rollDie);


    }//end DiePanel Constructor

    /**
     * Action listener for Roll button
     */
    private class RollDieAction implements ActionListener {

        // Method called by action listener
        public void actionPerformed(ActionEvent event) {

            //Update result panel with results of the game die roll method.
            DiePanel.this.rollResultNum = gameDie.roll();
            DiePanel.this.rollResultLabel.setText("Result: " + DiePanel.this.rollResultNum + "");
        }

    }//end RollDieAction
}//end DiePanel
