package com.bilgeadam.week03.lecture001;

public class Questions31 {

	public static void main(String[] args) {

		//arraylarin boyutu sabittir
		//outOfBounds hatası arrayın dışına çıktığımızı söyler
		//NullPointerException
		
		String[] stringArray = new String[4];
		System.out.println(stringArray.length);
		String[] stringArray2 = {"Kelime", "Kelime2"};
		System.out.println(stringArray2.length);
		//String stringArray3[] = new String[3];
		
		boolean[] booleanArray = new boolean [3];// true,false,false -> 1<10
		booleanArray[booleanArray.length-1] = 1<10;
		System.out.println(booleanArray[booleanArray.length-1]);
		
		
		boolean[] booleanArray2 = {true, true, false};
		System.out.println(booleanArray[0]);
		
		
		System.out.println(booleanArray2.length);
		System.out.println(booleanArray2[3]);// hata verir çünkü sınırların dışına taşılır length 3 ise maks indeks2 olur indeks 0 dan başlar
		
		int[] integerPrimitiveArray = new int[3];
		integerPrimitiveArray[1] = 3;
		System.out.println(integerPrimitiveArray[0]);//bize 0 olarak dönücektir çünkü 0 ıncı indekste birşey görünmez
		
		Integer[] integerWrapperArray = new Integer[2];
		//wrapper classlar ile primitive türler arasındaki ilişki ve farklar 
		
		
		
		
		
 		
		
	}

}
