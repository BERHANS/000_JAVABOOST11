package com.bilgeadam.week08.lecture002.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bilgeadam.week08.lecture002.set.Ogrenci;

public class MapOrnek {

	public static void main(String[] args) {
		//String, Integer pair 
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<Integer,String> map2 = new HashMap<>();
		Map<Integer,Integer> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
 		Map<Integer,Boolean> map5 = new HashMap<>();
 		Map<Boolean, List<String>> map6 = new HashMap<>();
 		Map<String,Map<Integer,List<Integer>>> map7 = new HashMap<>();
 		Map<Integer, Ogrenci> ogrenciMap = new HashMap<>();
 		
 		ogrenciMap.put(1, new Ogrenci(50, "ugur"));
 		ogrenciMap.put(2, new Ogrenci(25, "alperen"));
 		ogrenciMap.put(15, new Ogrenci(15, "zeynep"));
 		ogrenciMap.put(4, new Ogrenci(70, "sedat"));
 		
		System.out.println(ogrenciMap.get(2));
		System.out.println(ogrenciMap.containsKey(15));
		System.out.println(ogrenciMap.containsValue(new Ogrenci(50, "ugur")));
		
		

	}

}
