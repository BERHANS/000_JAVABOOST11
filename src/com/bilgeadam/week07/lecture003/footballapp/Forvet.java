package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Forvet extends FutbolcuOzellikleri{

	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	
	
	
	
	
	
	
	
	public Forvet(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.bitiricilik = rastgeleDegerSec();
		this.ilkDokunus = rastgeleDegerSec();
		this.kafa =rastgeleDegerSec();
		this.ozelYetenek = rastgeleDegerSec();
	}
	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAd_soyad()=" + getAd_soyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + ", rastgeleDegerSec()="
				+ rastgeleDegerSec() + "]";
	}
	public int getBitiricilik() {
		return bitiricilik;
	}
	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}
	public int getIlkDokunus() {
		return ilkDokunus;
	}
	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}
	public int getKafa() {
		return kafa;
	}
	public void setKafa(int kafa) {
		this.kafa = kafa;
	}
	public int getOzelYetenek() {
		return ozelYetenek;
	}
	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}
	@Override
	public int rastgeleDegerSec() {
		Random random = new Random();
		return random.nextInt(70,101); 	
	}
	
	
}
