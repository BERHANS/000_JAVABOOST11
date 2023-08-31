package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
/**
 * girilen sayının asal olup olmadığını göster
 */
		Scanner sc= new Scanner(System.in);
		
		int sayı;
		
		System.out.print("lütfen sayı gir :   ");
		sayı = sc.nextInt();
		
	if (sayı==1) {
		System.out.println("asal değildir");
		System.out.println("FARKLI BİR SAYI GİRİN");
		sayı=sc.nextInt();
	}else if(sayı==2 || sayı==7) {
		System.out.println("asaldır");
	}else if(sayı%2==0 || sayı%3==0 || sayı%4==0 || sayı%5==0 || sayı%6==0 || sayı%7==0 || sayı%8==0 || sayı%9==0) {
		System.out.println("ASAL SAYI DEĞİLDİR");
	}else {
		System.out.println("asal sayıdır");
	}
		
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("Bir sayı giriniz : ");
//	int sayi1 = scanner.nextInt();
//
//	if (sayi1 == 2) {
//		System.out.println("Asal sayıdır");
//	} else if (sayi1 < 2 || sayi1 % 2 == 0) {
//		System.out.println("Asal Sayı Değildir");
//	} else {
//		boolean asal = true;
//		for (int i = 3; i <= sayi1 - 1; i += 2) {
//			if (sayi1 % i == 0) {
//				asal = false;
//				break;
//			}
//		}
//
//		if (asal) {
//			System.out.println("Asaldır");
//		} else {
//			System.out.println("Asal Sayı Değildir");
//		}
//
//	}
//	scanner.close();
//}

		
	}

}
