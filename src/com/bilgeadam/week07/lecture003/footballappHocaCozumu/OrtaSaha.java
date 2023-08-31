package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.Random;

public class OrtaSaha extends AktifFutbolcu{

	
	private int uzunTop;
	private int ilkDokunus;
	private int topSürme;
	private int Uretkenlik;
	private int ozelYetenek;

	
	
	
	
	
	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(60,101);

	}

	public OrtaSaha(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.uzunTop = rastgeleYetenekPuani();
		this.ilkDokunus = rastgeleYetenekPuani();
		this.ozelYetenek = rastgeleYetenekPuani();
		this.Uretkenlik = rastgeleYetenekPuani();
		this.topSürme = rastgeleYetenekPuani();
		
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSürme() {
		return topSürme;
	}

	public void setTopSürme(int topSürme) {
		this.topSürme = topSürme;
	}

	public int getUretkenlik() {
		return Uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		Uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "OrtaSaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSürme=" + topSürme
				+ ", Uretkenlik=" + Uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAd_soyad()=" + getAd_soyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	@Override
	public int bonusSkor() {
		{
			Random bonus = new Random();
			return bonus.nextInt(1,9);
		}
		
	}
	@Override
	public double pasSkoru() {
		
	return getPas()*0.2+getOzelYetenek()*0.2+getYetenek()*0.2+ getDayaniklilik()*0.1+
			getDogalForm() *0.1+getSans()*0.1+bonusSkor();
		
	}

	@Override
	public int golSkoru(int kurtaris) {
		Random random = new Random();
		int bonus = (int)(random.nextInt(1,7)*getDogalForm()*0.075);
		return (int)(getYetenek()*0.2+getOzelYetenek()*0.2+getSut()*0.2+getIlkDokunus()*0.1+getKararlilik()*0.1+getSans()*0.1+
					getDogalForm()*0.1+bonus-kurtaris);
				
		
	}



}
