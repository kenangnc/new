package odev;

public class StudentManager {

		public void ogrekle(User user) {
			System.out.println(user.Id+ " Id numaralı "  + user.adi + " "+user.soyadi+" öğrencimiz sisteme eklenmiştir..." );
			
			
		}
		public void cokluOgrenciEkle(User[] users) {
			for(User user : users){
				
				ogrekle(user);
			}
			
		}

}
