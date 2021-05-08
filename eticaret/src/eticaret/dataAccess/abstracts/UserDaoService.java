package eticaret.dataAccess.abstracts;
import eticaret.entities.concretes.User;
public interface UserDaoService {
	
		void add(User user);
		boolean emailCheck(User user);
		boolean Logincheck(String email,String sifre);
			
		}

