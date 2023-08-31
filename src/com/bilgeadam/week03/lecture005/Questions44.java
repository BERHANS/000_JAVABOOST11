
package com.bilgeadam.week03.lecture005;

import java.util.Scanner;

public class Questions44 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Bir metot olsun, metodun içine 2 tane sayı alalım. Bu sayıları çarpıp çarpım değerini döndürelim.
		//main metodumda bir sayı değeri olacak sayi=15, bir de sonuc değeri olacak sonuc=0; aşağıda oluşturduğum
		//metotlardan dönen değerleri sonuc = sayi/"metot" işleminde kullanmak istiyorum.
		//yeni bir carpim metodu oluşturalım, iki adet sayıyı dışarıdan alan bir metot oluşturalım. Bu metot 2 sayıyı geri dönsün. 
		//Sonra yeni oluşturduğumuz çarpım metodunda iki adet sayı alan metodumuzu kullanarak aynı işlemleri gerçekleştirelim.
//		int result = multiplyTwoNumbers();
//		System.out.println("Result = " + result);
//
//		int result2 = multiplyTwoNumbers(15, 10);
//		System.out.println("Result = " + result2);
//
//		int number = 15;
//		double result3 = 0;
//		int total = 0;
//		total = multiplyTwoNumbers();
//		if (total == 0) {
//			System.out.println(number + "/" + total + " işleminin sonucu tanımsızdır.");
//		} else {
//			result3 = (double) number / total;
//			System.out.println(number + "/" + total + " = " + result3);
//		}
//
//		if (multiplyTwoNumbers(1, 15) == 0) {
//			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " işleminin sonucu tanımsızdır.");
//		} else {
//			result3 = (double) number / multiplyTwoNumbers(1, 15);
//			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " = " + result3);
//		}
//
//		total = multiplyTwoNumbers2(getTwoNumbers());
//
//		if (total == 0) {
//			System.out.println(number + "/" + total + " işleminin sonucu tanımsızdır.");
//		} else {
//			result3 = (double) number / total;
//			System.out.println(number + "/" + multiplyTwoNumbers(1, 15) + " = " + result3);
//		}

		
		
		
		
		System.out.println(ikiSayininCarpimi()); 
		System.out.println(ikiSayininCarpimi(30, 40));
		int sayi = 15;
		double sonuc = 0;
		System.out.println(sonuc = (double)sayi/ikiSayininCarpimi());
		System.out.println(sonuc = (double)sayi/ikiSayininCarpimi(30,40));
	System.out.println("sonuç = " + ikiSayiyiDişardanAlanCarpim(ikiSayiAl()));
		
	}
	public static int ikiSayininCarpimi () {
		System.out.print("birinci sayıyı giriniz: ");
		int sayi1 = sc.nextInt();
		System.out.print("ikinci sayıyı giriniz: ");
		int sayi2 = sc.nextInt();
		return sayi1 * sayi2;
	}
	
	public static int ikiSayininCarpimi(int sayi1 , int sayi2) {
		
		return sayi1*sayi2;
	}
	public static int[] ikiSayiAl() {
		int[] sayilar = new int[2];
		System.out.println("birinci sayıyı girelim");
		sayilar[0] = sc.nextInt();
		System.out.println("ikinci sayıyı girelim");
		sayilar[1] = sc.nextInt();
		return sayilar;
	}
	public static int ikiSayiyiDişardanAlanCarpim(int[] sayilar) {
	int sonuc = sayilar[0] * sayilar[1];
		return sonuc;
	}

	
}
