// CS 235 Fall 2019 Assignment #2
// SimpleLabelTest.java file

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * a first JFrame-plus-JPanel-plus-JLabel example
 *
 * structure adapted from "Core Java", 9th ed, p. 354-355
 * 
 * @author Cay Horstmann
 * @author adapted by Sharon Tuttle
 * @author further adapted by David C. Tuttle
 * @version 2019-10-17
 */

public class SimpleLabelTest {
    /**
     * creates a simple frame that happens to contain a panel with a label 
     * 
     * @param args not used here
     */
    
    public static void main(String[] args) {   
        LabelFrame aFrame = new LabelFrame();            
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.setVisible(true);
    }
}

/**
 * a simple frame that contains a panel with some JLabel instances
 */

class LabelFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    
    public LabelFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setTitle("frame + panel + labels");
        
        // creating a custom panel -- default-visibility
        // JPanel subclass is below

        LabelPanel aLabelPanel = new LabelPanel();
        
        // you can add something (hopefully a suitable sub-container)
        // to a frame's content pane using its add method
        
        this.add(aLabelPanel);
    }
}

/**
 * a panel with some JLabel instances on it
 */

class LabelPanel extends JPanel {
    /**
     * constructs a label panel instance
     */
    
    public LabelPanel() {
        // one of JLabel's constructors: expects a String,
        //     produces a JLabel with that text on it

        JLabel greeting = new JLabel("     Hi! I'm a JLabel!      ");
        JLabel salutation = new JLabel("Salutations and "
                                           + "Felicitations!");
        JLabel farewell = new JLabel("And now, bye!");
                                        
        // add these new JLabel instances to this new panel instance,
        //     (they'll be added using JPanel's default layout
        //     manager, FlowLayout)
        
        this.add(greeting);
        this.add(salutation);
        this.add(farewell);
    }
}
        
        