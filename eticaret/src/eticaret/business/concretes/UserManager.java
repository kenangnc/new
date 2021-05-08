package eticaret.business.concretes;

import eticaret.business.abstracts.UserService;
import eticaret.core.abstracts.InputVerificationService;
import eticaret.core.abstracts.ValidatorService;
import eticaret.dataAccess.abstracts.UserDaoService;
import eticaret.entities.concretes.User;

public class UserManager implements UserService {
	
	InputVerificationService memberInformationValidation;
	UserDaoService userDaoService;
	ValidatorService validatorService;
	
	 public UserManager(InputVerificationService memberInformationValidation,UserDaoService userService,ValidatorService validatorService) {
		this.memberInformationValidation=memberInformationValidation;
		this.userDaoService=userService;
		this.validatorService=validatorService;
	}

	@Override
	public void register(User user) {
		  if (!memberInformationValidation.isValid(user)) {
	            System.out.println("Kullanýcý bilgileri yanlýþ formatta. Kayýt iþlemi BAÞARISIZ!!!");
	        } else if (!userDaoService.emailCheck(user)) {
	            System.out.println("Bu email adresi daha önce alýnmýþ ---> " + user.getEmail() + "\n" + "Kayýt iþlemi BAÞARISIZ!!!");

	        } else {
	            userDaoService.add(user);
	            validatorService.sendVarificationMail();
	        }
		
	}

	@Override
	public void login(String email, String sifre) {
		   if (userDaoService.Logincheck(email, sifre)) {
	            System.out.println("Giriþ Baþarýlý.");
	        } else {
	            System.out.println("Kullanýcý adý yanlýþ veya kullanýcý yok. Giriþ BAÞARISIZ!!!");
	        }
		
	}


	
	

}
