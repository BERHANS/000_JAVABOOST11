package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	

	public static void main(String[] args) throws InterruptedException {
		Takim takim = new Takim("EV SAHİBİ");
		Takim takim2 = new Takim("DEPLASMAN");
		List<Takim> takimlar = new ArrayList<Takim>();
//		System.out.println(takim.getKaleci()); 
//		takim.futbolcular.forEach(System.out::println);
		takimlar.add(takim);
		takimlar.add(takim2);
		
		
		
		Mac mac = new Mac(takimlar);
		mac.mac();
		
		
		
		
		
		
		
		
	}
	

}
