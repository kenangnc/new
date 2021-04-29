package java2gunodev1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String onay;
			Scanner sc= new Scanner(System.in);
		Product product1 = new Product(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(c# +Angular)"
				,"Engin DEMÝROG"
				,"%0");
		Product product2 = new Product(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)"
				,"Engin DEMÝROG"
				,"%32");
		
		Product[] products = {product1,product2};
		for(Product product : products) {
			System.out.println(product.id);
			System.out.println(product.kursadi);
			System.out.println(product.kursVeren);
			System.out.println(product.tamamlamaYuzdelik);
			
			System.out.println("sepete eklensin mi : Evet veya Hayýr");
			sepet Sepet =new sepet();
			if(sc.next().equals("Evet".toLowerCase()))
			{
				Sepet.sepet(product1);
				Sepet.sepet(product2);
			}
			else if(sc.next().equals("Hayýr".toLowerCase()))
				{
				Sepet.sepethayir(product1);
				Sepet.sepethayir(product2);
				}
			
			else {
						System.out.println("yanlýþ giriþ biçimi");
				
				
			}
			
		}

	}

}
