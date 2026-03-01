package Login_Signup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	JLabel email,password;
	JTextField emailText;
	JPasswordField passwordText;
	LoginPageEventHandler handler1;
	
	public LoginPage() {
		
			setTitle("Login Page");
			setSize(900,900);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			LoginPageMethod();
			setVisible(true);		
						}
	
	public void LoginPageMethod() {
		setLayout(null);
		
		JPanel p0=new JPanel();
		JLabel desc=new JLabel("Enter the registered Email and Password");
		p0.add(desc);
		add(p0);
		p0.setBounds(20,10,500,30);
		
		//for Email
		JPanel p1=new JPanel();
		email=new JLabel("Email : ");
		p1.add(email);
		
		emailText=new JTextField(20);
		p1.add(emailText);
		
		add(p1);
		p1.setBounds(50, 50, 300, 40);
		
		
		//for Password
		JPanel p2=new JPanel();
		password=new JLabel("Password : ");
		p2.add(password);
		
		passwordText=new JPasswordField(20);
		p2.add(passwordText);
		
		add(p2);
		p2.setBounds(50, 100, 300, 40);
		
		//For Login button
		JPanel p3=new JPanel();
		JButton login =new JButton("Login");
		p3.add(login);
		add(p3);
		p3.setBounds(50,150,300,40);
		
		handler1=new LoginPageEventHandler(this);
		login.addActionListener(handler1);
		
	}

}
