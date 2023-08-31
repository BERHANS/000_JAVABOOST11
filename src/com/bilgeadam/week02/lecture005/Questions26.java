package com.bilgeadam.week02.lecture005;

public class Questions26 {

	public static void main(String[] args) {

		String value=" Merhaba Dünya ";
		String value2= "Merhaba Dünya";
		String value3="Merhaba Dünya";
		
		System.out.println(value.charAt(2));
		System.out.println(value);
		System.out.println(value.trim());//boşlukları atar
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));// ilk a nın yerini gösterir
		System.out.println(value.lastIndexOf("a"));//son a harfinin yerini gösterir
		System.out.println(value.substring(5));
		System.out.println(value.substring(0,5));
		System.out.println(value.equals(value2));//value ve value2 stringlerimin eşit olup olmadığını kıyaslar(true ya da false olarak döner
		System.out.println(value==" Merhaba Dünya ");//true ya da false olarak döner
		System.out.println(value.trim()==value2);// biz == ile ramdeki referans değerine bakıyoruz yani aynı yerde kayıt olmuşlar mı diye baktık.
		//intlerde bu durum true dönerken stringler ilkel veri tipi olmadığı için true dönmez.
		System.out.println(value.trim().equals(value2));// string kıyaslanırken equals kullanılır
		System.out.println(value2==value3);//bunlar başlangıçta aynı olduğu için cevap true dönüyor referans değerleri aynı dönüyo
		
		/**
		 * 
		 */
		
		
		
		
		
	}

}
