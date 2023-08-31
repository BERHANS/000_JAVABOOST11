package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import com.bilgeadam.week07.lecture001.enumOrnek.Utility;

public class PlakaTahmin {

	/*
	 * 
	 * -bu arrayden bir map olusturan metodu yazalim key degerleri plaka degerleri
	 * olsun value sehir olsun. 1,2,3
	 * 
	 * oyun sayisi hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz
	 * 
	 * menumuz olacak
	 * 
	 * Sehir tahmin oyununa hosgeldiniz Her oyun icin 3 tahmin hakkiniz
	 * bulunmaktadir.
	 * 
	 * 1-oyuna basla
	 * 
	 * 1.oyun (kacıncı oyundaysak) 3 tahmin hakkimiz var(herdefasinda azalacak)
	 * 
	 * Random bir plaka uretecegiz (utility sinifinda yapalim) ve kullaniciya soru soracagiz bu plaka hangi ile
	 * aittir? kullanicidan gelen degere gore islem yapacagiz dogruysa bildiniz,
	 * yanlissa tekrar deneyin ciktisini verip basa donecegiz (toplamda 3 tahmin
	 * hakkimiz bulunmaktadir.) basarili tahminde bulundugumuz zaman ve tahmin
	 * hakkimiz kalmadigi zaman ana menuye donsun
	 * 
	 * 
	 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim her oyunun tahminlerini
	 * bir yerde tutacagım sonra burayı cagirdigim zaman her oyunun tahminleri ayri
	 * ayri yazilsin
	 * 
	 * 3- cikis
	 * 
	 * 
	 * 
	 */
	
	String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	Map<Integer,List<String>> eskiTahminler = new TreeMap<Integer, List<String>>();
	Map<Integer,String> plakaList = new LinkedHashMap<>();
	int oyunSayisi=0;
	int hak =3;
	public PlakaTahmin() {
		mapList();
	}
	public void mapList( ) {
		for(int i = 0;i<iller.length;i++) {
			plakaList.put(i+1, iller[i]);
		}
		
	}
	public void menu() {
		int secim = 3;
		do {
			System.out.println("şehir tahmin oyununa hoş geldiniz ");
			System.out.println("her oyun için 3 tahmin hakkınız bulunuyor");
			System.out.println("1- Ouyuna Basla");
			System.out.println("2- Eski Tahminler");
			System.out.println("3- Cıkıs");
			
			secim = Utility.intDegerAlma("lütfen seçim yapınız");
			
			switch(secim) {
			case 1: 
				ilkOyun();
				break;
			case 2: 
				tahminleriYazdir();
			case 3: 
				System.out.println("oyundan çıkış yapılıyor");
				secim = 3;
				break;
			default : System.out.println("geçerli seçim yap"); 
			}
			
		}while(secim!=3);
	}
	
	public void ilkOyun() {
		oyunSayisi++;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int plaka = random.nextInt(1,82);
		System.out.println(plaka+" bu plaka hangi ile aittir");
		
		String cevap = sc.nextLine();
	
		for(int i =0;i<3;i++) {
		if(plakaList.get(plaka).equalsIgnoreCase(cevap)) {
			System.out.println("doğru");
		
		}else {
			System.out.println("tekrar deneyin "+(2-i)+" deneme hakkınız kaldı");
			
		}
		
		}
		
	}
	

	
}
