import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(700,500);   // Setting windown size
        frame.setLayout(null);
		
		
		JLabel userName = new JLabel("User Name:");
		userName.setFont(new Font("Tahoma", Font.BOLD, 14));
		userName.setBounds(27, 70, 88, 30);
		frame.getContentPane().add(userName);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 135, 88, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(125, 70, 257, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 135, 257, 27);
		frame.getContentPane().add(passwordField);
		
		
		JLabel label = new JLabel("");
		label.setBounds(125, 325, 329, 27);
		frame.getContentPane().add(label);
		
		JButton buttonForgot = new JButton("Forgot Password");
		buttonForgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Your password will recover, When we will set up data base");	
			}
		});
		buttonForgot.setBounds(269, 173, 113, 17);
		frame.getContentPane().add(buttonForgot);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				label.setText(null); // Error statement runs, then label text will be empty. 
				String user = textField.getText();
				if(passwordField.getPassword().length == 0||textField.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Error!!! User Field is Empty");
					return;
				}
				
				label.setText("Successfully Logged in with "+user);
			}
		});
		buttonLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonLogin.setBounds(125, 226, 98, 30);
		frame.getContentPane().add(buttonLogin);
		
		
	}
}
