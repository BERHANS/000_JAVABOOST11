package com.bilgeadam.week05.lecture03;

public class DataBase extends Kullanici {

		static Kullanici[] kullanicilar = new Kullanici[5];
		 static int uzunluk =0;
		
		 public static void kullaniciKaydet() {
		
		Kullanici kullanici = new Kullanici();
		kullanici.isim = "berhan";
		kullanici.email = "berahns@hotmial.com";
		kullanici.şifre = "asdasdasd";
		kullanici.id = uzunluk+1;
		kullanicilar[0] = kullanici;
		uzunluk++;
		
		Kullanici kullanici1 = new Kullanici();
		kullanici1.isim = "sezer";
		kullanici1.email = "berasdasdadhns@hotmial.com";
		kullanici1.şifre = "asda66565";
		kullanici1.id = uzunluk+1;
		kullanicilar[1] = kullanici1;
		uzunluk++;
		
		Kullanici kullanici2 = new Kullanici();
		kullanici2.isim = "berhansezer";
		kullanici2.email = "berah656565ns@hotmial.com";
		kullanici2.şifre = "asdaASDASDsdasd";
		kullanici2.id = uzunluk+1;
		kullanicilar[2] = kullanici2;
		uzunluk++;
		 }
		
		
	}
	
	

