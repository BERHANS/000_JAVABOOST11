package com.bilgeadam.week07.lecture002.arraylistOrnek;

import java.util.ArrayList;
import java.util.List;

public class ArrayOrnek {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ankara");
		list.add("Antalya");
		list.add("Bolu");
		list.add("Artvin");
		list.add("Ankara");
		list.add("Antalya");
		list.add("Erzurum");
		list.add("Karaman");
		list.add("Ankara");
		
		for(int i =0 ; i<list.size();i++) {
			if(list.get(i).startsWith("An")) {
				list.remove(i);
			}
		}
	for(String list)
	}
	/*
	 * String bir arraylist
	 * 
	 * Ankara
	 * Antalya
	 * Bolu
	 * Artvin
	 * Ankara
	 * Antalya
	 * Erzuru
	 * Karaman
	 * Ankara
	 * 
	 * "an" ile baslayan sehirleri listeden cikaralim.
	 * 
	 * 
	 */
	
	
}
