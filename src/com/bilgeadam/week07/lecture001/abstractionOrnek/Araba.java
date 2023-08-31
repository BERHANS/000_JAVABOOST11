package com.bilgeadam.week07.lecture001.abstractionOrnek;



public class Araba extends tasit {

	public Araba(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);
		
	}

	@Override
	void akrobatikHareketYap() {
		System.out.println("araba drift attı");
		
	}

	

}

	

