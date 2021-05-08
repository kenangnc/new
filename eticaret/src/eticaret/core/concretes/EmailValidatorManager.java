package eticaret.core.concretes;

import eticaret.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVarificationMail() {
		System.out.println("Email doðrulamasý gönderildi");
		
	}

}
