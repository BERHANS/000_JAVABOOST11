package com.bilgeadam.week07.lecture001.abstractionOrnek;

public abstract class tasit {
	String marka ;
	String model ;
	int hiz; 
	String vites;
	
	public tasit(String marka, String model, int hiz, String vites) {
		super();
		this.marka = marka;
		this.model = model;
		this.hiz =hiz;
		this.vites = vites;
	}
	
	public void hizlan() {
		this.hiz+=10;
	}
	
	public void frenYap() {
		this.hiz-=10;
	}
	public void vitesDegistir(String vites) {
		this.vites = vites;
	}
	
	public void ozellikGoster() {
		System.out.println("markası" +" "+ marka+" "+"modeli"+" " +model+" "+" hızı"+" "+hiz+" "+"vitesi"+" "+vites);
		
	}
	abstract void akrobatikHareketYap();
	
}
