package eticaret;

import eticaret.business.abstracts.UserService;
import eticaret.core.concretes.EmailValidatorManager;
import eticaret.core.concretes.InputVerification;
import eticaret.core.concretes.JGoogleUserVerificationServiceAdapter;
import eticaret.entities.concretes.User;
import eticaret.business.concretes.*;
import eticaret.dataAccess.concretes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user =new User(1,"kenan","genç","kenantmgz@gmail.com","kenan123");
		User user2 =new User(1,"kenaen","gegnç","kenanetmgz@gmail.com","kenan2123");
		
		
		  UserService userService = new UserManager(new InputVerification(), new UserDao(), new EmailValidatorManager());
	        userService.register(user);
	      
	       UserService userService2 = new UserManager(new JGoogleUserVerificationServiceAdapter(), new UserDao(), new EmailValidatorManager());
	        userService2.register(user2);
		
	       userService2.login("kenantmgz@gmail.com","kenan123");
		
	}

}
