package com.bilgeadam.week03.lecture004;

public class Questions41 {

	public static void main(String[] args) {

	/**
	 * çarpım tablosu yazdır
	 * 1x1 = 1 gibi
	 * 	
	 */
		
		String[][] sayi = new String [10][10];
		
		for ( int i = 0 ; i<sayi.length ;i++) {
			for (int j = 0 ; j<sayi[i].length ; j++) {
		sayi[i][j] = (i+1) + " x " + (j+1) + " = " + ((i+1) * (j+1));
		
			}
		}
		for(int i = 0; i<sayi.length; i++) {
			for(int j = 0; j<sayi.length; j++) {
				System.out.println(sayi[i][j]);
			}
		System.out.println();
		}
		
		
		
		
		
		
		
	}

}
