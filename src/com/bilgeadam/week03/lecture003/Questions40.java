package com.bilgeadam.week03.lecture003;

public class Questions40 {



	public static void main(String[] args) {
		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı ise
		 * ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise bilgeadam yazdıralım. int start=2; int
		 * end=22;
		 * 
		 * 
		 */
	
	
	int start = 2;
	int end = 22;
	String[] array = new String [end - start +1];
	
	for(int i = 0; i<array.length ; i++) {
		int sayi = i+start;
		if(sayi % 15 ==0) {
			array[i] = "BilgeAdam";
		}else if(sayi % 5 ==0) {
			array[i] = 	"ADAM";
		}else if (sayi % 3 ==0) {
			array[i] = "BİLGE";
		}else {
			array[i] = "" + sayi;
		}
	
	}
		for(int j=0; j<array.length;j++) {
			if( j == array.length-1) {
				System.out.println(array[j]);
			}else {
			System.out.print(array[j] + " ,");
			}
			}
			
	
	
	
	}
}
