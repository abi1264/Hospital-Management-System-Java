package Login_Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPageEventHandler implements ActionListener {
	//Here getting the SignUpPage
	private SignUpPage page;// just a declaration
	
	//Constructor that receives the SignUpPage object
	public SignUpPageEventHandler(SignUpPage page) {
		this.page=page;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SignUp button clicked from SignUp Page");
	
		//collect data from UI (page object ma kun field ma save gareako theyo tyo access garney)
		String name=page.nameText.getText();
		String address=page.addressText.getText();
		String contact=page.contactText.getText();
		String email=page.emailText.getText();
		String password=new String(page.passwordText.getPassword());
		
		String gender="";
		if(page.male.isSelected()) {
			gender="Male";
		}
		else if(page.female.isSelected()) {
			gender="Female";
		}
		//age is selected from comboBox
		int age=(int)page.age.getSelectedItem();
		
		try {
			//yaha chai new connection banau auta anii tyo connection object
			//RegisterUser ma jancha . aba RegisterUser ma auta user object banau ani
			//connection create garne method MakeConnection() user gara anii finally
			//insertUser call garera save gara
			
			DataBase_Connection db=new DataBase_Connection();
			RegisterUser user=new RegisterUser();
			
			user.MakeConnection(db);
			
			user.insertUser(
					name,
					address,
					contact,
					gender,
					age,
					email,
					password
					);
		
			//Redirecting to the Login page
			LoginPage page1=new LoginPage();
			
			//Redirecting to the respective UserDashBoard
			//UserDashBoard dashBoard1=new UserDashBoard();
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
