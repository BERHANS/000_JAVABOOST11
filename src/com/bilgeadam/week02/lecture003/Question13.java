package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
/**
 * dışardan taban değeri ve üs isimli iki değişken al 
 * (2 üzeri 5 gibi) tabanın kuvverini hesaplamak istiyorum 
 * kullanıcıya ismi sorulacak. aldığımız isimle sonucu yazdırıcaz
 */
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Lütfen bir sayı giriniz:   ");
	int sayı1 = sc.nextInt();
	System.out.print("Lütfen üs giriniz:   ");
	int sayı2 = sc.nextInt();
	sc.nextLine();
	int sonuç = 1;
int i = 1;
	while (i<=sayı2) {
		sonuç *= sayı1;
		i++;
		
	}
	System.out.print("LÜTFEN BİR İSİM GİRİNİ:");
	String isim = sc.nextLine();
	System.out.println(	"GİRİLEN TABAN DEĞERİ"+ sayı1 + " girilen üs" + sayı2 + "sonuç" + sonuç );
		
	sc.close();
	
	
	}

}
