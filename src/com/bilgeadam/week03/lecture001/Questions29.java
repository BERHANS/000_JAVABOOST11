package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Questions29 {

	public static void main(String[] args) {

		/*
		 * Menu 
		 * 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		 *   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		 *   eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		 * 
		 * 
		 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		 * içerisinde o harf varsa değiştirsin
		 * 
		 *
		 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		 * olmadığını bulunuz(kek,iki,kabak)
		 * 
		 * 
		 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde)  a lar için bir sayfaya b ler  bir sayfaya  cler bir
		 * sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
		 * sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
		 * sayfa oluğunu ekrana yazdıralım
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean kontrol = true;
		while(kontrol) {
			System.out.println("**************************");
			System.out.println("1- Bir kelime ve harf giriniz,kelimenizde o harf varsa kaç tane olduğunu ve indeks numarasını verir.");
			System.out.println("2- Bir kelime giriniz daha sonra değiştirmek istediğiniz harfi ve hangi harfle değiştirmek istiyosanız onu girin ");
			System.out.println("3- Girdiğiniz kelimeyi ters çevirip yazdırır,polindrom olup olmadığını bulur");
			System.out.println("4- 5 adet kelime girdisi alınır (a,b veya c) ile başlayıp başlamadığı kontrol edilir");
			System.out.println("0- ÇIKIŞ");
			System.out.print("SEÇMEK İSTEDİĞİNİZ İŞLEM NEDİR.........:");
			int secim = sc.nextInt();
			sc.nextInt();
			
			
			
	
			switch(secim) {   
			case 1: System.out.println("Kelime giriniz...........:");
			        String kelime1= sc.nextLine();
			        		       
			        System.out.println("Harf Giriniz.......:");
			        String harf1= sc.nextLine();
	                
			       int adet=0;
	               if(!kelime1.contains(harf1)) {
	            	   System.out.println("GİRDİĞİNİZ KELİMEDE HARF YOK");
	               break;
	               } 
	               for(int i= 0 ; i<kelime1.length();i++) {
                   if(kelime1.charAt(i)== harf1.charAt(0)) {
	                adet++;
	               System.out.println("Girdiğiniz kelimenin " + i + ". indeksinde " + harf1 + "harfi bulunmaktadır");
                   } 
	               System.out.println("girdiğiniz harften " + adet + "tane bulunmaktadır");
	               break;
	                
	                } 
		   case 2: 
			   System.out.println("Kelime giriniz:    ");
			   String kelime2 = sc.nextLine();
			   System.out.println("Değiştirmek istediğiniz harf:    ");
			   String harf2 = sc.nextLine();
			   System.out.println("Hangi harfle değişicek:    ");
			   String harf3 = sc.nextLine();
			   
			   kelime2 = kelime2.replace(harf2,harf3);
			   
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
		
		
		
			
		
		
	}//method sonu

}//class sonu
