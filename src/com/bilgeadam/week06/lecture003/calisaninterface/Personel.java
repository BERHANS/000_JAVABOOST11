package com.bilgeadam.week06.lecture003.calisaninterface;

public class Personel implements IPersonel{

	private String ad;
	private String soyad;
	private Double maas;
	private String unvan;
	
	
	
	
	
	

	public Personel(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
	}
	public Personel(String ad, String soyad, Double maas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Double getMaas() {
		return maas;
	}
	public void setMaas(Double maas) {
		this.maas = maas;
	}
	public void setUnvan(double maas) {
		this.unvan = unvan;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public double zamYap(double zamOrani) {
		this.maas += (this.maas*zamOrani/100);
		return this.maas;
	}
	@Override
	public void maasAl() {

		System.out.println("maaş alındı");
	}
	@Override
	public void izinAl() {
		System.out.println("izin alındı");
		
	}
	@Override
	public void fazlaMesaiYap() {
		System.out.println("fazladan mesai yapıldı");
		
	}
}
