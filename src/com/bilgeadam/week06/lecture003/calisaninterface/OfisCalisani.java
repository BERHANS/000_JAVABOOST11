package com.bilgeadam.week06.lecture003.calisaninterface;

public class OfisCalisani extends Personel{

	
	public OfisCalisani(String ad, String soyad, Double maas) {
		super(ad, soyad, maas);
	setUnvan(maas);
	}

	public OfisCalisani(String ad, String soyad) {
		super(ad, soyad);
		setMaas(8000d);
	}
	@Override
	public void setUnvan(double maas) {
		if(maas>=12000) {
			setUnvan("Kidemli Calisan");
		}else if(maas>=8000) {
			setUnvan("Calisan");
		}else {
			setUnvan("Stajyer");
		}
	}
	
	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani));
		setUnvan(getMaas());
		return getMaas();
	}
	
	
}
