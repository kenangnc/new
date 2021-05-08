package eticaret.core.abstracts;

import eticaret.entities.concretes.User;

public interface InputVerificationService {
	 boolean isValid(User user);

}
