package eticaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaret.dataAccess.abstracts.UserDaoService;
import eticaret.entities.concretes.User;

public class UserDao implements UserDaoService {

	List <User> users=new ArrayList<>();

	public void add(User user) {
		users.add(user);
		System.out.println(user.getAdi()+" "+user.getEmail()+" kullanýcýsý sisteme eklendi");
		
	}

	
	public boolean emailCheck(User user) {
	for(User u: users)
	{
		if(u.getEmail()==user.getEmail())
		{
			return false;
		}
	}
		return true;
	}


	public boolean Logincheck(String email, String sifre) {
			
		for(User user: users)
		{
			if(user.getEmail()==email&&user.getSifre()==sifre)
				return true;
			
		}
		return false;
	}

}
