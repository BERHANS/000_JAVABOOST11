package com.bilgeadam.week04.lecture002;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {


	
	String[] tasKagitMakas = {"taş", "kağıt" , "makas"};
	public static void secimEkranı() {
		boolean kontrol = true;
		do {
		System.out.println("1-TAŞ");
		System.out.println("2-KAĞIT");
		System.out.println("3-MAKAS");
		System.out.println("0-ÇIKIŞ");
		Scanner sc = new Scanner(System.in);
		System.out.print("seçim yapınız :  ");
		int secim = sc.nextInt();
		Random random = new Random();
		
		int siz = 0;
		int makina = 0;
		switch(secim) {
		case 1: 	if(secim<4 && secim>0) {
					System.out.println("TAŞ'ı seçtiniz");
					int randomSayi = random.nextInt(1,4);
					System.out.println("makinanın seçimi: " +randomSayi);
					if(randomSayi==2) {
						System.out.println("kaybettiniz..");
					makina++;break;
					}else if(randomSayi==1) {
					System.out.println("berabere");break;
					}else if(randomSayi==3)
					System.out.println("kazandınız ");
					siz++;break;
		}
		
		case 2:		if(secim<4 && secim>0) {
					System.out.println("KAĞIT'ı seçtiniz");
					int randomSayi = random.nextInt(1,4);
					System.out.println("makinanın seçimi: " +randomSayi);
					if(randomSayi==2) {
					System.out.println("BERABERE..");break;
					
					}else if(randomSayi==1) {
						System.out.println("KAZANDINIZ");
					siz++;break;
					}else if(randomSayi==3)
						System.out.println("KAYBETTİNİZ ");
					makina++;break;
		}
	
		case 3: 	if(secim<4 && secim>0) {
					System.out.println("MAKAS'ı seçtiniz");
					int randomSayi = random.nextInt(1,4);
					System.out.println("makinanın seçimi: " +randomSayi);
					if(randomSayi==2) {
						System.out.println("KAZANDINIZ..");
					siz++;break;
					}else if(randomSayi==1) {
						System.out.println("KAYBETTİNİZ");
					makina++;break;
					}else if(randomSayi==3)
						System.out.println("BERABERE ");break;
	   case 0: System.out.println("ÇIKIŞ YAPILDI");
		  		kontrol = false;
		  		break;
		}
			}
		System.out.println("skorlar" + siz + " - " + makina);
		System.out.println("Oynamaya devam etmek istiyorsanız E ye basınız :");
		String sayi1 = sc.nextLine();
		
		 kontrol = false;
		}while(kontrol!=false);
		
	}
}
