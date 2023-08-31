package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Questions6Java {

	public static void main(String[] args) {
		/**
		 * dairenin alanını ve çevresini bulalım yarı çap dışarıdan input olarak
		 * girilicek pi=3.14
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Yarı çap giriniz:  ");// yarıçap yanında yazılsın istiyosak println deki ln yi kaldırırz
		double r = sc.nextDouble();
		double a = (3.14) * r * r;
		double c = (2 * (3.14) * r);
		System.out.println("alan: " + a + "\nÇevresi:  " + c);
//scanner ile işimiz bittiğimizde scanner.close(); diyip kapatabilitiz
		sc.close();
	}

}
