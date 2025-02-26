import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class Form extends JFrame {

	public String name, branch, gender, addr, pass;
	private JPanel contentPane;
	private JTextField tn;
	private JTextField ta;
	private JPasswordField tp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tn = new JTextField();
		tn.setFont(new Font("Tahoma", Font.BOLD, 16));
		tn.setBounds(206, 35, 256, 31);
		contentPane.add(tn);
		tn.setColumns(10);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ISE", "ECE"}));
		cb.setBounds(206, 97, 199, 31);
		contentPane.add(cb);
		
		JCheckBox rb1 = new JCheckBox("Male");
		rb1.setBounds(206, 162, 97, 23);
		contentPane.add(rb1);
		
		JCheckBox rb2 = new JCheckBox("Female");
		rb2.setBounds(324, 162, 97, 23);
		contentPane.add(rb2);
		
		ta = new JTextField();
		ta.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		ta.setBounds(206, 235, 256, 50);
		contentPane.add(ta);
		ta.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				name = tn.getText();
				branch = (String)cb.getSelectedItem();
				
				// Validation Checking of checkBox
				if(rb1.isSelected()){
					gender= "Male";
				} else if(rb2.isSelected()){
					gender = "Female";
				}
				
				addr = ta.getText();
				pass = tp.getText();
				

				System.out.println("Name :  "+name);
				System.out.println("Branch :  "+branch);
				System.out.println("Gender :  "+gender);
				System.out.println("Address :  "+addr);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(479, 399, 106, 23);
		contentPane.add(btnNewButton);
		
		tp = new JPasswordField();
		tp.setBounds(206, 326, 145, 23);
		contentPane.add(tp);
	}
}
