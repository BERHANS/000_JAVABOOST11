package com.bilgeadam.week03.lecture003;

public class Questions38 {

	public static void main(String[] args) {

		// dizide 13 sayısına denk gelene kadar devam edin 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değilse 13 den sonra gelen sayıyı tplama ekle
		
		int[] dizi_array = {1, 13, 13, 5, 1, 13};
		int toplam=0;
		for(int i = 0 ; i<dizi_array.length-1 ; i++) {
		if(dizi_array[i]==13) {
			if(dizi_array[i+1]==13) {
				
			}else
				toplam+=dizi_array[i+1];
		}
				
				}
	System.out.println(toplam);
	}

}
