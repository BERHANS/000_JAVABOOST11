package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Defans extends FutbolcuOzellikleri{


	private int pozisyonAlma;
	private int kafa;
	private int sıcrama;
	
	
	
	public Defans(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.pozisyonAlma = rastgeleDegerSec();;
		this.kafa = rastgeleDegerSec();;
		this.sıcrama = rastgeleDegerSec();;
	
	}

	

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sıcrama=" + sıcrama + ", getAd_soyad()="
				+ getAd_soyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}



	public int getPozisyonAlma() {
		return pozisyonAlma;
	}



	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}



	public int getKafa() {
		return kafa;
	}



	public void setKafa(int kafa) {
		this.kafa = kafa;
	}



	public int getSıcrama() {
		return sıcrama;
	}



	public void setSıcrama(int sıcrama) {
		this.sıcrama = sıcrama;
	}



	@Override
	public int rastgeleDegerSec() {
		Random random = new Random();
		return random.nextInt(60,91);
	}


}
