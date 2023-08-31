package com.bilgeadam.week05.Marathon1;

import java.util.Scanner;

public class Uygulama {
	Scanner sc = new Scanner (System.in);
	public void uygulama() {
		
		int secim;
		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 0:
				System.out.println("Cikis yapıldı.");
			default : 
			}
		}while(secim !=0);
	}

	private void menu() {
		System.out.println("*************************");
		System.out.println("**OGRENCİ BİLGİ SİSTEMİ**");
		System.out.println("*************************");
		System.out.println();
		System.out.println("1- Sinif Arkadasi Tanımla");
		System.out.println("2- Hobilerini Gir");
		System.out.println("3- Maas Beklentini gir");
		System.out.println("4- Sınıf Listesi");
		System.out.println("0- Ç I K I Ş ");
		
	}
	
	private int secimYap() {
		System.out.println("Secim Yap: ");
		int secim = sc.nextInt();
		sc.nextLine();
		
	}
}
