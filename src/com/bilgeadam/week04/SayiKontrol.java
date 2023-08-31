package com.bilgeadam.week04;

import java.util.Scanner;

public class SayiKontrol {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println(isNumeric());
	}

	public static boolean isNumeric() {
		boolean isNumeric = true;
		String[] sayilar = new String[2];
		System.out.print("Lütfen birinci sayıyı griniz:   ");
		sayilar[0] = sc.nextLine();
		System.out.print("Lütfen ikinci sayıyı giriniz:  ");
		sayilar[1] = sc.nextLine();
		int birincisayi = Integer.parseInt(sayilar[0]);
		int ikincisayi = Integer.parseInt(sayilar[1]);
		
		for(int i  = 0; i<sayilar.length ; i++) {
			if(birincisayi<0) {
				 isNumeric = false;
				 System.out.println("ilk sayiyi geçerli bir sayı ile değiştirin");
				 
			} if(ikincisayi<0) {
				isNumeric = false;
				System.out.println("ikinci sayiyi geçerli bir sayi ile değiştirin");
			}
				
		}
			return isNumeric;
			
		
	}
	
	
	
}
