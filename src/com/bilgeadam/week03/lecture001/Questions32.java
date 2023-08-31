package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Questions32 {

	public static void main(String[] args) {

		/**
		 * dışardan girilen ülke ismi array de bulunuyor mu 
		 * Türkiye Japonya Moğolistan Amerika Rusya Çin UAE
		 * 
		 */
	Scanner sc = new Scanner(System.in);
		String[] ulkeler = new String[7];
		ulkeler[0] = "Türkiye";
		ulkeler[1] = "Japonya";
		ulkeler[2] = "Moğolistan";
		ulkeler[3] = "Amerika";
		ulkeler[4] = "Rusya";
		ulkeler[5] = "Çin";
		ulkeler[6] = "UAE";
		
		System.out.println("ÜLKE GİR :     ");
		String ulke1 =sc.nextLine();
		
		for(int i = 0; i<ulkeler.length ;i++)
		if(ulkeler[i].equalsIgnoreCase(ulke1)) {
			System.out.println("OKEYY");
		break;
		}else if(i==ulkeler.length-1) {
		System.err.println("yookkk");
		}
	sc.close();
	}

}
