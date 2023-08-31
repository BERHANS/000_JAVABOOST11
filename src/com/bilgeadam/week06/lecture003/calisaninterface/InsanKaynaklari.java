package com.bilgeadam.week06.lecture003.calisaninterface;

//extends personel-> is-a ilişkisi barındırır.
//implements IInsanKaynaklari -> has-a ilişkisi barındırır.


public class InsanKaynaklari extends Personel implements IInsanKaynaklari {

	public InsanKaynaklari(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}

	public InsanKaynaklari(String ad, String soyad, Double maas) {
		super(ad, soyad, maas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zamYap(Personel personel, double zamOrani) {
		double zamliUcret = personel.getMaas()+ (personel.getMaas()*zamOrani/100);
		if(personel.getClass().getSimpleName().equals("Muhendis")){
			//personel nerden üretildi diye bakıyor
			zamliUcret += 250;
		}
//		if(personel.getUnvan().contains("muhendis")) {
//			//bu ikinci yoludur 
//			zamliUcret += 250;
//		}
		
		personel.setMaas(zamliUcret);
		personel.setUnvan(getMaas());
		
	}

	@Override
	public void unvanBelirle() {
		System.out.println("ünvan belirlendi");
		
	}

	
	
	
	
}
