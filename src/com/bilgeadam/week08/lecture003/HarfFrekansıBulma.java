package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.bilgeadam.week07.lecture001.enumOrnek.Utility;

public class HarfFrekansıBulma {

	public static void main(String[] args) {
		/*
		 * Utility sınıfını kullanarak dışardan bir string alalım bu kelimeyi
		 * map içersinde işleyeceğiz.(sıralı bir şekilde) 
		 * string kelime = "merhaba"
		 * m=1
		 * e=1
		 * r=1
		 * h=1
		 * a=2
		 * b=1
		 * çıktı bu şekilde olucak 
		 */
		String kelime = Utility.stringDegerAlma("Lutfen bir deger giriniz");
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : kelime.toCharArray()) {
			if(map.containsKey(c)) {
				map.replace(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		for(Entry<Character,Integer> karakter: map.entrySet()) {
		
			System.out.println(karakter.getKey()+" = " + karakter.getValue());
		}
	
	
	}

	
	
}
