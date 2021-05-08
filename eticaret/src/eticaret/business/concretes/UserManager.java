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
	            System.out.println("Kullan�c� bilgileri yanl�� formatta. Kay�t i�lemi BA�ARISIZ!!!");
	        } else if (!userDaoService.emailCheck(user)) {
	            System.out.println("Bu email adresi daha �nce al�nm�� ---> " + user.getEmail() + "\n" + "Kay�t i�lemi BA�ARISIZ!!!");

	        } else {
	            userDaoService.add(user);
	            validatorService.sendVarificationMail();
	        }
		
	}

	@Override
	public void login(String email, String sifre) {
		   if (userDaoService.Logincheck(email, sifre)) {
	            System.out.println("Giri� Ba�ar�l�.");
	        } else {
	            System.out.println("Kullan�c� ad� yanl�� veya kullan�c� yok. Giri� BA�ARISIZ!!!");
	        }
		
	}


	
	

}
