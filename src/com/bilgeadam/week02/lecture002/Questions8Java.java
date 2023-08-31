package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Questions8Java {

	public static void main(String[] args) {
		/**
		 * dışarıdan girilen sayının faktöriyelini hesaplayalım
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayıyı gir:  ");
		int sayı = sc.nextInt();
			int çarpım = 1;
			for (int i=1; i <=sayı; i++){

				çarpım = çarpım*i;
				
		}
		System.out.println(çarpım);

	}

}
