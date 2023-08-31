package com.bilgeadam.week09.lecture04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {

	public static void main(String[] args) {
		/**
		 * Dışarıdan String olarak doğum günü alınız 
		 * 
		 * daha sonra doğduğunuz günden bu güne kadar kaç yıl kaç gün kaç hafta kaç ay geçtiğini hesaplayınız
		 * bunları yazdırın
		 * 
		 * bir sonraki doğum gününüze kaç gün kaldığını hesaplayın
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("hangi gün doğdunuz ?");
		int gün = sc.nextInt();
		
		System.out.println("hangi ay doğdunuz ?");
		int ay = sc.nextInt();
		
		System.out.println("hangi yıl doğdunuz ?");
		int yıl = sc.nextInt();
		
		LocalDate date1  = LocalDate.of(yıl, ay, gün);
		LocalDate date2 = LocalDate.now();
		LocalDate date3 = LocalDate.of(2024,05, 16);
		
		long gunHesapla  = date1.until(date2, ChronoUnit.DAYS);
		System.out.println(gunHesapla);
		long yilHesapla = date1.until(date2, ChronoUnit.YEARS);
		System.out.println(yilHesapla);
		long ayHesapla = date1.until(date2, ChronoUnit.MONTHS);
		System.out.println(ayHesapla);
		long haftaHesapla = date1.until(date2, ChronoUnit.WEEKS);
		System.out.println(haftaHesapla);
		
		long gelecekDogum = date2.until(date3, ChronoUnit.DAYS);
	System.out.println("doğum günüme kalan gün : " + gelecekDogum);
	
		
	}

}
