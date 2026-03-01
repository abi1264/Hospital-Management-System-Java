package Login_Signup;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login_Authentication {
	Connection connection;
	String email_db,password_db;
	public Login_Authentication(DataBase_Connection conn) throws SQLException{
			connection=conn.getConnection();
			
	}
	public void ValidateUser(String email,String password) throws SQLException {
		String sql="SELECT * FROM users WHERE email=?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1,email);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			String password_db=rs.getString("password");
			if(password.equals(password_db)) {
				System.out.println("Successfully logged in!");
				DataBase_Connection db=new DataBase_Connection(); //my own class object
				UserDashBoard user=new UserDashBoard(email,db);
				user.setVisible(true);
				
			}
			else {
				System.out.println("Invalid password");
				
			}
			
		}
		else {
		System.out.println("Email not Found");
		}
		rs.close();
		ps.close();
		connection.close();
		
	}
}
		