package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.ArrayList;
import java.util.List;

public class Takim implements ITakım{

	private String ad;
	List<AktifFutbolcu> futbolcular;
	private Kaleci kaleci;
	
	
	
	public Takim(String ad) {
		this.futbolcular = new ArrayList<AktifFutbolcu>();//bu liste tanımlaması en aşşağıda olursa hata verir çünkü listenin önce newlenmesi lazım.
		this.ad = ad;
		this.kaleci = new Kaleci("kaleci", 1);
		defansOlustur();
		ortaSahaOlustur();
		forvetOlustur();
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public List<AktifFutbolcu> getFutbolcu() {
		return futbolcular;
	}



	public void setFutbolcular(List<AktifFutbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}



	public Kaleci getKaleci() {
		return kaleci;
	}



	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}



	@Override
	public String toString() {
		return "Takim [ad=" + ad + ", futbolcu=" + futbolcular + ", kaleci=" + kaleci + "]";
	}



	@Override
	public void defansOlustur() {
		for(int i = 0 ; i<4 ;i++) {
			Defans defans = new Defans("defans"+(i+1), i+2);
			futbolcular.add(defans);
		}
		
	}



	@Override
	public void ortaSahaOlustur() {
		for(int i = 0; i<4;i++) {
			OrtaSaha ortaSaha = new OrtaSaha("ortaSaha"+ (i+1), i+6);
			futbolcular.add(ortaSaha);
		}
		
	}



	@Override
	public void forvetOlustur() {
		for(int i = 0; i<2;i++) {
			Forvet forvet = new Forvet("forvet"+(i+1), i+10);
			futbolcular.add(forvet);
		}
		
	}
	
	
	
}
