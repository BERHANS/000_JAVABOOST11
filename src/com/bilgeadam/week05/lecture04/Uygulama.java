package com.bilgeadam.week05.lecture04;

import java.util.Scanner;

public class Uygulama {

	
	/*
	 * 1 kayıt ol 
	 * 2 giriş yap
	 * 3 kullanıcıları göster
	 * 4 çıkış
	 * 
	 * menü oluşumu,menüden seim yapılması,yapılan seçime göre aksiyon alabileceğimiz bir tema oluştur (switch case)
	 * DataBase sınıfında liste boyutunu arttır=>>>> liste.length-2 kadar veri barındırdığı zaman listenin boyutunu 5 arttırsın
	 * 
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	

	public  void uygulama() {
		Scanner sc = new Scanner(System.in);
		
		int secim;
		
		do {
			menu();
			secim = secimYap();

		switch(secim) {
		
		case 1: 	kayitOl();//TODO kayıt ol methodunda verilerin giriş parametreleri belirlenecek
					break;	
		case 2:	
				girisYap();
				break;
		case 3: 
				kullanicilariGoster();
				break;
		case 4: 
			secim = 4
			;break;
		
		default : System.out.println("lütfen geçerli bir seçim yapınız");break;
		}
		
		
		}while(secim !=4);
		System.out.println("Çıkış yapıldı..");
	}

	private static void  menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("*KULLANICI KAYIT SİSTEMİ*");
		System.out.println("*************************");
		System.out.println("*******1- KAYIT OL*******");
		System.out.println("*******2- GİRİŞ YAP******");
		System.out.println("*3- KULLANICILARI GÖSTER*");
		System.out.println("******4- Ç I K I Ş*******");
		System.out.println("");
		System.out.print("*******SEÇİM YAPINIZ****** : ");
	}
	
	private int secimYap() {

		int secim = sc.nextInt();
		sc.nextLine();
	return secim;
	}
		public static void kayitOl() {
			Scanner sc = new Scanner(System.in);
			Kullanici kullanici = new Kullanici();
			System.out.print("isim giriniz : ");
			kullanici.isim = sc.nextLine();
			System.out.print("email giriniz : ");
			kullanici.email = sc.nextLine();
			System.out.print("şifre giriniz : ");
			kullanici.şifre = sc.nextLine();
			kullanici.id = DataBase.uzunluk+1;
			
			DataBase.kullaniciEkle(kullanici);
		}
		
		public static void girisYap() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Email giriniz");
			String email = sc.nextLine();
			System.out.println("Şifre giriniz");
			String sifre = sc.nextLine();
			
			if(!DataBase.kullaniciVarMi(email, sifre)) {
				System.out.println("email ya da şifre hatalı");
			}
			
	
		
		}
		
		private void kullanicilariGoster() {
			
			for ( int i = 0; i<DataBase.uzunluk;i++) {
				System.out.println((i+1)+ DataBase.kullanicilar[i].isim + "" +DataBase.kullanicilar[i].email+""+DataBase.kullanicilar[i].id);
			}
		}
		
}