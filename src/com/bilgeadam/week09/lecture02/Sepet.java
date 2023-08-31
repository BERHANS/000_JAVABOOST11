package com.bilgeadam.week09.lecture02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bilgeadam.week07.lecture001.enumOrnek.Utility;

public class Sepet {

	/**
	 * 1- urun sınıfına encapsulated şekilde field oluşturalım isim,fiyat
	 * 
	 * 2- sepette e urunlerden oluşan bir array olsun bu array dışında 
	 * Urun listemiz olsun 
	 * urunOlustur isimli method olsun 
	 * EUrun arrayımızdaki enumların değerleri ile ürün oluşturup listemizi dolduralım 
	 * 
	 * 3-urunler ile fiyatlarını mapleyelim urunler listesi üzerinden çalışalım
	 * 
	 * 4- urunEkle() methodumuz olsun bu method sepetime bir ürün ekleyecek ürün hali hazırda sepette var ise adetini arttıracak. 
	 * 
	 * 5- 2 TANE MAP VAR urunler urunlerVeFiyatlari,sepet . sepetimin toplam fiyatını hesaplamak istiyorum bunun için 
	 * sepetimden ürün adını almam ve bu ürün adına denk gelen fiyat değerini ürünler ve fiyatları mapinde aramam gerekiyor 
	 * sonra bu fiyat değerini alıp sepetimdeki ürün adedi sayısıyla çarpıp toplama eklemem gerekiyor 
	 * bunu sepetteki her bir ürün için yaparsam ve toplamı her zaman güncelleyerek ilerlersem sepetimin toplam fiyatını bulabilirim 
	 * List<Double> fiyatlar; 
	 * 
	 */
	
	EUrun [] enumUrunler = EUrun.values();
	
	List<Urun> urunler = new ArrayList<>();
	Map<String,Double> urunlerVeFiyatlari = new HashMap<>();
	Map<String, Integer> sepet = new HashMap<String, Integer>();
	Double toplam = 0D;
	
	public Sepet() {
		urunOlustur2();
		urunFiyatMapOlustur();
	}
	
	public void urunOlustur() {
		for(EUrun eUrun: enumUrunler) {
//			Urun urun = new Urun();
//			urun.setFiyat(eUrun.getFiyat());
//			urun.setIsim(eUrun.name());
//			urunler.add(urun);
			
			urunler.add(new Urun(eUrun.name(),eUrun.getFiyat()));
		}
		urunler.forEach(System.out::println);
	}
	public void urunOlustur2() {
		Arrays.asList(enumUrunler).stream().forEach(x-> urunler.add(new Urun(x.name(), x.getFiyat())));
//		urunler.forEach(System.out::println);
	}
	
	public void urunFiyatMapOlustur() {
//	urunler.stream().forEach((urun)-> urunlerVeFiyatlari.put(urun.getIsim(), urun.getFiyat()));
		
//	urunlerVeFiyatlari.entrySet().forEach(System.out::println);//maplarin içinde iki değer olduğu için entrySet olduğunu belirtmemiz lazım o yüzden kullandık
	
	
	urunlerVeFiyatlari= urunler.stream().collect(Collectors.toMap((k)->k.getIsim(), (v)->v.getFiyat()));//toMap() methodu mapa çevirme methodu 
	//stream kullanmamızın sebebi içindeki methodlarından faydalanmaktır.
//	urunlerVeFiyatlari.forEach((k,v)->System.out.println(k+" " + v));
	}
	
	public void urunEkle() {
		String urunIsmi = Utility.stringDegerAlma("Lütfen sepete eklemek istediğiniz ürünün adını giriniz");
		Optional<Urun> urun = urunler.stream().filter(u->u.getIsim().equals(urunIsmi)).findFirst();
//		boolean isUrunPresent = urunler.contains(urunIsmi);
//		Urun urun = null;
//		for(Urun u: urunler) {
//			if(u.getIsim().equals(urunIsmi)) {
//				urun = u;
//				break;
//			}
//		}
		
		if(urun.isPresent()) {
			if(sepet.containsKey(urunIsmi)) {
			sepet.put(urunIsmi,sepet.get(urunIsmi)+1);
			
		}else {
			sepet.put(urunIsmi, 1);
		}
		}else {
			System.out.println("böyle bir ürün bulunmamaktadır");
		}
	}
	
	
	public void sepetiGoster() {
		sepet.forEach((k,v)-> System.out.println(k+ " Urun " + v + " adet "));
		sepetToplami();
	}
	public void urunleriListele() {
		urunlerVeFiyatlari.forEach((k,v)->System.out.println(k+" " + v));
		
	}
	public void menu () {
		int kontrol = 0;
		
		do {
			System.out.println("----------------------");
			System.out.println("Sepet App");
			System.out.println("----------------------");
			System.out.println("1-Urunleri Goster");
			System.out.println("2-Urun Ekle");
			System.out.println("3-Sepeti Goster");
			System.out.println("0-C I K I S");
			System.out.println();
			System.out.println("-----------------------");
			kontrol = Utility.intDegerAlma("Lütfen secim yapınız");
			
			switch(kontrol) {
			case 1:{
				urunleriListele(); break;
			}
			case 2:{
				urunEkle();break;
			}
			case 3:{
				sepetiGoster();break;
			}
			case 0:{
				System.out.println("Uygulamadan Çıkış Yapılıyor");break;
			}
			default:
					System.out.println("lütfen geçerli Secim Yapınız");break;
			}
			
			
			}while(kontrol !=0);
	}

	public void sepetToplami(){
		List<Double> fiyatlar = new ArrayList<Double>();
		sepet.forEach((isim,adet)->{
			double fiyat = urunlerVeFiyatlari.get(isim)*adet;
			fiyatlar.add(fiyat);
			
		});
		toplam =0d;
	for(Double fiyat : fiyatlar) {
		toplam += fiyat;
	}
	System.out.println("Sepet Toplam Tutarı..: " + toplam);
	}
	
	public void sepetToplami2() {
		List<Double> fiyatlar = new ArrayList<Double>();
		DoubleSummaryStatistics toplam;
		
		for(Entry<String,Integer> urun : sepet.entrySet()) {
			fiyatlar.add(urun.getValue()*urunlerVeFiyatlari.get(urun.getKey()));
		}
		toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
		System.out.println("sepet toplam tutarı : " + toplam.getSum());
	}
	public void sepetToplami3() {
		toplam = 0d;
		sepet.forEach((isim,adet)-> toplam += (urunlerVeFiyatlari.get(isim)*adet));
		System.out.println("toplam sepet tutarı : " + toplam);
	}
	
	public void sepetToplami4() {
		List<Double> fiyatlar = sepet.entrySet().stream().map(urun->
		urunlerVeFiyatlari.get(urun.getKey())*urun.getValue()).collect(Collectors.toList());
		//->> fiyatları teker teker gezip streamda toplar collect yaptığımda liste haline getirip döner
		toplam = sepet.entrySet().stream().mapToDouble(urun->urunlerVeFiyatlari.get(urun.getKey())*urun.getValue()).sum();
		
		Double toplam2 = fiyatlar.stream().reduce((f1, f2)->f1+f2).get();
		System.out.println("Sepetin toplam tutari: " + toplam);
	
	}
}
