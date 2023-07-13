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
	}else if(sayı==2) {
		System.out.println("asaldır");
	}else if(sayı%2==0 || sayı%3==0 || sayı%4==0 || sayı%5==0 || sayı%6==0 || sayı%7==0 || sayı%8==0 || sayı%9==0) {
		System.out.println("ASAL SAYI DEĞİLDİR");
	}else {
		System.out.println("asal sayıdır");
	}
		
		
		
	}

}
