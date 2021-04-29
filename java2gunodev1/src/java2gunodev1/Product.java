package java2gunodev1;

public class Product {
	public Product() {//constructor metod
		System.out.println("ben Çalýþtým");
		
	}
		
	public Product(int id , String kursadi ,String kursVeren, String tamamlamaYuzdelik) {
		
		this.id=id;
		this.kursadi=kursadi;
		this.kursVeren=kursVeren;
		this.tamamlamaYuzdelik=tamamlamaYuzdelik;
		
		
	}
	int id;
	String kursadi;
	String kursVeren;
	String tamamlamaYuzdelik;
}
