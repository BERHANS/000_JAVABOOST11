package com.bilgeadam.week07.lecture001.enumOrnek;

public class Runner {

	public static void main(String[] args) {
				
//		Pizza pizza = new Pizza();
//		pizza.setBoyut(EBoyut.ORTA);
//		pizza.setHamur(EHamurTipi.NORMAL);
//		pizza.setTur(ETur.KARISIK);
//		pizza.setFiyat(75.8);
//		System.out.println(pizza.toString()); 
//		
//		String isim = Utility.stringDegerAlma("sayı gir");
//		int sayi = Utility.intDegerAlma("yaşın kaç");
//		System.out.println(sayi);
//		
//		
//		ETur.values(); // enum'un degerlerinin hepsine erisir.
//
//		Pizza pizza2 = new Pizza();

		int secim = 2;
		for (ETur tur : ETur.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);

		}

		switch (secim) {
		case 1:
		case 2:
		case 3:
		}
		System.out.println(EBoyut.values()); 

		
	}
	
}
