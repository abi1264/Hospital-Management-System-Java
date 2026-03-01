package Login_Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEventHandler implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Login button is clicked");
		LoginPage page1=new LoginPage();
	}

}
