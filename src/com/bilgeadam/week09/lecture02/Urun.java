package com.bilgeadam.week09.lecture02;

public class Urun {

	private String isim;
	private double fiyat;
	
	
	
	
	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + "]";
	}




	public Urun() {
		
	}




	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}




	public String getIsim() {
		return isim;
	}




	public void setIsim(String isim) {
		this.isim = isim;
	}




	public Double getFiyat() {
		return fiyat;
	}




	public void setFiyat(Double double1) {
		this.fiyat = double1;
	}
	
}
