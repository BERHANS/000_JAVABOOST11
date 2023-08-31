package com.bilgeadam.week04.lecture002;

public class Questions48 {

	public static void main(String[] args) {
		//dizideki elemanlar arası farkın en küçük olduğu
		int[] array = {1,5,-4,3};
		System.out.println(farkHesaplama(array));
		
	}

	public static int farkHesaplama(int[] array) {
		int mın = Integer.MAX_VALUE;
		int sonuc;
		for(int i = 0 ; i<array.length ; i++) {
			for(int j = i+1 ; j<array.length ; j++) {
				 sonuc = Math.abs(array[i] - array[j]);
				if(sonuc<mın) {
					mın = sonuc;
				}
			}
		
		}
		return mın;
	}

}

