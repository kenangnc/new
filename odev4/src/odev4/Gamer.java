package odev4;

public class Gamer {
	
	private int Id;
	private String adi;
	private String soyadi;
	private String dogumyili;
	
	public Gamer (int id,String adi,String soyadi,String dogumyili ) {
		
		Id=id;
		this.adi=adi;
		this.soyadi=soyadi;
		this.dogumyili=dogumyili;
		
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getDogumyili() {
		return dogumyili;
	}

	public void setDogumyili(String dogumyili) {
		this.dogumyili = dogumyili;
	}
	

}
