package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {
		
//		Set<Integer> integerSet = new HashSet<Integer>();
//		integerSet.add(10);
//		integerSet.add(20);
//	
//		integerSet.forEach(System.out::println);
//		
		/*
		 * bir tane string set oluştur daha sonra dışarıdan bir kategori istediğimiz bir method olsun 
		 * bu kategorileri sete ekleyelim daha önce eklediysek bu kategori daha önce eklendi çıktısı versin 
		 * daha önce eklenmediyse kategori başarıyla eklendi çıktısı versin 
		 */

		Set<String> set = new HashSet<String>();
		
		kategoriEkle("aksiyon", set);
		kategoriEkle("dram", set);
		kategoriEkle("romantik", set);
		kategoriEkle("macera", set);
		kategoriEkle("macera", set);
		
		for(String kategori:set) {
			System.out.println( kategori);
		}

		

	}

	public static void kategoriEkle(String kategori, Set<String> set) {
		if(set.contains(kategori)) {
			System.out.println(kategori+" kategorisi daha önce eklenmiştir");
		}else {
			set.add(kategori);//setlerde add methodu boolean döner
			System.out.println(kategori+ " kategorisi başarılı bir şekilde eklenmiştir");
		}
	}
	
	public static void kategoriEkle2(String kategori,Set<String> set) {
		if(set.add(kategori)){//burda kategori daha önce eklenmişse false döner
			System.out.println("daha önce eklendi");
		}else {
			System.out.println("başarıyla eklendi");
		}
	}


}