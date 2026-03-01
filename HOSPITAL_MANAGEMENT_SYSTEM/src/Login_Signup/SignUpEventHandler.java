package Login_Signup;

import java.awt.event.ActionEvent;
//FIRST PAGE where login and signUp buttons are only there
import java.awt.event.ActionListener;

public class SignUpEventHandler implements ActionListener{
	@Override
	 public void actionPerformed(ActionEvent e) {
		System.out.println("SignUp button is clicked");
		SignUpPage page1=new SignUpPage();
			
	}
	

}
