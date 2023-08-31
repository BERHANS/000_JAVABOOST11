package com.bilgeadam.week05.lecture05.encapsulation;

public class ArabaTest {

	public static void main(String[] args) {

		Araba araba = new Araba();
		
//		araba.marka = "bmw";
//		araba.model = "x5";
//		araba.km = 0;
//		araba.bijonSayisi=5;
//		araba.camSil = "a";
		araba.setMarka("bmw");
		araba.setModel("x5");
//		araba.setBijonSayisi(5);
		araba.setCamSil("a");
		
		araba.ozellikleriYazdir();
		araba.arabayiSur();
		araba.ozellikleriYazdir();
		
		System.out.println("*********************************");
		
		Araba araba2 = new Araba("bmw","x5",-150,5,"a");
		
		araba.arabayiSur();
		araba.ozellikleriYazdir();
		
		System.out.println("**********************************");
		
		Araba araba3 = new Araba(150,"b");
		araba3.ozellikleriYazdir();
		araba3.arabayiSur();
		
		System.out.println(araba.getMarka());
	
		Araba araba4 = new Araba("camsil");
		araba4.arabayiSur();
		araba4.arabayiSur();
		araba4.ozellikleriYazdir();
	
	}	
	
	
	
}
