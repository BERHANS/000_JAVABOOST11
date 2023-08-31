package com.bilgeadam.week08.lecture005;

public class Urun {

	/**
	 * urun sınıfı isim fiyat ve int son kullanma tarihi 2023 2024 
	 * 
	 * urunmanager isimli bir sinif oluşturalım bu sınıfta urun yarat isimli bir method olsun bu sınıf üzerinden
	 * test sınıfında bir ürün oluşturalım
	 */
	
	private String ad;
	private double fiyat;
	private int skt;
	
	
	
	
	@Override
	public String toString() {
		return "Urun [ad=" + ad + ", fiyat=" + fiyat + ", skt=" + skt + "]";
	}
	public Urun(String ad, double fiyat, int skt) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
		this.skt = skt;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getSkt() {
		return skt;
	}
	public void setSkt(int skt) {
		this.skt = skt;
	}
	
	
	
}
