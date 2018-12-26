package dainam.edu.vn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class LienHe extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LienHe frame = new LienHe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}

	
		public LienHe() {
			addWindowListener(new WindowAdapter() {
				
				
			
				public void windowClosing(WindowEvent e) {
					
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			     

					setVisible(false); 
	                 dispose();
		               
			           
			        
					
				}
			});
		
		 
		    
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		setTitle("Thông tin Liên Hệ ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("    ");
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		label.setIcon(new ImageIcon(LienHe.class.getResource("/icon/B.JPG")));
		label.setBounds(30, -11, 580, 306);
		panel.add(label);
		
		JLabel label_1 = new JLabel("  :  PHẠM VĂN THƯƠNG");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(302, 98, 190, 51);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("  :  0344638859");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(303, 146, 170, 29);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(LienHe.class.getResource("/icon/user-male-edit-icon.png")));
		label_3.setBounds(269, 107, 42, 68);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Giảng viên hướng dẫn : PHẠM VĂN TIỆP");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_4.setBounds(23, 236, 288, 70);
		panel.add(label_4);
		
		JButton buttonThoat = new JButton();
		buttonThoat.setIcon(new ImageIcon(LienHe.class.getResource("/icon/iconfinder_back_3203.png")));
	
		 buttonThoat.addActionListener(new java.awt.event.ActionListener() {
	        
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	
	            	
	                 setVisible(false); 
	                 dispose();
	                           
	            	 
	            	
	            	 
	             	
	            }
	        });
		buttonThoat.setText("Về Trang Chủ");
		buttonThoat.setForeground(Color.WHITE);
		buttonThoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonThoat.setBackground(new Color(0, 153, 255));
		buttonThoat.setBounds(405, 236, 163, 51);
		panel.add(buttonThoat);
	}

}
