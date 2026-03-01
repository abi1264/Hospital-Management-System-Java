package Login_Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageEventHandler implements ActionListener {
LoginPage page;
	
	public LoginPageEventHandler(LoginPage page) {
		this.page=page;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//collect data from UI (LoginPage page object ma kun field ma save gareako theyo tyo access garney)
		String email=page.emailText.getText();
		String password=new String(page.passwordText.getPassword());
		
		
		try {
		DataBase_Connection db=new DataBase_Connection();
		
		Login_Authentication auth=new Login_Authentication(db);
		
		
		auth.ValidateUser(email,password);
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	

}
