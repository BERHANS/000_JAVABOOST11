package com.bilgeadam.week07.lecture001.abstractionOrnek2;

public class Daire extends Sekiller{
	final double PI = 3.14;
	double alan =0;
	double cevre = 0;
	
	public Daire(String renk, int yariCap) {
		super(renk, yariCap);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alanHesapla() {
	
		alan=PI*getKenarOlcusu()*getKenarOlcusu();
		
	}

	@Override
	public void cevreHesapla() {
		
		cevre = 2*PI*getKenarOlcusu();
		
		
	}

	@Override
	void sekilCiz() {
		System.out.println("dairenin şekli çizildi"+" "+"alan" + " " + alan+" "+"cevre"+" "+cevre+" "+"renk"+" "+getRenk());
		
	}
	

	
	

}
