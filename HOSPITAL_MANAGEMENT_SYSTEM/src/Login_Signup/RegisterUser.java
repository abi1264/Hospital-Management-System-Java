package Login_Signup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterUser {
	Connection connection;
	
	public void MakeConnection(DataBase_Connection conn) throws SQLException  {
		connection=conn.getConnection();
	}
		
	public void insertUser(String Username,String Address, String Contact, String Gender,int age,String Email,String Password) throws SQLException {
		String sql="INSERT INTO users(name,address,contact,gender,age,email,password)VALUES(?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1,Username);
		ps.setString(2,Address);
		ps.setString(3,Contact);
		ps.setString(4,Gender);
		ps.setInt(5,age);
		ps.setString(6,Email);
		ps.setString(7,Password);
		
		ps.executeUpdate();
		
		System.out.println("User Registered Successfully");
			
		}
		
	}

