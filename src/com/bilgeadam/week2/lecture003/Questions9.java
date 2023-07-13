package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Questions9 {

	public static void main(String[] args) {
/**
 * kullanıcıdan girilen 1-10 arasındaki sayının çarpım tablosunu yazdıran program
 * 
 * 
 * 
 */
	Scanner sc = new Scanner(System.in);
	System.out.print("SAYI GİR:   ");
		int sayı=sc.nextInt();
	int çarpım =0;
		
	for(int i = 0; i<=10 ; i++) {
	çarpım =i*sayı ;
	System.out.println("sayı:  " + sayı + " x " +  i  + "çarpım:  "+ çarpım);
	}
	
	
	
	}

}
