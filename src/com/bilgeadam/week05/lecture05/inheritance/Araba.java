package com.bilgeadam.week05.lecture05.inheritance;

public class Araba extends MotorluTasit{

	private int kapıSayisi;
	
	
	
	public void vitesDegistir() {
		System.out.println("arabanın vitesi değiştirildi");
	}
	
	public void farlariAç() {
		System.out.println("arabanın farları açıldı");
	}

	public int getKapıSayisi() {
		return kapıSayisi;
	}

	public void setKapıSayisi(int kapıSayisi) {
		this.kapıSayisi = kapıSayisi;
	}

	public Araba(int kapıSayisi) {
		super();
		this.kapıSayisi = kapıSayisi;
	}

	public Araba(String marka, String renk, int km) {
		super(marka, renk, km);
		// TODO Auto-generated constructor stub
	}

	public Araba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Araba(String marka, String renk, int km, int kapıSayisi) {
		super(marka, renk, km);
		this.kapıSayisi = kapıSayisi;
	}

	@Override
	public String toString() {
		return "Araba [kapıSayisi=" + kapıSayisi + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calistir() {
			System.out.println("araç çalıştırıldı");
		super.calistir();// burdaki super miras alınan sınıfın methodua döner
	}

	


}
