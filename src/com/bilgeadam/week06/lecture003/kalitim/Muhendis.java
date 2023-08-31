package com.bilgeadam.week06.lecture003.kalitim;

public class Muhendis extends Personel{

	public Muhendis(String ad, String soyad) {
		super(ad, soyad);
		setUnvan("Muhendis");
	}
	public Muhendis(String ad, String soyad, double maas) {
		super(ad, soyad, maas);
		setUnvan(maas);
	}
	@Override
	public void setUnvan(double maas) {
		if(maas>=17000) {
			setUnvan("Uzman Muhendis");
		}else if(maas>=12000) {
			setUnvan("Kidemli Muhendis");
		}else if(maas>=10000) {
			setUnvan("Muhendis");
		}else {
			setUnvan("Stajyer");
		}
	}
	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani)+250);
		setUnvan(getMaas());
		
		return getMaas();
	}
	
	
	
}
