		package Login_Signup;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		
		public class DbConnection {
			
			
			public DbConnection()  {
				DbConnect();
			}
		
					public void DbConnect()  {
						Connection conn=null;
						Statement st=null;
						ResultSet rs=null;
						
					
						try {
							
							//Step1  in JDBC
							Class.forName("org.postgresql.Driver");
							
						//step 2
						
						String url="jdbc:postgresql://localhost:5432/JAVA";
						String userName="postgres";
						String password="abishek";
						
						 conn=DriverManager.getConnection(url,userName,password);
						
						//step3
							
						st=conn.createStatement();   //Statement and CreateStatement are keywords from java.sql
						
						//step 4 and 5 combines
						 rs=st.executeQuery("select * from student");
						
						//query execute garyo ra store garyo ekkaii choti
						
						//step 6
						while(rs.next()){
							String uusername=rs.getString("username");
							String ppassword=rs.getString("password");
							String email=rs.getString("email");
							System.out.println("UserName : "+ uusername + ",Password : " + ppassword);
							System.out.println("Email: "+ email);
									
								}
						}
						
						catch(ClassNotFoundException e) {
							System.out.println("Driver not found: " + e.getMessage());
							}
						
						catch(SQLException e) {
							System.out.println("Database Error: "+e.getMessage());
						}
						
						
						
						//step 7
						finally {
							try {
							if(rs!=null) 
							rs.close();
								
							}
							catch(SQLException e) {
								System.out.println("Error closing resultSet :" + e.getMessage());
								
							}
								
							
							try {
								if(st!=null)
								st.close();
							}
							catch(SQLException e) {
								System.out.println("Error Closing Statement :" + e.getMessage());
							}
						
							try {
								if(conn!=null)
				
						conn.close();
							}
							catch(SQLException e) {
								System.out.println("Error Closing Connection :" + e.getMessage());
							}
							
						
						}
		
					}
				}
		
		
