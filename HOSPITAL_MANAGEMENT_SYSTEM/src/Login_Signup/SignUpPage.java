package Login_Signup;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpPage extends JFrame {
	SignUpPageEventHandler handler1;
	
	JComboBox<Integer>age;    //just a declaration
	
	JLabel name ,address,contact, gender ,email, password,ageLabel;
	JTextField nameText,addressText,contactText,emailText;
	JRadioButton male,female;
	JPasswordField passwordText;
	JButton submit;
	
	public SignUpPage() {
		setTitle("SignUP Page/Registration Page");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		SignUpPageMethod();
		  setVisible(true);

	}
	
	public void SignUpPageMethod() {
		
		//Name
		    JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        name = new JLabel("Name : ");
	        p1.add(name);
	        nameText = new JTextField(15);
	        p1.add(nameText);
	        add(p1);
	        
	        //Address
	        JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        address = new JLabel("Address : ");
	        p2.add(address);
	         addressText = new JTextField(15);
	        p2.add(addressText);
	        add(p2);
	        
	        //Contact
	        JPanel p6=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        
	        ImageIcon numberIcon = new ImageIcon("C:/Users/HP/Pictures/MEmu Photo/call.jpg");
	        Image img=numberIcon.getImage();
	        Image scaledImage=img.getScaledInstance(20,20,Image.SCALE_SMOOTH);
	        numberIcon=new ImageIcon(scaledImage);
	        contact = new JLabel(numberIcon);
	        // number.setPreferredSize(new Dimension(5, 5));
	         
	        p6.add(contact);
	        contactText = new JTextField(15);
	        p6.add(contactText);
	        add(p6);
	        
	        //Gender
	        JPanel p3=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        gender = new JLabel("Gender : ");
	        p3.add(gender);

	         ButtonGroup bg = new ButtonGroup();

	        male = new JRadioButton("Male");
	         p3.add(male);
	        female = new JRadioButton("Female");
	        p3.add(female);

	        bg.add(male);
	        bg.add(female);
	        add(p3);
	        
	        //age
	       JPanel p10=new JPanel(new FlowLayout(FlowLayout.CENTER));
	       ageLabel=new JLabel("Age : ");
	       p10.add(ageLabel);
	       
	       age=new JComboBox<>(); //this is instatation
	       
	       for(int i=0;i<100;i++) {
	    	  age.addItem(i);
	       }
	       p10.add(age);
	       
	       add(p10);
	       
	       
	        //Email
	        JPanel p9=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        email=new JLabel("Email : ");
	        emailText=new JTextField(20);
	        p9.add(email);
	        p9.add(emailText);
	        add(p9);
	        
	       //Password
	        JPanel p8=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        password=new JLabel("Password : ");
	        passwordText = new JPasswordField(20);
	        p8.add(password);
	        p8.add(passwordText);
	        add(p8);
	        
	        JPanel p11=new JPanel(new FlowLayout(FlowLayout.CENTER));
	        submit=new JButton("Submit ");
	        p11.add(submit);
	        add(p11);
	        
	      //Listen SignUp Action
			handler1=new SignUpPageEventHandler(this);
			submit.addActionListener(handler1);
     
	}
	
}
