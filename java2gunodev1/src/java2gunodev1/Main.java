package java2gunodev1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String onay;
			Scanner sc= new Scanner(System.in);
		Product product1 = new Product(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(c# +Angular)"
				,"Engin DEM�ROG"
				,"%0");
		Product product2 = new Product(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)"
				,"Engin DEM�ROG"
				,"%32");
		
		Product[] products = {product1,product2};
		for(Product product : products) {
			System.out.println(product.id);
			System.out.println(product.kursadi);
			System.out.println(product.kursVeren);
			System.out.println(product.tamamlamaYuzdelik);
			
			System.out.println("sepete eklensin mi : Evet veya Hay�r");
			sepet Sepet =new sepet();
			if(sc.next().equals("Evet".toLowerCase()))
			{
				Sepet.sepet(product1);
				Sepet.sepet(product2);
			}
			else if(sc.next().equals("Hay�r".toLowerCase()))
				{
				Sepet.sepethayir(product1);
				Sepet.sepethayir(product2);
				}
			
			else {
						System.out.println("yanl�� giri� bi�imi");
				
				
			}
			
		}

	}

}
