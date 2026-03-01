package Login_Signup;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DataBase_Connection {
	
//method to return connection object
			public Connection getConnection () throws SQLException  {
				Connection conn=null;
				Statement st=null;
				ResultSet rs=null;
				
				try {
				Class.forName("org.postgresql.Driver");
				}
				catch(ClassNotFoundException e) {
					System.out.println("Error getting Driver: "+ e.getMessage());
				}
				
				
				String url="jdbc:postgresql://localhost:5432/JAVA";
				String userName="postgres";
				String password="abishek";
				
				conn=DriverManager.getConnection(url,userName,password);
				return(conn);
	
}
}
