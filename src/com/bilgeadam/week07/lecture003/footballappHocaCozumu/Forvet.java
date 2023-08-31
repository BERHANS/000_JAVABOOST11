package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.Random;

public class Forvet extends AktifFutbolcu{

	
	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;
	
	
	public Forvet(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.bitiricilik = rastgeleYetenekPuani();
		this.ilkDokunus = rastgeleYetenekPuani();
		this.kafa = rastgeleYetenekPuani();
		this.ozelYetenek = rastgeleYetenekPuani();
	}
	
	
	@Override
	public int rastgeleYetenekPuani() {
	Random random = new Random();
	return random.nextInt(70,101);
	}




	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAd_soyad()=" + getAd_soyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
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
	public int bonusSkor() {
		{
			Random bonus = new Random();
			return bonus.nextInt(1,7);
		}
		
	}
	@Override
	public double pasSkoru() {
		
	return getPas()*0.2+getOzelYetenek()*0.2+getYetenek()*0.2+ getDogalForm()*0.1+ getDayaniklilik()*0.1+getSans()*0.1+bonusSkor();
		
	}


	@Override
	public int golSkoru(int kurtaris) {
		Random random = new Random();
		int bonus = (int)(random.nextInt(1,6)*getDogalForm()*0.075);
		return (int)(getYetenek()*0.2+getOzelYetenek()*0.2+getSut()*0.2+getIlkDokunus()*0.1+getKararlilik()*0.1+getSans()*0.1+getKafa()*0.1+
					getBitiricilik()*0.2+getDogalForm()*0.1+bonus-kurtaris);
	}
	
}
