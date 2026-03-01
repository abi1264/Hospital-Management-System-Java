package Login_Signup;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EntryPage extends JFrame {
	SignUpEventHandler handler1;
	LoginEventHandler handler2;
	JButton login,signup;
	JLabel name,address,contact;
	public EntryPage() {
		setTitle("Login/SignUp Page");
		setSize(900,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//Introduction
		name=new JLabel("<html>Welcome to Grande International Hospital<html>");
		name.setBounds(350,10,300,200);
		add(name);
		
		//address
		address=new JLabel("<html>Kathmandu, Nepal<html>");
		address.setBounds(400,30,300,200);
		add(address);
		
		//contact
		contact=new JLabel("<html>Contact Us : 0114567");
		contact.setBounds(400,50,300,200);
		add(contact);
		
		//for Login button
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		login=new JButton("Login");
		p1.add(login);
		add(p1);
		p1.setBounds(400,300,100,50);
		
		//Listen Login Action
		handler2=new LoginEventHandler();
		login.addActionListener(handler2);
		
		
		//for SignUp button
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
		signup=new JButton("SignUp");
		p2.add(signup);
		add(p2);
		p2.setBounds(400,200,100,50);
		
		//Listen SignUp Action
		handler1=new SignUpEventHandler();
		signup.addActionListener(handler1);
		
	
		setVisible(true);
		
	}
	

}
