package com.bilgeadam.week08.lecture001.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesiKuyrugu {

	Queue<String> kuyruk = new LinkedList<String>();
	public static void main(String[] args) {
		
		/*
		 * 
		 * String bir kuyruk tanimlayalim.
		 * 
		 * bu kuyruga 10-12 tane isim ekleyelim.
		 * 
		 * random 1-10 arasi pide uretelim.
		 * 
		 * kuyruga gore pideleri dagitmaya baslayalim.
		 * 
		 * pidelerini alanlari, pideler bittigi zaman pide alamayip kuyrukta kalanlari
		 * yazdiralim.
		 * 
		 */
	
		RamazanPidesiKuyrugu pideler = new RamazanPidesiKuyrugu();
		pideler.pideDagit();
		
	
	}
	public void isimEkle() {
		kuyruk.add("nalan");
		kuyruk.add("esra");
		kuyruk.add("beyza");
		kuyruk.add("selen");
		kuyruk.add("hazal");
		kuyruk.add("ekin");
		kuyruk.add("başak");
		kuyruk.add("ece");
		kuyruk.add("sude");
		kuyruk.add("nazlı");
		kuyruk.add("melis");
		kuyruk.add("ayşe");
		
	}
	
	public int pideUret() {
		Random pide = new Random();
		return pide.nextInt(1,11);
		
	}
	
	public void pideDagit() {
		isimEkle();
		for(int i = 0;i<pideUret();i++) {
			System.out.println("pide alanlar " +kuyruk.poll() ); 
		}
		System.out.println(kuyruk);
	}
	
	
}
