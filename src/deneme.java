import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class deneme {
	
	//Test class ı
	//
	
	public static void main(String[] args) {
	      // Run the GUI codes on Event-Dispatching thread for thread safety
	      SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new Login(); 
	         }
	        
	      });
	   
	      
	   }
	
}
