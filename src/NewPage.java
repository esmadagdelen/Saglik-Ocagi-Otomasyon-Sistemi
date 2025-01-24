import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

class NewPage extends JFrame {
	
	private JList<String> randevuListesi;
    private DefaultListModel<String> listModel;
	
    public NewPage() {
    		
    
    			
    	Container cp = getContentPane();
		
		cp.setBackground(new Color(173,240,253));
		cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		
		/////////////////////////////////////
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	    setTitle("Saglik Ocagi Randevu");
	    
	    setLocationRelativeTo(null); 
	    setSize(500, 450);  
	    setVisible(true);
    }

    
    
    
    
    
}
