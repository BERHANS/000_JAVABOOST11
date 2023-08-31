package com.bilgeadam.week07.lecture001.abstractionOrnek2;

public class Kare extends Sekiller{
		int alan=0;
		int cevre=0;
		public Kare(String renk, int kenarOlcusu) {
		super(renk, kenarOlcusu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alanHesapla() {
		
		alan=getKenarOlcusu()*getKenarOlcusu();
		
	}

	@Override
	public void cevreHesapla() {
	
		cevre = 4*getKenarOlcusu();
		
	}

	@Override
	void sekilCiz() {
		System.out.println("karenin sekli çizildi"+" "+"alan" + " " + alan+" "+"cevre"+" "+cevre+" "+"renk"+" "+getRenk());
		//sekiller sınıfında bu methodun ismini getClass().getSimpleName() şeklinde yazdırabiliriz
	}

}
