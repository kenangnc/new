package odev;



public class InstructorManager {
	
	
	public void ekle(User user) {
		
		System.out.println(user.Id+ " Id numaralý "  + user.adi + " "+user.soyadi+" hocamýz sisteme eklenmiþtir..." );
		
	}
		
	public void cokluEkle(User[] users) {
		for (User   user : users) {
			ekle(user);
		}
		
	}
	

}
