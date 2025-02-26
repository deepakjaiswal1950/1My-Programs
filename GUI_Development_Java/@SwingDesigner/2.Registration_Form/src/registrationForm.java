import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class registrationForm {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationForm window = new registrationForm();
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
	public registrationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 11));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 821, 601);
		frame.setResizable(false); // Used to restrict window to resize. 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("           Welcome To Student Registration Form");
		title.setBackground(Color.ORANGE);
		title.setForeground(Color.BLUE);
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 28));
		title.setBounds(10, 26, 785, 43);
		frame.getContentPane().add(title);
		
		JLabel lblNewLabel = new JLabel("Student Usn:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 120, 130, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name:");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 157, 130, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student Email Id:");
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 194, 155, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student Mobile Number:");
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 231, 211, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(230, 230, 250));
		t1.setBounds(167, 125, 258, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(230, 230, 250));
		t2.setBounds(177, 162, 266, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBackground(new Color(230, 230, 250));
		t3.setBounds(187, 199, 266, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBackground(new Color(230, 230, 250));
		t4.setBounds(220, 237, 266, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender:");
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 269, 116, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBackground(new Color(230, 230, 250));
		male.setFont(new Font("Cambria", Font.BOLD, 15));
		male.setBounds(112, 271, 109, 23);
		frame.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBackground(new Color(230, 230, 250));
		female.setFont(new Font("Cambria", Font.BOLD, 15));
		female.setBounds(525, 281, 109, 23);
		frame.getContentPane().add(female);
		
		JLabel lblNewLabel_5 = new JLabel("Student Branch:");
		lblNewLabel_5.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_5.setBounds(10, 301, 155, 26);
		frame.getContentPane().add(lblNewLabel_5);
		
		String str[] = {"Computer Science Engineering","Information Science Engineering","Electronic & Communication Engineering","Civil Engineering","Mechnical Engineering"};
		JComboBox<String> comboBox = new JComboBox(str);
		comboBox.setFont(new Font("Cambria", Font.PLAIN, 14));
		comboBox.setBounds(187, 305, 323, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Skills:");
		lblNewLabel_6.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_6.setBounds(10, 338, 97, 26);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox c1 = new JCheckBox("MANAGEMENT");
		c1.setBackground(new Color(230, 230, 250));
		c1.setFont(new Font("Cambria", Font.BOLD, 16));
		c1.setBounds(112, 342, 140, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(230, 230, 250));
		c2.setFont(new Font("Cambria", Font.BOLD, 16));
		c2.setBounds(303, 342, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(new Color(230, 230, 250));
		c3.setFont(new Font("Cambria", Font.BOLD, 16));
		c3.setBounds(454, 342, 97, 23);
		frame.getContentPane().add(c3);
		
		JCheckBox c4 = new JCheckBox("DATA STRCTURE");
		c4.setBackground(new Color(230, 230, 250));
		c4.setFont(new Font("Cambria", Font.BOLD, 16));
		c4.setBounds(112, 379, 155, 23);
		frame.getContentPane().add(c4);
		
		JCheckBox c5 = new JCheckBox("PLANNING");
		c5.setBackground(new Color(230, 230, 250));
		c5.setFont(new Font("Cambria", Font.BOLD, 16));
		c5.setBounds(303, 381, 122, 23);
		frame.getContentPane().add(c5);
		
		JCheckBox c6 = new JCheckBox("HELLO WORLD");
		c6.setBackground(new Color(230, 230, 250));
		c6.setFont(new Font("Cambria", Font.BOLD, 16));
		c6.setBounds(454, 381, 160, 23);
		frame.getContentPane().add(c6);
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Checking text field is empty or not
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Error!!! Fields are Empty");
					return;
				}
				
				// Gender CheckBox is ticked or not
				if(male.isSelected() && female.isSelected()){ // Both ticked
					JOptionPane.showMessageDialog(null,"Please select any one gender");
					return;
				}else if(!male.isSelected() &&  !female.isSelected()){ // Both not ticked
					JOptionPane.showMessageDialog(null,"Please select gender");
					return;
				}
				
				
				// Skill checkBox checking is ticked or not
				if(!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected() && !c5.isSelected() && !c6.isSelected()){
					JOptionPane.showMessageDialog(null,"Please select atleast one skill");
					return;
				}
				
				// At last show action
				JOptionPane.showMessageDialog(null,"Successfully got submitted");
			}
			
		});
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(220, 20, 60));
		btn.setFont(new Font("Cambria", Font.BOLD, 17));
		btn.setBounds(311, 452, 114, 33);
		frame.getContentPane().add(btn);
		
		
	}
}
