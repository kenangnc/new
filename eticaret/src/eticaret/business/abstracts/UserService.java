package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String sifre);

}
