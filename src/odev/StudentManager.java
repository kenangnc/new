package odev;

public class StudentManager {

		public void ogrekle(User user) {
			System.out.println(user.Id+ " Id numaralý "  + user.adi + " "+user.soyadi+" öðrencimiz sisteme eklenmiþtir..." );
			
			
		}
		public void cokluOgrenciEkle(User[] users) {
			for(User user : users){
				
				ogrekle(user);
			}
			
		}

}
