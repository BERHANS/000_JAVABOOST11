package com.bilgeadam.week09.lecture04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateOrnek {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2023, 12, 10);
		System.out.println(date2);
		
		long gun = date2.until(date1,ChronoUnit.DAYS);
		System.out.println(gun);
		
		long ay = date2.until(date1,ChronoUnit.MONTHS);
		System.out.println(ay);
		
		long hafta = date2.until(date1,ChronoUnit.WEEKS);
		System.out.println(hafta);
		
		System.out.println(date2.plusDays(25));
		System.out.println(date2.plusMonths(2));
		System.out.println(date2.plusWeeks(8));
		System.out.println(date2.plusYears(2));
		
		System.out.println(date2.minusDays(5));
		System.out.println(date2.minusMonths(1));
		System.out.println(date2.minusWeeks(4));
		System.out.println(date2.minusYears(1));
		
		System.out.println("Yil : " + date2.getYear());
		System.out.println("Ay : " + date2.getMonth());//ayın ismini döner
		System.out.println("Ay : " + date2.getMonthValue());//ayın numarasını dönüyor
		System.out.println("Gün : " + date2.getDayOfMonth());//aya göre günü verir 
		System.out.println("Yılın kaçıncı günü : " + date2.getDayOfYear());//yıla göre kaçıncı gün olduğunu söyler
		System.out.println("Gunun adı : " + date2.getDayOfWeek());
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.isAfter(date2));
		
		Scanner sc = new Scanner (System.in);
//		System.out.println("Lütfen yıl giriniz : ");
//		int yil = sc.nextInt();
//		System.out.println("Lütfen gun giriniz : ");
//		int gun = sc.nextInt();
//		System.out.println("Lütfen ay giriniz : ");
//		int ay = sc.nextInt();
//		
//		LocalDate date3 = LocalDate.of(yil, ay, gun);
		
		LocalDate date4 = LocalDate.parse("2023-12-05");
		System.out.println(date4);
		
		
		LocalDate date5 = LocalDate.parse(sc.nextLine());
		System.out.println(date5);
		
		
	}

}
