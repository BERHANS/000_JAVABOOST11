package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class OrtaSaha extends FutbolcuOzellikleri {

	
	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;
	
	
	
	
	public OrtaSaha(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);
		this.uzunTop = rastgeleDegerSec();
		this.ilkDokunus = rastgeleDegerSec();
		this.topSurme = rastgeleDegerSec();
		this.uretkenlik = rastgeleDegerSec();
		this.ozelYetenek = rastgeleDegerSec();
	}




	@Override
	public String toString() {
		return "OrtaSaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAd_soyad()=" + getAd_soyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
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




	public int getTopSurme() {
		return topSurme;
	}




	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}




	public int getUretkenlik() {
		return uretkenlik;
	}




	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
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
		return random.nextInt(60,101);
	}
	
	
	




	
	

}
