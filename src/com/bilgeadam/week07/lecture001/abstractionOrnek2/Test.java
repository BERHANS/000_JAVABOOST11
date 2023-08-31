package com.bilgeadam.week07.lecture001.abstractionOrnek2;

public class Test {

	/*
	 * Bir daire ve kare sınıfı ooluşturalım bu sınıfların miraz alabileceği superclass oluşturalım
	 * (encapsulation,abstraction ve polimorphism konseplerinden faydalanalım)
	 * 
	 * Butun geometrik şekillerinde birer rengi olucak ve alanını çevresini hesaplamak için gerekli parametreler olucak
	 * bütün geometrik şekilleri çiz ile çizilmesi lazım 
	 * şekillerin alanları ve çevreleri hesaplanıcak
	 * 
	 * Daire için yarı çap kare için tek bir kenar yeterli olucak
	 * 
	 * PI=3.14; FİNALKULLANICAZ
	 * 
	 */
	public static void main(String[] args) {
		
		Daire daire = new Daire("kırmızı",3);
		daire.alanHesapla();
		daire.cevreHesapla();
		daire.sekilCiz();
		
		Kare kare = new Kare("mor", 4);
		kare.alanHesapla();
		kare.cevreHesapla();
		kare.sekilCiz();
		
	}
	
	
	
}
