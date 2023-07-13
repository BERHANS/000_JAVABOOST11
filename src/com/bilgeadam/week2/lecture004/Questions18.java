package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Questions18 {
public static void main(String[] args) {
	
	/**
	 * telefon kodu ve e mail kodu tanımlıycaz, kullanıcıdan e mail ve telefon kodu girdiricez 
	 * girilen e mail kodu hatalıysa girilen e mail kodu hatalıdır girilen sms kodu hatalıysa girilen sms kodu hatalıdır yazdırıcaz
	* hem sms hem e mail kodu hatalıysa 1 ıktı sms doğru e mail hatalıysa 1 çıktı 
	* sms yanlış e mail doğru ise farklı bir çıktı
	* hepsi doğruysa giriş yaptınız
	 */
	Scanner sc= new Scanner(System.in);
	
	int telefon=1234;
	int email=5678;
	System.out.print("SMS KODU GİR:  ");
	telefon=sc.nextInt();
	System.out.println("EMAİL KODU GİR");
	email=sc.nextInt();
	if(telefon!=1234 && email==5678) {
		System.out.println("sms kodu hatalı email doğru");
	}else if(email!=5678 && telefon==1234) {
		System.out.println("email kodu yanlış sms doğru");
	}else if(telefon!=1234 && email!=5678) {
		System.out.println("sms ve email yanlış");
		
	}else if(telefon==1234 && email==5678) {
		System.out.println("Gİriş yapıldı");
	}
	sc.close();
	
}
}
