package com.bilgeadam.week07.lecture002.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodları {
	public static void main(String[] args) {
		
		List<String> sehirler = new ArrayList<>();
		
		//listeye ekleme
		sehirler.add("ankara");
		sehirler.add("adana");
		sehirler.add("urfa");
		sehirler.add("hakkari");
		sehirler.add("bitlis");
		sehirler.add("diyarbakır");
		sehirler.add("maraş");
		
		//listede gezme
		sehirler.forEach(System.out::println);
		
		
		//listeden eleman çıkarma
		sehirler.remove(0);
		sehirler.remove("ankara");//bu string ile çalıştığımız için çıkarıyor nesne ile çalışırsak çalışmaz
		
		//listenin belli bir indeksine eleman ekleme 
		sehirler.add(1, "maraş");
		
		//bütün listeyi temizleme
		
		sehirler.clear();
		
		//listenin elemanlarına erişim
		System.out.println();
		sehirler.get(0);
		
		//istenilen indeksi değiştirme 
		sehirler.set(2, "musul");
		
		//listenin boyutuna erişme
		
		System.out.println(sehirler.size());
		
		//liste içerisinde kontrol ve arama yapma 
		sehirler.contains("ankara");
		String sehir = "ankara";
		
		System.out.println(sehirler.contains("ankara"));
		
		sehirler.indexOf("adana");
		System.out.println(sehirler.indexOf("adana"));//eğer girilen eleman listede yok ise -1 döner
		
		//Sublist
		sehirler.subList(3, 7);
		System.out.println(sehirler.subList(3, 7));//listedeki belirli bir aralığın getirilmesini sağlar
													//baslangıc index değerini getirir bitis index degerini getirmez
													//3,4,5, ve 6. indexin verilerini görüntüler
		
		//bir listeyi başka listeye aktarma 
		
		
		
	}
	
	
}
