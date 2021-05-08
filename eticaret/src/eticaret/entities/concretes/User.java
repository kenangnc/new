package eticaret.entities.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	private int Id;
	private String adi;
	private String soyadi;
	private String email;
	private String sifre;
	
	
	public User(int id, String adi, String soyadi, String email, String sifre) {
		super();
		Id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
		this.sifre = sifre;
	}
	public User(){
		
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

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	

}
