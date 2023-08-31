package com.bilgeadam.week04.lecture002;

import java.util.Random;

public class Uygulama {

	public static void main(String[] args) {

		
		TasKagitMakas tkm = new TasKagitMakas();
		String[] array = tkm.tasKagitMakas;
		Random random = new Random();
		int sayi = random.nextInt(1,4);//içine değer girersek o kadar sınırlı sayıda üretir 
		
		tkm.secimEkranı();
	}

}
