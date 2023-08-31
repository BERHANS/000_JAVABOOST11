package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Questions25 {

	public static void main(String[] args) {
		/**
		 * dışardan bir string girdisi olsun bu stringin her bir char ını bulunduğu index ile birlikte yazdır
		 * alt alta yazdır
		 */

		Scanner sc= new Scanner(System.in);
		
		System.out.print("KELİME GİR:     ");
		String kelime= sc.nextLine();
		
		for(int i=0;i<kelime.length();i++) {
		System.out.println(i+ " " + kelime.charAt(i));
				}
	/**
	 * our of band length in dışına taştığımız için sistem hata veriyor
	 */
		
		
		
		
		
		
	}

}
