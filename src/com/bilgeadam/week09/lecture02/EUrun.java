package com.bilgeadam.week09.lecture02;

public enum EUrun {

	CİPS(20d),
	KOLA(25d),
	SEKER(30d),
	YAG(35d),
	UN(40d),
	EKMEK(45d),
	CAY(50d),
	YUMURTA(55d),
	YOGURT(60d),
	SUT(65d);
	
	private Double fiyat ;

	
	private EUrun(Double fiyat) {
		this.fiyat = fiyat;
	}

	public Double getFiyat() {
		return fiyat;
	}

	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	
}
