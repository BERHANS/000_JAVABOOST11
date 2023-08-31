package com.bilgeadam.week03.lecture005;

import java.util.Scanner;

public class Questions45 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Türkçe karakterleri İngilizce karakterlere çevirme
		/**
		
		*Bir metot yazalım. metot arraylerimizin ikisini de alsın.

		*daha sonra metodun içinde bir string değer alalım.

		*sonra Türkçe karakterleri İngilizce karakterlere dönüştürüp, dönüştürülmüş hali geri dönelim.

		*döndüğümüz String değerini main metotta yazdıralım.

		*/
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		System.out.println(changeString(turkceKarakter,ingilizceKarakter));
	
		
	}
	public static String changeString(String[] tr, String[] eng) {
		System.out.println("kelime giriniz: ");
		String kelime = sc.nextLine();
		for(int i = 0; i<tr.length ; i++) {
			kelime = kelime.replace(tr[i], eng[i]);
			
		}
		return kelime;
	}
	
	
	
}
