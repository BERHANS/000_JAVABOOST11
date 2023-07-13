package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Questions10 {

	public static void main(String[] args) {

		/**
		 * 1'den başlayarak kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların bir fazlasınının 
		 * tplamını ekrana yazdıran program
		 */
		Scanner sc= new Scanner(System.in);
	System.out.print("sayı gir:  ");
	int sayı = sc.nextInt();
	int toplam=0;
	
		for (int i=1; i<=sayı;i++){
		toplam += (i+1);
		}
		System.out.println("TOPLAM :   "+ toplam);
		
	sc.close();	
		
		
		// int toplam= 0;
//		int i =1;
	//	while ( İ<=sayı){
		//toplam += i+1;
		//i++;
		//}
		//System.out.println(toplam);
		
		
	}

}
