package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.Random;

public class Defans extends AktifFutbolcu{

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;
	
	
	
	public Defans(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.kafa = rastgeleYetenekPuani();
		this.pozisyonAlma = rastgeleYetenekPuani();
		this.sicrama = rastgeleYetenekPuani();
	}



	



	@Override
	public int rastgeleYetenekPuani() {
	Random random = new Random();
	return random.nextInt(60,91);
	}







	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAd_soyad()="
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



	public int getSicrama() {
		return sicrama;
	}



	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}



	@Override
	public int bonusSkor() {
		{
			Random bonus = new Random();
			return bonus.nextInt(0,5);
		}
		
	}



	@Override
	public double pasSkoru() {
		
		return getPas()*0.2+getDayaniklilik()*0.1+getDogalForm()*0.1+getYetenek()*0.2+
				getPozisyonAlma()*0.1+getSans()*0.2+bonusSkor();
	
	}

	@Override
	public int golSkoru(int kurtaris) {
		Random random = new Random();
		int bonus = (int)(random.nextInt(2,6)*getDogalForm()*0.075);
		return (int)(getYetenek()*0.3+getSut()*0.2+getKararlilik()*0.1+getKafa()*0.1+getSicrama()*0.1+getDogalForm()*0.1+
				bonus-kurtaris);
			
	}







	

	
}
