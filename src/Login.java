import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.foreign.AddressLayout;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends NewPage implements Serializable {

	public Login() {
		
		System.out.print("constructorrrr");
		RandevuBilgi hastaBilgileri=new RandevuBilgi();  // RANDEVU BİLGİDEN OBJE OLUŞTURDUM
		
		
        Container cp = getContentPane();
		cp.setBackground(new Color(173,240,253));
		cp.setSize(30,30);
		cp.setLocation(60,25);
		cp.setLayout(new FlowLayout());
		
		
		JLabel label1=new JLabel();
		label1.setText("SAĞLIK OCAĞI OTOMASYON SİSTEMİNE HOŞGELDİNİZ" );
		label1.setSize(75,150);
		label1.setLocation(620, 250);
		label1.setBounds(100,5,500,75);
		
		
		JLabel label2=new JLabel();
		label2.setText("KORONAVİRUS ALACAGINIZ TEDBİRLERDEN DAHA GUCLU DEGİLDİR");
		label2.setBounds(80,200,450,150);
		
		
		JTextField text1=new JTextField(11); //  TC NO İSTİYOR.
		text1.setSize(60,50);
		text1.setBounds(220, 80, 120, 20);
		
		
		JLabel label3=new JLabel();
		label3.setText("Lütfen TC Giriniz: ");
		label3.setBounds(20,65,80,250);
		label3.setSize(100,50);
	//////
		//İsim Soyisim 
		JLabel label_isim=new JLabel();
		label_isim.setText("Lütfen İsim Soyisim Giriniz: ");
		label_isim.setBounds(20,85,90,200);
		label_isim.setSize(180,50);
		cp.add(label_isim);
		
		
		JTextField text_hastaisim=new JTextField(11); //  İsim isteyecek.
		text_hastaisim.setSize(60,50);
		text_hastaisim.setBounds(220, 105, 120, 20);
		cp.add(text_hastaisim);
		
		/////
		
		
		
		
		JPasswordField IDnum=new JPasswordField(15);  //  şifre isteyecek 
		IDnum.setSize(60,50);
		IDnum.setBounds(220, 130, 125, 20);
		
		JLabel label4=new JLabel();
		label4.setText("Lütfen Şifrenizi Giriniz: " );
		label4.setSize(30,50);
		label4.setBounds(20,100,150,80);
		
		
		
		
		JButton btn1=new JButton();
		btn1.setText("GİRİŞ");
		btn1.setSize(60,50);
		btn1.setBounds(400, 200, 100, 50);
		
	
		//////// buton 1 in action u
		
      btn1.addActionListener(new ActionListener() {
    	  
			@Override
			public void actionPerformed(ActionEvent e) {
				NewPage new1= new NewPage();
				
				JLabel label4=new JLabel("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
				label4.setSize(50,80);
				label4.setBounds(80,15,300,80);
				
				
				
				new1.setLayout(null);
                new1.setResizable(false);
				
				new1.add(label4);
				
				JButton btn2=new JButton("Randevu Al");
				btn2.setSize(50,80);
				btn2.setBounds(100,100,200,50);
				new1.add(btn2);
				
				btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						NewPage new2=new NewPage();
						
						JLabel label5=new JLabel("Aile Hekimini seçiniz: ");
						label5.setSize(50,80);
						label5.setBounds(30,70,160,50);
						
						new2.add(label5);
						
						String drname_arr[]= {"Zenan Parlar", "Suat Birtan","Levent Atahanlı","Ela Altındağ"};
						JComboBox comboBox=new JComboBox(drname_arr);
						new2.getContentPane().add(comboBox);				
						comboBox.setBounds(250,90,150,20);
						
					
						 JButton rndvual_buton=new JButton("RANDEVUYU ONAYLA");
						 rndvual_buton.setSize(50,80);
						 rndvual_buton.setBounds(100,150,200,50);
						 new2.add(rndvual_buton);
						 //randevu_al butonunun aksiyon fonk u
						// 
						 
                         JLabel rndtarih_label=new JLabel("Lütfen Randevu Gününü Seçin: ");
						 
						 rndtarih_label.setBounds(30,30,250,50);
						 
						 new2.add(rndtarih_label);
						 
						 String rndgünü_arr[]= {"Pazartesi", "Salı","Çarşamba","Perşembe","Cuma"};
							JComboBox comboBox2=new JComboBox(rndgünü_arr);
							new2.getContentPane().add(comboBox2);				
							comboBox2.setBounds(250,45,150,20);
						 
						 /////
						rndvual_buton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							
							//////////////////////	
								
								try {
								    // Kullanıcıdan alınan verilerle RandevuBilgi nesnesini oluşturdum
									//dışardan aldığım değerle RandevuBilgi objesini oluşturdum
								    hastaBilgileri.set_ID(Integer.parseInt(text1.getText()));
								    hastaBilgileri.setPassword(new String(IDnum.getPassword()));
								    hastaBilgileri.setDate(comboBox2.getSelectedItem().toString());
								    hastaBilgileri.setDrName(comboBox.getSelectedItem().toString());
								    hastaBilgileri.set_hastaName(text_hastaisim.getText());

								    // Dosyaya .ser formatında yaz
								    try (BufferedWriter writer = new BufferedWriter(new FileWriter("DosyaIslemObj.ser", true))) {
								        // RandevuBilgi'yi dosyaya yaz
								        writer.write(hastaBilgileri.toString());
								        writer.newLine();  // Her satırın sonuna yeni satır karakteri ekledim
								        writer.flush();    // Veriyi  yaz ve sonra temizle

								        JOptionPane.showMessageDialog(null, "Bilgiler dosyaya başarıyla kaydedildi.");
								    } catch (IOException ex) {
								        ex.printStackTrace();
								        JOptionPane.showMessageDialog(null, "Dosyaya yazarken bir hata oluştu.");
								    }

								} catch (NumberFormatException ex) {
								    JOptionPane.showMessageDialog(null, "Lütfen geçerli bir TC NO girin. Randevu Alınamadı");
								}	
								
								
								
								
							
							}
						});
						 
					 /////////////////
					 
					
						
						 JLabel textArea = new JLabel();
					     textArea.setBounds(60, 200, 350, 150);
					     textArea.setText("Randevunuza Kimliğinizle beraber Randevu saatinden");
						 new2.add(textArea);
						 
						 JLabel textArea2 = new JLabel();
					     textArea2.setBounds(60, 250, 260, 150);
					     textArea2.setText("en az 15 dakika önce geliniz");
						 new2.add(textArea2);
						 
						 
						 new2.setLayout(null);
	                     new2.setResizable(false);
					}
				});
				
	
				
				
			///////////////
				JButton btn3=new JButton("Randevu Sil");
				btn3.setSize(50,80);
				btn3.setBounds(100,200,200,50);
				
				new1.add(btn3);
				
				btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						NewPage new3=new NewPage();
						
						JLabel rdvsil_label=new JLabel("Randevunuzu silmek istediğinizden emin misiniz?");
						rdvsil_label.setSize(50,80);
						rdvsil_label.setBounds(10,30,300,50);
						new3.add(rdvsil_label);
						
						
						
						
						JButton onayla_btn=new JButton("ONAYLA");
						onayla_btn.setBounds(100,200,200,50);
						new3.add(onayla_btn);
						
						
						new3.setLayout(null);
                        new3.setResizable(false);
                        
                        
                        onayla_btn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								String dosyaAdi = "DosyaIslemObj.ser";
								
							
								
								try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
						            // Dosyanın içeriğini temizleme
						         writer.write("");
						         JOptionPane.showMessageDialog(null, "Randevu silme işleminiz başarıyla gerçekleşti.");
						     } catch (IOException e1) {
						         e1.printStackTrace();
						         System.err.println("Dosya içeriği silinirken bir hata oluştu.");
						     }
								
							}
						});
						
					}
				});

				
				JButton btn4 =new JButton("Doktor Görüntüle");
				btn4.setSize(50,80);
				btn4.setBounds(100, 275, 200, 50);
				
				new1.add(btn4);
				
				btn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						NewPage newPage_drgörüntüle=new NewPage();
						
						JLabel drgörüntüle_label=new JLabel("****SAĞLIK OCAĞI HEKİM BİLGİ SAYFASI***");
						drgörüntüle_label.setBounds(50,20,330,50);
						newPage_drgörüntüle.getContentPane().add(drgörüntüle_label);
						
						
						
						
						JLabel bilgilendirmeArea=new JLabel();
						 bilgilendirmeArea.setBounds(10, 100, 500, 20);
					     bilgilendirmeArea.setText("ZENAN PARLAR, Atatürk Mahallesi, 01 Nolu Aile hekimi");
						 newPage_drgörüntüle.getContentPane().add(bilgilendirmeArea);
						 
						 
						 JLabel bilgilendirmeArea2=new JLabel();
						 bilgilendirmeArea2.setBounds(10, 150, 500, 20);
					     bilgilendirmeArea2.setText("SUAT BİRTAN, Cumhuriyet Mahallesi, 02 Nolu Aile hekimi");
						 newPage_drgörüntüle.getContentPane().add(bilgilendirmeArea2);
						 
						 
						 JLabel bilgilendirmeArea3=new JLabel();
						 bilgilendirmeArea3.setBounds(10, 200, 500, 20);
					     bilgilendirmeArea3.setText("LEVENT ATAHANLI, Mehmet Akif Mahallesi, 03 Nolu Aile hekimi");
						 newPage_drgörüntüle.getContentPane().add(bilgilendirmeArea3);
						 
						 JLabel bilgilendirmeArea4=new JLabel();
						 bilgilendirmeArea4.setBounds(10, 250, 500, 20);
					     bilgilendirmeArea4.setText("ELA ALTINDAĞ, Fatih Mahallesi, 04 Nolu Aile hekimi");
						 newPage_drgörüntüle.getContentPane().add(bilgilendirmeArea4);
						 
						 JLabel gereksiz=new JLabel();
						 newPage_drgörüntüle.add(gereksiz);
						 
						 newPage_drgörüntüle.setLayout(null);
                         newPage_drgörüntüle.setResizable(false);
					}
				});
				
				
//*******burası listeleme
				
				class NewPage extends JFrame {
				    private JList<String> randevuListesi;
				    private DefaultListModel<String> listModel;

				    public NewPage() {
				        // Pencere özellikleri
				        setTitle("Randevu Listesi");
				        setSize(400, 400);
				        setLayout(new FlowLayout());
				        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				        // JList ve DefaultListModel oluştur
				        listModel = new DefaultListModel<>();
				        randevuListesi = new JList<>(listModel);

				        // JList'i JScrollPane içine ekle
				        JScrollPane scrollPane = new JScrollPane(randevuListesi);
				        scrollPane.setPreferredSize(new Dimension(300, 300));
				        add(scrollPane);
				    }

				    public void showRandevuList() {
				        // Dosyadan randevu listesini oku ve JList'e ekle
				        List<String> randevuListesi = new ArrayList<>();

				        try (BufferedReader reader = new BufferedReader(new FileReader("DosyaIslemObj.ser"))) {
				            String line;
				            while ((line = reader.readLine()) != null) {
				                randevuListesi.add(line);
				            }
				        } catch (IOException ex) {
				            ex.printStackTrace(); // Dosya okuma hatası
				        }

				        if (!randevuListesi.isEmpty()) {
				            listModel.clear(); // Listeyi temizle
				            for (String infoString : randevuListesi) {
				                listModel.addElement(infoString);
				            }
				        } else {
				            listModel.clear();
				            listModel.addElement("Randevu bulunamadı.");
				        }

				        // Pencereyi göster
				        setVisible(true);
				    }
				}
				
				//5.buton yani listelemenin şeyi
				
				JButton btn5 =new JButton("Randevu Listele");
				btn5.setSize(50,80);
				btn5.setBounds(100, 350, 200, 50);
				
				new1.add(btn5);
				
				
				
				NewPage newPage_randevuList=new NewPage();
				btn5.addActionListener(new ActionListener() {
					@Override
		          public void actionPerformed(ActionEvent e) {
						
						NewPage newPage_randevuList=new NewPage();
						 newPage_randevuList.showRandevuList();
		          }
		      });
		
		
			}
			
		});
	
      
		//////////////////// cp.add ler 
      
      cp.setLayout(null);
		cp.add(label1);
		cp.add(text1);
		cp.add(label3);
		cp.add(label4);
		cp.add(label2);
		cp.add(IDnum);
		cp.add(btn1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Saglik Ocagi Randevu Sistemi");
	    setLocationRelativeTo(null); // açılan pencere ortada açılacak
	    setSize(700, 500);  // 
	    setVisible(true);
		
		
	}
}
