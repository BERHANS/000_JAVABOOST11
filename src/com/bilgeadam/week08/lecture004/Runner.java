package com.bilgeadam.week08.lecture004;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		
		SansliNumara numara = new SansliNumara();
		
		numara.sayiUret();
		numara.mapList();
//		numara.sayisal.forEach((k,v)->System.out.println(k+" tekrar:" + v));
		numara.listeOlustur();
		numara.listedenElemanCek();
		numara.sayisal2.forEach(System.out::println);
		
		System.out.println("50 den büyük olan şanslı numaralar");
		
		numara.sayisal2.stream().filter((number)->number>50).forEach(System.out::println);;
		List<Integer> newList = numara.sayisal2.stream().filter((number)->number>50).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
		System.out.println("sanslı sayiların toplamı: ");//stream ile 
		
		System.out.println(numara.sayisal2.stream().reduce((x,y)-> x+y)); 
		
//		Optional<Integer> toplam =numara.sayisal2.stream().reduce((x,y)-> x+y) ;
//		
//		System.out.println(toplam);
//		
		Optional<Integer> toplam2 = numara.sayisal2.stream().filter((number)->number>50).reduce((x,y)-> x+y);
//		Integer toplam3 = numara.sayisal2.stream().filter((number)->number>50).reduce((x,y)-> x+y).get();
//		System.out.println(toplam2.get());//toplam2.get dersek optionaldan kurtuluruz çünkü get methodu değeri alır. 
//		
//		numara.sayisal2.stream().filter((number)->number>50).reduce((x,y)-> x+y).ifPresent(System.out::println);;
		
		//Optional methodları
		
		Integer toplam = toplam2.get();
		Optional<String> kelime = Optional.empty();
		//String kelime2 = kelime.get();//NoSuchElementException hatası verir 
		Optional<String> kelime3 = kelime;
		System.out.println(kelime3);
		System.out.println(toplam2);
		
		Optional<String> kelime4 = Optional.ofNullable(null);//içinde değer varsa değeri dön yoksa hata verme devam ettir 
		System.out.println(kelime4);
		Optional<String> kelime5= Optional.of("selam dünya");
		System.out.println(kelime5.get());
		
		System.out.println(kelime4.isEmpty()); //isEmpty  içi boş mu boşsa true  
		System.out.println(kelime4.isPresent());//isPresent içi dolu mu doluysa true döner 
		
 	}

}
