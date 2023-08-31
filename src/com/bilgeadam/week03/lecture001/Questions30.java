
package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Questions30 {

	public static void main(String[] args) {

		/*
		 * 
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine 
		 * Ki 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("İBAN GİRİNİZ:     ");
		String ıban = sc.nextLine();
		ıban.toUpperCase();
		if(ıban.startsWith("TR")) {
			System.out.println("YURT İÇİ İŞLEMLER........");
		}
		if(ıban.substring(0))) {
			
		}
		
		
		
		
		
		
	}

}
