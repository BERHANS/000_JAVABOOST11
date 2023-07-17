package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Questions24 {

	public static void main(String[] args) {
/**
 * klavyeden 0 ile 100 arasında ikisi de dahil 5 adet sayıyı kullanıcıdan al
 * 5 adet sayıdan en büyük ve en küçük olanları yazdır
 */
	
	Scanner sc= new Scanner(System.in);
	
	int min=Integer.MAX_VALUE;
	int maks=Integer.MIN_VALUE;
	int i =1;
	while( i<=5) {
			System.out.println("SAYI GİR ");
	int sayı=sc.nextInt();
		
				if(sayı<100 || sayı>=0) {
					
			if(sayı>maks) {
				maks=sayı;
		}
			if(sayı<min) {
			min=sayı;
			}
			i++;
				}else 
					System.out.println("geçerli sayı gir");
			
			
	}
			System.out.println("" + min );
			System.out.println(""+ maks);
			
	
	
	
	
	
	}

}
