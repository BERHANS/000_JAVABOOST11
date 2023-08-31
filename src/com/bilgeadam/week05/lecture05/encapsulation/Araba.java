package com.bilgeadam.week05.lecture05.encapsulation;

public class Araba {

	private String marka ;
	private String model;
	private int km;
	private int bijonSayisi = 5;
	private String camSil;
	
	public void arabayiSur() {
		this.km +=10;
		System.out.println("araba kullanılıyor");
	}
	
	public void ozellikleriYazdir() {
		System.out.println("marka " + this.marka);
		System.out.println("model " + this.model);
		System.out.println("km " + this.km);
		System.out.println("bijonSayisi " + this.bijonSayisi);
		System.out.println("camsil " + this.camSil);
			
	
	}

	public Araba() {
		//parametreli constructor var olduğunda parametresiz bir consturctor kullanılmaz o yüzden
		//boş bir parametresiz constructor atayabiliriz. bu işlemin adı overload
	}
	
	public Araba(String marka, String model, int km, int bijonSayisi, String camSil) {
		super();
		this.marka = marka;
		this.model = model;
		this.km = km;
		this.bijonSayisi = bijonSayisi;
		this.camSil = camSil;
	}
	public Araba(int km,String camSil) {
		super();
		this.marka = "bmw";//this bu sınıfın içini belirten bir belirteç
		this.model = "x5";//this dediğimiz de bu sınıfın içindeki değişkenine ulaşırız
		this.km = km;//sınıfın kendine özgü parametreleri olabilir bunlara ulaşmak için this kullanırız 
		this.bijonSayisi = 5;
		this.camSil = camSil;
	}
	public Araba(String camSil) {
		super();
		this.marka = "bmw";//this bu sınıfın içini belirten bir belirteç
		this.model = "x5";//this dediğimiz de bu sınıfın içindeki değişkenine ulaşırız
		//sınıfın kendine özgü parametreleri olabilir bunlara ulaşmak için this kullanırız 
		this.bijonSayisi = 5;
		this.camSil = camSil;
	}
	public String getMarka() {
		return marka;//bu get methodu arabanın markasını kullanmak üzere geri döner.
	}

	public void setMarka(String marka) {
		this.marka = marka;//set methodu 
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKm() {
		return km;
	}

//	public void setKm(int km) {
//		if(km<0) {
//			System.out.println("km 0 dan küçük olamaz");
//		}else {
//			this.km = km;
//		}
//		
//	}

	public int getBijonSayisi() {
		return bijonSayisi;
	}

//	public void setBijonSayisi(int bijonSayisi) {
//		this.bijonSayisi = bijonSayisi;
//	}

	public String getCamSil() {
		return camSil;
	}

	public void setCamSil(String camSil) {
		this.camSil = camSil;
	}

}
