package com.bilgeadam.week07.lecture001.abstractionOrnek2;

public abstract class Sekiller {

	private String renk;
	private int kenarOlcusu;

	
	
	
	
	
	public Sekiller(String renk, int kenarOlcusu) {
		super();
		this.renk = renk;
		this.kenarOlcusu = kenarOlcusu;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getKenarOlcusu() {
		return kenarOlcusu;
	}
	public void setKenarOlcusu(int kenarOlcusu) {
		this.kenarOlcusu = kenarOlcusu;
	}
	
	
	public abstract void alanHesapla();
	public abstract void cevreHesapla();
	
	abstract void sekilCiz();
	
	
	
}
