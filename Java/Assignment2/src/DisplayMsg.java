/**
 * CS 235 Fall 2019 - Assignment 2
 * John Mackin
 * Last Modified: 11/06/19
 *
 */

import java.awt.*;
import javax.swing.*;

/**
 * @author John Mackin
 * @version 11/06/2019
 *
*/


public class DisplayMsg{

    /**
     * Construct display frame and contents
     * @param args not used here
     */
    public static void main(String[] args)
    {
        MFrame nameFrame = new MFrame();
        nameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameFrame.setVisible(true);

    }
}//end DisplayMsg

/**
 * Frame with a panel
 */
class MFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    /**
     * Construct frame and contents
     */

    public MFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setTitle("Fun Message From You");

        // creating a custom panel -- default-visibility
        // JPanel subclass is below

        MPanel aLabelPanel = new MPanel();
        aLabelPanel.setLayout(new BoxLayout(aLabelPanel,BoxLayout.PAGE_AXIS));


        // you can add something (hopefully a suitable sub-container)
        // to a frame's content pane using its add method

        this.add(aLabelPanel);

    }
}//end MFrame

/**
 * a panel with some JLabel instances on it
 */

class MPanel extends JPanel {
    /**
     * constructs a label panel instance
     */

    public MPanel() {
        // one of JLabel's constructors: expects a String,
        //     produces a JLabel with that text on it

        JLabel myName = new JLabel("John M");
        // add these new JLabel instances to this new panel instance,
        //     (they'll be added using JPanel's default layout
        //     manager, FlowLayout)

        String usrMsgInput = "\n" + JOptionPane.showInputDialog("Enter Something..");
        JLabel usrMsg = new JLabel(usrMsgInput);

        this.add(Box.createRigidArea(new Dimension(10,10)));
        this.add(myName);
        this.add(Box.createRigidArea(new Dimension(0,5)));
        this.add(usrMsg);
        this.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
    }

}//end MPanel
