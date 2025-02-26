import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Calc {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 771, 495);
		frame.setResizable(false);
		frame.setTitle("Calc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num1:");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 49, 60, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num2:");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 117, 60, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(41, 257, 99, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 16));
		t1.setBackground(new Color(173, 216, 230));
		t1.setBounds(102, 49, 136, 31);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 16));
		t2.setBackground(new Color(173, 216, 230));
		t2.setBounds(102, 117, 136, 31);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel res = new JLabel("");
		res.setForeground(new Color(255, 255, 255));
		res.setFont(new Font("Arial Black", Font.BOLD, 25));
		res.setBounds(129, 245, 239, 41);
		frame.getContentPane().add(res);
		
		JButton btnSub = new JButton("SUB");
		btnSub.setBackground(new Color(139, 0, 0));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Float n1 = Float.parseFloat(t1.getText());
				Float n2 = Float.parseFloat(t2.getText());
				Float sub = n1-n2;
				
				res.setText(Float.toString(sub));
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBounds(497, 48, 70, 33);
		frame.getContentPane().add(btnSub);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.setBackground(new Color(139, 0, 0));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Float n1 = Float.parseFloat(t1.getText());
				Float n2 = Float.parseFloat(t2.getText());
				Float div;
				
				try{
					div = n1/n2;
					res.setText(Float.toString(div));
				}catch(Exception ex){
					res.setText(("DIvided by zero"));
				}
				
				
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(497, 117, 70, 31);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("MUL");
		btnMul.setBackground(new Color(139, 0, 0));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Float n1 = Float.parseFloat(t1.getText());
				Float n2 = Float.parseFloat(t2.getText());
				Float mul = n1*n2;
				
				res.setText(Float.toString(mul));
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(333, 116, 70, 32);
		frame.getContentPane().add(btnMul);
		
		
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(165, 42, 42));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Float n1 = Float.parseFloat(t1.getText());
				Float n2 = Float.parseFloat(t2.getText());
				Float sum = n1+n2;
				
				res.setText(Float.toString(sum));
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(333, 48, 70, 32);
		frame.getContentPane().add(btnAdd);
		
		
	}
}
