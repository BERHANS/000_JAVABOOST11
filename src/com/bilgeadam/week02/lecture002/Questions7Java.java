package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Questions7Java {

	public static void main(String[] args) {
		/**
		 * dışardan 2 girilen tam sayı olucak. iki sayının toplamı çift ise true tek ise
		 * false yazdırıcaz bu değerlerin bir de ortalamasını al
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1.sayıyı giriniz:  ");
		int sayı1 = sc.nextInt();
		System.out.print("2.sayıyı giriniz:  ");
		int sayı2 = sc.nextInt();

		int toplam = sayı1 + sayı2;
		boolean çiftMi = toplam % 2 == 0;

		System.out.println(çiftMi);

		double ortalama = toplam / 2d;
		System.out.println("ortalama:  " + ortalama);
	}

}
