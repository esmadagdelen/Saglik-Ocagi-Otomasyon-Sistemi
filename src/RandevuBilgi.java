import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class RandevuBilgi implements Serializable{
	
	private int ID;
	
	private String hastaName;
	
	private String doctorName;
	
	private String randevuDate;
	
	private String password;
	
	
	
	
	
	
	public void RandevuAl(int ID, String doctorName, String hastaName, String randevuDate, String password) {
		
		set_ID(ID); 
		
        set_hastaName(hastaName);
        
        setDrName(doctorName);
        
        setDate(randevuDate);
        
        setPassword(password);
		
	}
	
	
	//getter setter kullandım private lara erisim saglayabilmek icin
	
	
	public String get_hastaName() {
		
		return this.hastaName;
	}
	
	public void set_hastaName(String hastaName) {
		
		this.hastaName=hastaName;
	}

	
	
	public int get_ID() {
		
		return this.ID;
	}
	
	public void set_ID(int ID) {
		
		this.ID=ID;
	}

	
	public String getDrName() {
		
		return this.doctorName;
	}
	
	public void setDrName(String doctorName) {
		
		this.doctorName=doctorName;
	}

	
	public String getDate() {
		
		return this.randevuDate;
	}
	
	public void setDate(String randevuDate) {
		
		this.randevuDate=randevuDate;
	}
	
	public String getPassword() {
		
		return this.password;
	}
	
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	
	
	public String toString() {
		
		return "Randevu Bilgi: TC :"+ID+",İsim-Soyisim: "+hastaName+",Doktor İsmi: "+doctorName+", Randevu Tarihi: "+randevuDate;
		
	}
	
}
