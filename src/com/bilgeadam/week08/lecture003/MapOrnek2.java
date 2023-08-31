package com.bilgeadam.week08.lecture003;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {
			
		/*
		 * ogrenci ve maplardan oluşan bir map oluşturalım
		 * ogrenciyi çcagırdıgımızda bana notları donsun
		 * mapi yazdıralım
		 */
		String[] ogrenci = {"ayse","ece","mahmut"};
		int[] notlar = {60,70,80};
		int[][] notlar2 = {{50,60,60},{60,40,80},{80,90,100}};//map olustur 2 methodu ve mapi yazdıralım
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ayse", 60);
		map.put("ece", 70);
		map.put("mahmut", 80);

		for(java.util.Map.Entry<String, Integer> ogrenciler : map.entrySet()) {
			System.out.println(ogrenciler.getKey());
			System.out.println(ogrenciler.getValue());
			
			
		}
	
	mapList(ogrenci, notlar);
	}
				
//PARAMETRELİ ÇÖZÜMÜNÜ YAPIN
	public static void mapList(String[] ogrenci,int[] notlar) {
		Map<String, Integer> linkedMap = new LinkedHashMap<String, Integer>();
		for(int i = 0 ; i <ogrenci.length;i++) {
			linkedMap.put(ogrenci[i], notlar[i]);
		}
		System.out.println(linkedMap);
	}
	
	public static void mapList (String[] ogrenci,int[][] notlar) {
		Map<String,List<In> = new LinkedHashMap<>();
		
		for(int i = 0; i<ogrenci.length;i++) {
			for(int j = 0; j<notlar.length;j++) {
				
			}
		}
	}
}
