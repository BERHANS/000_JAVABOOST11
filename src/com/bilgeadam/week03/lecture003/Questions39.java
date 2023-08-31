package com.bilgeadam.week03.lecture003;

public class Questions39 {

	public static void main(String[] args) {

		// String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek
				// çıktıyı almaya çalışalım;
				// Adananın plaka kodu = 01
                 
				String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
						+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		String sehirlers[] = sehirler.split(";");
		for ( int i =0 ; i<sehirlers.length ; i++) {
			int index = sehirlers[i].indexOf('-');
			System.out.println(sehirlers[i].substring(index+1));
		}
				
	
	}

}
