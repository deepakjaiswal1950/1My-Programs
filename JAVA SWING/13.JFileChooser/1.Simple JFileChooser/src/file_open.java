import javax.swing.*;    
import java.awt.event.*;    
import java.io.*;    
public class file_open extends JFrame implements ActionListener{    

	JMenuBar mb;    
	JMenu file;
	JMenuItem open;    
	JTextArea ta;   
	
	// constructor
	file_open() {    
		open=new JMenuItem("Open File");    
		open.addActionListener(this);            
		file=new JMenu("File");    
		file.add(open);             
		mb=new JMenuBar();    
		mb.setBounds(0,0,800,20);    
		mb.add(file);              
		ta=new JTextArea(800,800);    
		ta.setBounds(0,20,800,800);              
		add(mb);    
		add(ta);              
	}


	// perform action on select open
	public void actionPerformed(ActionEvent e) {    
	
		if(e.getSource()==open){    
    	
			JFileChooser fc=new JFileChooser();    
			int i=fc.showOpenDialog(this);
    
			if(i==JFileChooser.APPROVE_OPTION){    
				File f=fc.getSelectedFile();    
				String filepath=f.getPath();    
	        
				try{  
					BufferedReader br=new BufferedReader(new FileReader(filepath));    
					String s1="",s2="";                         
		        
					while((s1=br.readLine()) != null){    
						s2+=s1+"\n";    
					}    
					ta.setText(s2);    
		        
					br.close();    
				}catch (Exception ex) {ex.printStackTrace();  }                 
			}    
		}
		
	}          
	
	
	public static void main(String[] args) { 
	
    		 file_open om=new file_open();    
             om.setSize(500,500);    
             om.setLayout(null);    
             om.setVisible(true);    
             om.setDefaultCloseOperation(EXIT_ON_CLOSE);    
	}    
}  