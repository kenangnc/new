package odev;

public class StudentManager {

		public void ogrekle(User user) {
			System.out.println(user.Id+ " Id numaral� "  + user.adi + " "+user.soyadi+" ��rencimiz sisteme eklenmi�tir..." );
			
			
		}
		public void cokluOgrenciEkle(User[] users) {
			for(User user : users){
				
				ogrekle(user);
			}
			
		}

}
