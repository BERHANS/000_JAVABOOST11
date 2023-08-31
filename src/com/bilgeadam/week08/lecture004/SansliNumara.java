package com.bilgeadam.week08.lecture004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumara {

	/*
	 * 1 ile 100 arasında 10.000 adet sayı
	 * sayi olustur methodu ile restgele olusturduğumuz sayiları bir mapa aticaz 
	 * sayinin kaç kere tekrar ettiğini tutucaz 
	 * key sayi value tekrar sayisi 
	 * 
	 * 
	 * mapta gezinirken listeye ekleme yap
	 * her eleman ne kadar tekrar ediyorsa o kadar kez listeye eklenicek
	 * 
	 * en son oluşturulan listeden rastgele 10 tane değer alınıcak ve alınan bu değerler bir sete eklenicek
	 * bu işlemden önce listemizi karıştıralım (Collection.shuffle() methodunu çalıştır 
	 * 
	 * 
	 */

	Map<Integer,Integer> sayisal = new HashMap<Integer, Integer>();
	List<Integer> sayisal1= new ArrayList<Integer>();
	Set<Integer> sayisal2 = new TreeSet<Integer>();
	public int sayiUret() {
		Random random = new Random();
		return random.nextInt(1,101);
		
	}
	public void mapList() {
		for(int i = 0; i<10_000;i++) { 
			int sayi=sayiUret();
			if(sayisal.containsKey(sayi)) {
					sayisal.put(sayi, sayisal.get(sayi)+1);
					
				}else {
					sayisal.put(sayi, 1);
				}	
			
		}
		
	}
		
	public void listeOlustur() {
	
		for(Entry<Integer,Integer> sayi : sayisal.entrySet()) {
			for(int i = 0; i<sayi.getValue();i++) {
				sayisal1.add(sayi.getKey());
			}
		}
//		sayisal.forEach((k, v) -> {
//			for (int i = 0; i < v; i++) {
//				sayisal1.add(k);
//			
//			
//		}	
//	}
		}
	public void listedenElemanCek() {
		Random rd = new Random();
		Collections.shuffle(sayisal1);
		while(sayisal2.size()<10) {
		int index = rd.nextInt(0, sayisal1.size());
		sayisal2.add(sayisal1.get(index));
		sayisal1.remove(index);
		}
		
		
		
	}

	
	}