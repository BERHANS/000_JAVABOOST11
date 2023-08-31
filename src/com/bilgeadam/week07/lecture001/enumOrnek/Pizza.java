package com.bilgeadam.week07.lecture001.enumOrnek;

public class Pizza {

	private EBoyut boyut;
	private EHamurTipi hamur;
	private ETur tur;
	private double fiyat;
	
	
	
	@Override
	public String toString() {
		return "Pizza [boyut=" + boyut + ", hamur=" + hamur + ", tur=" + tur + ", fiyat=" + fiyat + "]";
	}
	public EBoyut getBoyut() {
	return boyut;
	}
	public Pizza() {
		super();
	}
	public Pizza(EBoyut boyut, EHamurTipi hamur, ETur tur, double fiyat) {
		super();
		this.boyut = boyut;
		this.hamur = hamur;
		this.tur = tur;
		this.fiyat = fiyat;
	}
	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}
	public EHamurTipi getHamur() {
		return hamur;
	}
	public void setHamur(EHamurTipi hamur) {
		this.hamur = hamur;
	}
	public ETur getTur() {
		return tur;
	}
	public void setTur(ETur tur) {
		this.tur = tur;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
