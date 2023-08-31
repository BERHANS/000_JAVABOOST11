package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Questions23 {

	public static void main(String[] args) {

	/**
	 * girilen sayının mükemmel olup olmadığını bul
	 */
	
	Scanner sc= new Scanner(System.in);
	System.out.println("SAYI GİR ");
	int sayı = sc.nextInt();
	int toplam=0;
	for(int i=1 ; i<=sayı/2;i++) {
		if(sayı%i==0) {
			toplam+=i;
	} 
	}
	if(toplam==sayı) {
		System.out.println("MÜKEMMEL SAYI");
	}else
		System.out.println("mükemmel sayı değildir");
	

	
	
	
	
	
	
	}

}
