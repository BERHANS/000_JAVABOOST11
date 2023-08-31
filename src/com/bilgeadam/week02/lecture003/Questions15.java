package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Questions15 {

	public static void main(String[] args) {
/**
 * Klavyeden 0 girilinceye kadar sayı okumaya devam edilicek 0 girildiğinde sayıların toplamını ve 
 * ortalamasını ekrana yazdır 
 */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("sayı gir:    ");
	int sayı = sc.nextInt();
	int toplam= 0;
	int sayaç =0;
	double ortalama=0;
	while ( sayı!=0) {
		sayaç++;
		toplam += sayı;
		ortalama= (double)toplam/sayaç;
		System.out.println("LÜTFEN SAYI GİR:   ");
		sayı=sc.nextInt();
	}
	System.out.println("sonuç....." + toplam+ "\nortalama:    " + ortalama);
	
	
	
	}

}
