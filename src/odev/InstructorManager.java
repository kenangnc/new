package odev;



public class InstructorManager {
	
	
	public void ekle(User user) {
		
		System.out.println(user.Id+ " Id numaral� "  + user.adi + " "+user.soyadi+" hocam�z sisteme eklenmi�tir..." );
		
	}
		
	public void cokluEkle(User[] users) {
		for (User   user : users) {
			ekle(user);
		}
		
	}
	

}
