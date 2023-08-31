package com.bilgeadam.week07.lecture001.abstractionOrnek;

public class Runner {
public static void main(String[] args) {
	
	
	//abstract sınıfta bulunan ve gövdesi olan methodlara concret method denir
	/*
	 * taşıt superclass olucak bu sınıf absttact bir sınıf olucak
	 * marka model maksimum hız vites hızlan(); frenyap(); vites değiştir(); özellikleri göster(marka model maksimum hız vites);
	 * akrobatik hareket yap 
	 * 
	 * bu taşıt sınıfından miras alan araba ve motosiklet isimli iki sınıf oluşturucaz. 
	 */
	
	Araba araba = new Araba("wv", "caddy", 180, "6");
	
	araba.akrobatikHareketYap();
	araba.frenYap();
	araba.frenYap();
	araba.hizlan();
	araba.ozellikGoster();
	
	
	Motosiklet motosiklet = new Motosiklet("kawasaki","h1", 320, "6");

	motosiklet.akrobatikHareketYap();
	motosiklet.frenYap();
	motosiklet.frenYap();
	motosiklet.hizlan();
	motosiklet.ozellikGoster();
}
}
