package com.bilgeadam.week03.lecture003;

public class Questions36 {

	public static void main(String[] args) {
/**
 * dizideki bütün sayıların toplamını yazdıralım
 * dizinin her bir elemanı için 
 * çift ise çifttir tek ise tektir 
 */
		int[] dizi_array = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int toplam = 0;
		for(int i = 0; i<dizi_array.length;i++) {
		if(dizi_array[i]%2==0) {
			System.out.println("sayı çifttir\t" + dizi_array[i]);
		}else
			System.out.println("sayı tektir\t" + dizi_array[i]);
		toplam+=dizi_array[i];
		
		}
	System.out.println("TOPLAM " + toplam);
	}

}
