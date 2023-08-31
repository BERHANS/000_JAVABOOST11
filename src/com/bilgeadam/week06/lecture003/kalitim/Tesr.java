package com.bilgeadam.week06.lecture003.kalitim;

public class Tesr {

	public static void main(String[] args) {

		
		/**
		 * 
		 * 
		 * 
		 * -- Mühendislerimiz olacak
		 * 
		 * isim soyiisim iş unvani maaşı enz az iki constructr istiyorum (isim soy isim)
		 * (isim soyisim maaş)
		 * 
		 * maaşş zammı metodu olacak
		 * 
		 * maaş default en az 10000 10000 12000 arası unvan muhendis eger maaşı
		 * 12000-17000 arasında ise kıdemlı muhendis 17000den yuksek ise uzman muhendis
		 * eğer maaaşı 10000 kucuk ise stajyer ve
		 * 
		 * zam oranına ek olarak 250tl bonus alacaklar
		 * dışardan zam yüzdesi al  +250 tl 
		 * 
		 *
		 * -- ofis çalışanları olacak
		 * 
		 * isim soyiisim iş unvani maaşı
		 * 
		 * en düşük çalışan maaşı 8000 8000 12000 arası çalışan 12000 den sonraı kidemli
		 * calıasan 8000den az ise stajyer
		 * 
		 * 
		 *
		 */
	
		Muhendis muhendis = new Muhendis("ali","cabbar",10000);
		
		System.out.println(muhendis.getUnvan());
		System.out.println(muhendis.getAd() +" "+ muhendis.getSoyad()+ " "+ muhendis.getMaas());
		muhendis.zamYap(65);
		System.out.println(muhendis.getUnvan()+" "+muhendis.getMaas());
		
	Personel muhendis2 = new Muhendis("ali" , "cabbar");//böyle bir kullanım da geçerlidir.
	
	System.out.println(muhendis.getAd()+" " + muhendis.getSoyad());
	
	muhendis2.setMaas(8000d);
	muhendis2.setUnvan(muhendis2.getMaas());
	System.out.println(muhendis2.getUnvan()); 
	}

}
