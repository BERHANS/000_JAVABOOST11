package com.bilgeadam.week04.lecture003;

public class Question50 {

	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		/*
		 * 
		 * 
		 * 
		 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini yazdıralım.
		 */
		tekrarEdenSay(dizi);
		
	}

	public static void tekrarEdenSay(int[] array) {
	boolean[] kontrol = new boolean[array.length];//değerleri direkt false olarak alıyor.
	for(int i = 0 ; i<array.length ;i++) {
		
		if(kontrol[i] == true) {
			continue;//döngünün dışına çıkmadan devam eder
		}
		int count = 0;
		for(int j = 0; j<array.length ; j++) {
			if(array[i]==array[j]) {
				count++;
				kontrol[j]=true;
			}
		}
		System.out.println(array[i] + " sayısı " + count + " adet bulunmaktadır ");
	}
	}
}