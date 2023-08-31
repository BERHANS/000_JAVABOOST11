package com.bilgeadam.week07.lecture003.footballapp;

import java.util.ArrayList;
import java.util.List;

public class Takim implements IFutbolcuOzellikleri{

	private String ad;
	private List<FutbolcuOzellikleri> futbolcu;
	private Kaleci kaleci;

	
	
	
	public Takim(String ad) {
		super();
		this.ad = ad;
		this.futbolcu = new ArrayList<FutbolcuOzellikleri>();
		kaleciOlustur();
		defansOyuncusuOluştur();
		ortasahaOyuncusuOluştur();
		forvetOyuncusuOluştur();
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public List<FutbolcuOzellikleri> getFutbolcu() {
		return futbolcu;
	}
	public void setFutbolcu(List<FutbolcuOzellikleri> futbolcu) {
		this.futbolcu = futbolcu;
	}
	public Kaleci getKaleci() {
		return kaleci;
	}
	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}
	@Override
	public void defansOyuncusuOluştur() {
		for(int i =0; i<4;i++) {
		Defans defans = new Defans("defans"+(i+1), 2+i);
		futbolcu.add(defans);
		}
		
	}
	@Override
	public void forvetOyuncusuOluştur() {
		for(int i =0; i<2;i++) {
			Forvet forvet = new Forvet("forvet"+(i+1),i+10);
			futbolcu.add(forvet);
			}
		
	}
	@Override
	public void ortasahaOyuncusuOluştur() {
		for(int i =0; i<4;i++) {
			OrtaSaha ortaSaha = new OrtaSaha("ortaSaha"+(i+1), i+6);
			futbolcu.add(ortaSaha);
			}
		
	}
	@Override
	public void kaleciOlustur() {
		Kaleci kaleci = new Kaleci("kaleci", 0);
		futbolcu.add(kaleci);
		
		
	}
	
	
}
