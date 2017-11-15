import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Alberto Canela");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Getting Screen Dimensions to put on program on center.
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		myFrame.setLocation((int)Math.ceil(width/2-100), (int)Math.ceil(height/2-100));
		myFrame.setSize(200, 200);
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        
		myFrame.setVisible(true);
	}
}