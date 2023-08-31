package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {

	/*
	 * dışarıdan string bir değer alınıcak bu değerdeki her bir harfi kontrol edicez 
	 * tekrar edenleri bir sete tekrar etmeyenleri ise başka bir sete alıcaz 
	 * bu iki seti de yazdırıcaz 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen bir kelime giriniz");
		String kelime = sc.nextLine();
		
		Set<Character> tekrarlı = new HashSet<>();
		Set<Character> tekrarsız = new HashSet<>();
		
		for(int i = 0;i<kelime.length();i++) {
			char c = kelime.charAt(i);
			if(!tekrarlı.contains(c)&&!tekrarsız.add(c)) {
				tekrarsız.remove(c);
				tekrarlı.add(c);
			}
		}

		System.out.println("tekrar edenler");
		tekrarlı.forEach(System.out::println);
		
		System.out.println("tekrarsız");
	tekrarsız.forEach(System.out::println);
	}
}