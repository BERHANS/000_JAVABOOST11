package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
/**
 * girilen sayının5 in kuvveti olup olmadığını bulan program
 */
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("sayı gir");
	int sayı= sc.nextInt();

	boolean kontrol =true;
	if(sayı==1) {
		System.out.println("sayı5 in kuvveti");
		kontrol=false;
	}else if (sayı<0) {
		System.out.println("pozitif sayı gir");
		kontrol=false;
	}while(kontrol) {
		if(sayı%5==0) {
			sayı/=5;
			if(sayı==1) {
				System.out.println("sayı 5 in kuvveti");
				kontrol=false;
			}
			}else {
				System.out.println("sayı 5 in kuvveti değildir");
				kontrol=false;
		}
	}

		
	
	
	
	
	}//method sonu

}//class sonu
