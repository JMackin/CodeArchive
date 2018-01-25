import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Temp extends JFrame{
  
  
  public static void main(String[] args){
    
    new Temp();
   
  }//end main
 
  public Temp(){
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    
    int xPos = (dim.width / 2) - (this.getWidth() / 2);
    int yPos = (dim.height / 2) - (this.getHeight() / 2);    
    
    this.setSize(500,500);
    this.setLocation(xPos , yPos);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("It's A window");
  
  }//end Temp
 
}//end class