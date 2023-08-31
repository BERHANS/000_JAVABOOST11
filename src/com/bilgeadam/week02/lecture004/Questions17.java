package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Questions17 {

	public static void main(String[] args) {

		/**
		 * telefon kodu ve e mail kodu tanımlıycaz, kullanıcıdan e mail ve telefon kodu girdiricez 
		 * girilen e mail kodu hatalıysa girilen e mail kodu hatalıdır girilen sms kodu hatalıysa girilen sms kodu hatalıdır yazdırıcaz
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int telefon=1234;
		int e_mail=5678;

	System.out.print("LÜTFEN TELEFON KODU GİRİN:   ");	
		telefon=sc.nextInt();
		System.out.print("LÜTFEN E MAİL KODU GİR :    ");
		e_mail=sc.nextInt();
	if(telefon!=1234) {
		System.out.println("sms kodu yanlış");
	}
     if(e_mail!=5678) {
    	 System.out.println("e mail kodu yanlış");
     }
     if (telefon==1234 && e_mail==5678) {
    	 System.out.println("başarıyla giriş yapıldı");
     }
		sc.close();
	}

}
