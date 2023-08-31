package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Kaleci extends FutbolcuOzellikleri{

	private int kurtaris;

	
	
	
	
	
	
	public Kaleci(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.kurtaris = rastgeleDegerSec();
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAd_soyad()=" + getAd_soyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + ", rastgeleDegerSec()="
				+ rastgeleDegerSec() + "]";
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public int rastgeleDegerSec() {
	Random random = new Random();
	return random.nextInt(65,101);
	}

	
	
	
	
	
	
	
}
