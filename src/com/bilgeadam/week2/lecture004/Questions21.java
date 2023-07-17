package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Questions21 {

	public static void main(String[] args) {

		/**
		 * kullanıcı 1 ile 7 arasında sayı girsin dahil ikisi de, bu sayıları girdikten sonra bu sayıya denk gelen haftanın gününü yazdıralım
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Lütfen Bir Sayı Giriniz:    ");
		int sayı= sc.nextInt();
		
		
		switch(sayı) {
		case 1: System.out.println("PAZARTESİ");break;
		case 2: System.out.println("SALI");break;
		case 3: System.out.println("ÇARŞAMBA");break;
		case 4: System.out.println("PERŞEMBE");break;
		case 5: System.out.println("CUMA");break;
		case 6: System.out.println("CUMARTESİ");break;
		case 7: System.out.println("PAZAR");break;
		default: System.out.println("LÜTFEN 1 İLE 7 ARASINDA BİR SAYI GİR");
		}
		
		sc.close();
		
		
	}

}
