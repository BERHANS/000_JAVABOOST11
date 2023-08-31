package com.bilgeadam.week07.lecture001.enumOrnek;

import java.util.Scanner;

public class PizzaSiparis {

	/*
	 * boyut sec methodu 
	 * hamur tipi sec methodu 
	 * tur sec methodu 
	 */
	public void menu() {
		System.out.println("pizza siparis menüsü");
		Pizza pizza = pizzaSec();
	siparisHazirla(pizza);
	}
	private void siparisHazirla(Pizza pizza) {
		System.out.println(pizza.toString());
		System.out.println("sipariş hazırlanıyor");
	}
	public Pizza pizzaSec() {
		EBoyut boyut = boyutSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		ETur tur = turSec();
		Pizza pizza = new Pizza(boyut, hamurTipi, tur, 555.55);
	return pizza;
	}
	public EBoyut boyutSec() {
	int i = 1;
		for(EBoyut boyut : EBoyut.values()) {
		System.out.println(i+"."+boyut);
	i++;
		}
		int secim = Utility.intDegerAlma("Lutfen pizza boyutu seçiniz");
		
		switch (secim) {
		case 1 : System.out.println("KÜÇÜK");
			return EBoyut.KUCUK; 
		case 2: System.out.println("ORTA");
			return EBoyut.ORTA;
		case 3: System.out.println("BÜYÜK");
			return EBoyut.BUYUK;
		default: System.out.println("yanlış seçim yaptınız");
		return null;
		}
	}
	public EHamurTipi hamurTipiSec() {
		int i = 1;
		for(EHamurTipi hamurTipi : EHamurTipi.values()) {
		System.out.println(i+"."+hamurTipi);
	i++;
		}
		int secim = Utility.intDegerAlma("Lutfen pizza boyutu seçiniz");
		
		switch (secim) {
		case 1 : System.out.println("İNCE");
			return EHamurTipi.INCE; 
		case 2: System.out.println("NORMAL");
			return EHamurTipi.NORMAL;
		case 3: System.out.println("KALIN");
			return EHamurTipi.KALIN;
		default: System.out.println("yanlış seçim yaptınız");
		return null;
		}
	}
		public ETur turSec() {
			//ETur.ordinal enumlarda pozisyonu döner
			for(ETur tur)
		}
	
		
	
	
	
}
