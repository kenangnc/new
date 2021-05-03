package odev;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instructor kenan = new Instructor();
		kenan.Id=1;
		kenan.adi="kenan";
		kenan.soyadi="genç";
		kenan.telno= "000000000";
		kenan.adres="jhhlkd/kasjdkafjdak asjdeasjdas alsdk123  123123";
		
		
		Student student = new Student();
		student.Id=2;
		student.adi ="basri";
		student.soyadi= "leklekoglu";
		student.telno="0000032";
		
		InstructorManager instructormanager = new InstructorManager();
		User[] users= {kenan};
		instructormanager.cokluEkle(users);
		
		StudentManager studentManager = new StudentManager();
		User[] users2 = {student};
		studentManager.cokluOgrenciEkle(users2);
		
		
		
		UserManager mngr =new UserManager();
		System.out.println("silmek istediğiniz kayıt varmı ? ");
		
		
		
	}

}
