package com.bilgeadam.week04.lecture002;

import java.util.Scanner;

public class Questions46 {

	public static void main(String[] args) {

		//Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

		//2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

		//eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri metoda geçelim.

		//main'de dışarıdan kaç sayı alacağımızı belirliyoruz, o sayılara göre koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan birisini çağıracağız.
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("kaç tane sayı giriceksiniz: ");
				int secim = sc.nextInt();
	
				switch(secim()){
				case 2: System.out.println(toplamaIslemi());break;		
				case 3: System.out.println(toplamaIslemi(0, 0, 0));break;
			
		
			
			
			
		
			
				
			}
			
	
			Scanner sc = new Scanner(System.in);
		
			public int toplamaIslemi() {
			System.out.print("ilk sayıyı girelim: ");
			int ilksayi = sc.nextInt();
			System.out.print("ikinci sayıyı girelim: ");
			int ikincisayi = sc.nextInt();
			return ilksayi+ikincisayi;
			}
		
			
			public int toplamaIslemi(int sayi1, int sayi2, int sayi3) {
			return sayi1+sayi2+sayi3;
			}

				
}
