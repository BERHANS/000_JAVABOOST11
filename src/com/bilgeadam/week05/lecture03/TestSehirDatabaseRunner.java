package com.bilgeadam.week05.lecture03;

import java.util.Scanner;

public class TestSehirDatabaseRunner {
	/**
	 * 1- Dışardan girilen harf ile başlayan illeri yazdır
	 * 2- "01-Adana" formatıyla illeri plaka kodlarıyla yazdıran method
	 *3- Girdiğimiz şehrin ismine göre plakasını dönen method 
	 * @param args
	 */
	public static void main(String[] args) {

		
		SehirDatabase sehir = new SehirDatabase();
//		yazdir(sehir.iller);
		yazdir1(sehir.iller1);
		
	}

	public static void yazdir(String[] il) {
		System.out.println("harf gir");
		Scanner sc = new Scanner(System.in);
		String harf = sc.nextLine();
		
		for(int i =0 ;i<il.length;i++) {
			if(il[i].startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(il[i]);
			}
		}
			
	}
	
	public static void yazdir1(String[] il) {
	Scanner sc = new Scanner (System.in);
	System.out.println("şehrin ismini girin");//return ile bir değer dönerken syso içine alıp yazdırmak gerekli.
	String isim = sc.nextLine();
		for(int i =0; i<il.length;i++) {
		if(isim.equalsIgnoreCase(il[i])) {
			if(i<9) {
			System.out.println("0"+(i+1) + "-"+il[i]);
			}else
				System.out.println((i+1) + "-" + il[i]);
			}
		
		}
	}
}
