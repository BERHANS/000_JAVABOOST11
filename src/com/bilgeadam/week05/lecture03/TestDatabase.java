package com.bilgeadam.week05.lecture03;

public class TestDatabase {

	public static void main(String[] args) {

//		DataBase database = new DataBase();
		
		DataBase.kullaniciKaydet();
		
		Kullanici[] kullanicilar = DataBase.kullanicilar;
		
		for(int i = 0; i<kullanicilar.length;i++) {
			if(kullanicilar[i] != null) {
				System.out.println(kullanicilar[i].isim+ kullanicilar[i].id);
			}
		}
		
		DataBase database2 = new DataBase();
		
		database2.kullaniciKaydet();
		for(int i = 0; i<kullanicilar.length;i++) {
			if(kullanicilar[i] != null) {
				System.out.println(kullanicilar[i].isim + kullanicilar[i].id);
			}
		}
	}

}
