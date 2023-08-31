package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

public abstract class AktifFutbolcu extends Futbolcu{

	public AktifFutbolcu(String ad_soyad, int formaNo) {
		super(ad_soyad, formaNo);

	}
	
	public boolean pasVer() {
		double pasSkoru = pasSkoru();
		if(pasSkoru>66) {
			return true ;
		}else 
			return false;
	}
	
	public abstract double pasSkoru();
		
	
	
	public abstract int bonusSkor() ;
	
	public boolean sutCek(int kurtaris) {
		double sutSkoru = golSkoru(kurtaris);
		if(sutSkoru>66) {
			return true ;
		}else 
			return false;
	}
	public abstract int golSkoru(int kurtaris);
	
}
