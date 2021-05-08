package eticaret.core.concretes;

import eticaret.JGoogleUserValid.JGoogleUserVerificationService;
import eticaret.core.abstracts.InputVerificationService;

import eticaret.entities.concretes.User;


public class JGoogleUserVerificationServiceAdapter implements InputVerificationService{

	@Override
	public boolean isValid(User user) {
		JGoogleUserVerificationService gValid =new JGoogleUserVerificationService();
		
		return gValid.isValid();
	}

	

}
