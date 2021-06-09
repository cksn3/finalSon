package finalSon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame window = new frame();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame() {	
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
		}
		});
		btnNewButton.setBounds(432, 195, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Sayi Girin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 23, 85, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(167, 22, 124, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSayiTrGirin = new JLabel("Sayi T\u00FCr\u00FC Girin");
		lblSayiTrGirin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSayiTrGirin.setBounds(10, 56, 139, 21);
		frame.getContentPane().add(lblSayiTrGirin);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"bir se\u00E7im yap\u0131n\u0131z", "Armstrong", "M\u00FCkemmel Say\u0131 ", "Palindromik"}));
		comboBox_1.setBounds(175, 55, 116, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblSayiTrGirin_1 = new JLabel("\u0130lave \u0130\u015Flem");
		lblSayiTrGirin_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSayiTrGirin_1.setBounds(10, 110, 139, 21);
		frame.getContentPane().add(lblSayiTrGirin_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"ilave i\u015Flem", "1", "2", "3"}));
		comboBox_1_1.setBounds(175, 109, 116, 21);
		frame.getContentPane().add(comboBox_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(389, 10, 173, 161);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuc");
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSonuc.setBounds(320, 23, 85, 21);
		frame.getContentPane().add(lblSonuc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(167, 59, 124, 21);
	
		
		
	}
}
