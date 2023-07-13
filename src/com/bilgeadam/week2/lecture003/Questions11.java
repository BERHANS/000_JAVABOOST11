package com.bilgeadam.week2.lecture003;

public class Questions11 {

	public static void main(String[] args) {
/** 
 * 1 den başlayarak gelen gelen bütün sayıları toplam toplam 50 yi geçtiği zaman programı durdur
 * sonucunda toplamı yazdır ve döngünün kaç defa döndüğünü yazdır
 */
	int sayaç=0;
	int toplam=0;
	int i=1 ;
	while( toplam <= 50) {
		toplam +=i;
		i++;       //sayaç = i;
		sayaç++;   // i++;
	}
	System.out.println("TOPLAM:    " + toplam + "\nDöngü sayısı:   " + sayaç);
	
	
	
	}

}
