package com.bilgeadam.week07.lecture002.arraylistOrnek2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 1tane tek sayilar 1 tane çift sayılar için bir liste olusturalim
		 * 
		 * sonra 35 tane random sayiyi çift ise çiftlere tek ise teklere atalim
		 * 
		 * en sonunda tekler ve çiftler listesini yazdiralim
		 * 
		 * 
		 * 
		 * 
		 */

		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();
			Random rastgele = new Random();
        
        
		for(int i = 0 ; i<35 ;i++) {
			int sayi = rastgele.nextInt(100);
		if(sayi %2==0) {
			ciftSayilar.add(sayi);
		}else
			tekSayilar.add(sayi);
		}
		System.out.println("çift sayilar*****************");
		ciftSayilar.forEach(System.out::println);
		System.out.println("tek sayilar*************");
		tekSayilar.forEach(System.out::println);
		
		
		
	}

}
