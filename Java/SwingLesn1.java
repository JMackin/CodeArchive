import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class SwingLesn1 extends JFrame{
  
  
  public static void main(String[] args){
    
    new SwingLesn1();
   
  }//end main
 
  public SwingLesn1(){
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    
    int xPos = (dim.width / 2) - (this.getWidth() / 2);
    int yPos = (dim.height / 2) - (this.getHeight() / 2);    
    
    this.setSize(500,500);
    this.setLocation(xPos , yPos);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("It's A window");
    
    JPanel aPanel = new JPanel();
    JLabel aLabel = new JLabel("Text Here");
    
    aLabel.setText("Some Text");
    
    JButton aButton = new JButton("Enter");
    
    aButton.setContentAreaFilled(true);
    
    JTextField aTextF = new JTextField("Type here\n", 15);
    aTextF.setColumns(10);
    
    JTextArea aTextArea = new JTextArea(15,20);
    aTextArea.setText("alotta text\n");
    aTextArea.setLineWrap(true);
    aTextArea.setWrapStyleWord(true);
    
    int numOLines = aTextArea.getLineCount();
    
    aTextArea.append("Line Number: " + numOLines);
    
    JScrollPane scrollA = new JScrollPane(aTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     
    this.add(aPanel);
    aPanel.add(aLabel);
    aPanel.add(aButton);
    aPanel.add(aTextF);
    aPanel.add(scrollA);
    this.setVisible(true);
    
    aTextF.requestFocus();
  
  }//end Temp
 
}//end class