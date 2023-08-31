package com.bilgeadam.week05.lecture05.inheritance;

public class MotorluTasit {

	private String marka;
	private String renk;
	private int km;
	
	public void calistir() {
		System.out.println("taşıt çalıştırıldı. ");
	}
	
	public void durdur() {
		System.out.println("taşıt çalışmayı durdurdu ");
	}
	public void hizlan() {
		System.out.println("taşıt hızlanıyor ");
	}
	
	public MotorluTasit() {
		super();
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "[marka=" + marka + ", renk=" + renk + ", km=" + km + "]";
	}

	public MotorluTasit(String marka, String renk, int km) {
		super();
		this.marka = marka;
		this.renk = renk;
		this.km = km;
	}
	
	
}
