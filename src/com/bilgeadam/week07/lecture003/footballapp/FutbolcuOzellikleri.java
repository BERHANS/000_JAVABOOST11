package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public abstract class FutbolcuOzellikleri {

	private String ad_soyad;
	private int formaNo;
	private int dayaniklilik;
	private int hiz;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlilik;
	private int dogalForm;
	private int sans;
	
	
	
	
	
	
	
	
	public FutbolcuOzellikleri(String ad_soyad, int formaNo) {
		super();
		this.ad_soyad = ad_soyad;
		this.formaNo = formaNo;
		this.dayaniklilik = rastgeleDegerSec();
		this.hiz = rastgeleDegerSec();
		this.pas = rastgeleDegerSec();
		this.sut = rastgeleDegerSec();
		this.yetenek = rastgeleDegerSec();
		this.kararlilik = rastgeleDegerSec();
		this.dogalForm = rastgeleDegerSec();
		this.sans = rastgeleDegerSec();
	}
	@Override
	public String toString() {
		return "FutbolcuOzellikleri [ad_soyad=" + ad_soyad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayaniklilik
				+ ", hiz=" + hiz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik="
				+ kararlilik + ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}
	public String getAd_soyad() {
		return ad_soyad;
	}
	public void setAd_soyad(String ad_soyad) {
		this.ad_soyad = ad_soyad;
	}
	public int getFormaNo() {
		return formaNo;
	}
	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}
	public int getDayaniklilik() {
		return dayaniklilik;
	}
	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public int getPas() {
		return pas;
	}
	public void setPas(int pas) {
		this.pas = pas;
	}
	public int getSut() {
		return sut;
	}
	public void setSut(int sut) {
		this.sut = sut;
	}
	public int getYetenek() {
		return yetenek;
	}
	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}
	public int getKararlilik() {
		return kararlilik;
	}
	public void setKararlilik(int kararlilik) {
		this.kararlilik = kararlilik;
	}
	public int getDogalForm() {
		return dogalForm;
	}
	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}
	public int getSans() {
		return sans;
	}
	public void setSans(int sans) {
		this.sans = sans;
	}
	
	public int rastgeleDegerSec() {
		Random random = new Random();
		return random.nextInt(50,101);
	}

	



	
	
	
	
}
