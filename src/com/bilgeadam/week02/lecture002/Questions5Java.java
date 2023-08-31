package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Questions5Java {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int intagersayı = scanner.nextInt();
		System.out.println("lütfen bir sayı giriniz: ");
		// double doublesayı = sc.nextDouble();

		double doublesayı = sc.nextDouble();
		// next double ekledikten sonra kendine \n ekler.
		// scanner ile sayısal bir değer okuduktan sonra string bir değer okumak
		// istiyosak
		// mutlaka 1 tane boş scanner.nextLine(); kullanmamız gerekir.
		sc.nextLine();

		double ikincisayı = 5;

		System.out.println(doublesayı + ikincisayı);

		System.out.println("lütfen adınızı giriniz: ");
		String isim = sc.nextLine();
		// System.out.println("Merhaba: " + isim + ikincisayı);

	}

}
