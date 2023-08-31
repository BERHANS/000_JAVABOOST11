package com.bilgeadam.week02.lecture002;

public class Questions4Java {

	public static void main(String[] args) {

		/**
		 * iki tane string değişken oluştrulaım. isim ve soyisim olsun sonra bu
		 * değişkenleri ekrana yazdıralım isim soyisim hem alt alta hem yan yana
		 * yazdıralım
		 * 
		 */

		String isim = "Berhan";
		String soyisim = "SATIMIŞ";
		String isimSoyisim = " isim " + isim + " soyisim " + soyisim;
		System.out.println(isimSoyisim);
		// System.out.println(" isim " + isim);
		// System.out.println(" soyisim " + soyisim);

		System.out.println(" isim:" + isim + "\nsoyisim:" + soyisim);

		// \n metin içinde yazılması gerekir ve alt alta yazımı gerçekleştirir

		int i = 5;
		int j = 7;
		int toplam = i + j;
		System.out.println("TOPLAM: \n" + toplam);

		/*
		 * a ve b karakterlerinin değerini yazdıralım
		 */
		// char a = 'a';
		// char b = 'b';
		// System.out.println(a + b);

		System.out.println('a' + 'b');// bir diğer gösterim.
// ctrl+shift+7 yaparak yorum satırı yapıp yorum satırından çıkarabiliriz toplu olarak

	}

}
