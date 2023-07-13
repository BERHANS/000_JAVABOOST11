package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Questions12 {

	public static void main(String[] args) {
/** 
 * girilen sayının basamakları toplamını ekrana yazdırın
 * 
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("SAYI GİRİNİZ:    ");
		int sayı = sc.nextInt();
	
		int toplam=0;
		int sayaç=0;
		
		do {
			toplam += sayı%10;
			sayı /=10;
			sayaç++;
		}while(sayı!=0);
			System.out.println("Basamaklar toplamı:   " + toplam + "\n basamak sayısı" + sayaç);
			
			sc.close();
			
	
			}
			
			
			
			
		
		
		
	}

}
