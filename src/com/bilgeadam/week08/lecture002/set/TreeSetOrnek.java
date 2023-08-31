package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {

	/*
	 * klavyeden rastgele 10 tane sayı alıp bunların çıktısını ver
	 */
	static Scanner sc ;
	static Set<Integer> sayilar = new HashSet<Integer>();//karısık bir şekilde ilk bulduğu değerden son bulduğu değere kadar getiriyor
	//performans için hashset daha iyi
	static Set<Integer> ekledigimSiraIle = new LinkedHashSet<Integer>();//girdiğim sıra ile değerleri getiriyo
	static Set<Integer> kucuktenBuyuge = new TreeSet<Integer>();//Girilen verileri sıralı bir şekilde küçükten büyüğe sıralar.
	static Set<Ogrenci> ogrenciSet = new TreeSet<Ogrenci>();
	public static void main(String[] args) {
			

//		sayiEkle();
//		System.out.println("hash set ile ");
//		yazdir(sayilar);
//		System.out.println("linked hash set ile ");
//		yazdir(ekledigimSiraIle);
//		System.out.println("TreeSet ile ");
//		yazdir(kucuktenBuyuge);
		
		ogrenciSet.add(new Ogrenci(100, "cafer"));
		ogrenciSet.add(new Ogrenci(70, "alperen"));
		ogrenciSet.add(new Ogrenci(3, "sedat"));
		ogrenciSet.add(new Ogrenci(150, "furkan"));
		ogrenciSet.add(new Ogrenci(13, "zeynep"));
		ogrenciSet.add(new Ogrenci(53, "banu"));
		ogrenciSet.add(new Ogrenci(40, "nilsel"));
		
		ogrenciSet.forEach(System.out::println);
	}

	public static void sayiEkle() {
		sc = new Scanner(System.in);
		
		for(int i =0; i<10;i++) {
			System.out.println("lütfen bir sayı girin");
			int sayi = sc.nextInt();
			sayilar.add(sayi);
			ekledigimSiraIle.add(sayi);
			kucuktenBuyuge.add(sayi);
		}
	}
	
	public static void yazdir(Set<Integer> set) {
		set.forEach(System.out::println);
	}
}
