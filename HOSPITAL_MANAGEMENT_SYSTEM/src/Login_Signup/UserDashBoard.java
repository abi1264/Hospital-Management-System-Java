package Login_Signup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserDashBoard extends JFrame {
	JLabel name,address,contact,age,email,gender;
	JPanel p1,p2,p3,p4,p5,p6;
	Connection conn;
	String e_mail;
	DataBase_Connection db;
	String dbName;
	String dbAddress;
	String dbContact;
	int dbAge;
	String dbGender;
	String dbEmail;
	
	
	public UserDashBoard(String email,DataBase_Connection db) throws SQLException {
		
		e_mail=email;
		this.db=db;
		try {
			MakeConnection(db);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		setTitle("User DashBoard");
		setSize(900,700);
		setLocation(300,40);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//Top Panel
		JPanel head=new JPanel();
		JLabel title=new JLabel("USER INFORMATION");
		head.add(title);
		add(head);
		head.setBounds(350,10,200,50);
		
		//call methods
		//first fetch 
		MakeConnection(db);
		GetName();
		GetAddress();
		GetContact();
		GetAge();
		GetGender();
		GetEmail();
		setVisible(true);	
	}
	
	//just fetch all the data of the user provided that the email and store in variables.
	public void MakeConnection(DataBase_Connection conn) throws SQLException {
		this.conn=conn.getConnection();
		String sql="SELECT * FROM users WHERE email=?";
		PreparedStatement ps=this.conn.prepareStatement(sql);
		ps.setString(1,e_mail);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			dbName=rs.getString("name");
			dbAddress=rs.getString("address");
			dbContact=rs.getString("contact");
			dbAge=rs.getInt("age");
			dbGender=rs.getString("Gender");
			dbEmail=rs.getString("Email");
		}
	}
	
	public void GetName() {
		
		p1=new JPanel();
		name=new JLabel("UserName : " + dbName);
		p1.add(name);
		add(p1);
		p1.setBounds(100,80,300,40);
		
	}
	
	public void GetAddress()
	{
		
		p2=new JPanel();
		address=new JLabel("Address : " + dbAddress);
		p2.add(address);
		
		add(p2);
		p2.setBounds(100,130,300,40);
		
	}
	
	public void GetContact() {
		p3=new JPanel();
		contact=new JLabel("Contact : "+ dbContact);
		p3.add(contact);
		add(p3);
		p3.setBounds(100,180,300,40);
			
	}
	
	public void GetAge() {
		p4=new JPanel();
		age=new JLabel("Age : " + dbAge);
		p4.add(age);
		add(p4);
		p4.setBounds(100,230,300,40);
		
	}
	
	public void GetGender() {
		p5=new JPanel();
		gender=new JLabel("Gender : " + dbGender);
		p5.add(gender);
		add(p5);
		p5.setBounds(100,280,300,40);
	}
	
	public void GetEmail() {
		p6=new JPanel();
		email=new JLabel("Email : " + dbEmail);
		p6.add(email);
		add(p6);
		p6.setBounds(100,330,300,40);
		
	}
}
