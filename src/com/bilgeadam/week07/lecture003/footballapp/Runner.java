package com.bilgeadam.week07.lecture003.footballapp;

public class Runner {

	public static void main(String[] args) {

		Takim takim = new Takim("takım1");
		
		takim.getFutbolcu().forEach(System.out::println);
	}

}
