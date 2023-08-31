package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UrunManager {

	List<Urun> urunler = new ArrayList<Urun>();
	static Scanner sc = new Scanner (System.in);
	public Urun urunOlustur() {
		System.out.println("urun adı giriniz");
		String urunAdi = sc.nextLine();
		
		System.out.println("urun fiyatı giriniz");
		int fiyat = Integer.parseInt(sc.nextLine());
		
		System.out.println("urun skt giriniz");
		int skt = Integer.parseInt(sc.nextLine());
		
		if(urunAdi.isBlank() || fiyat<=0) {//isBlank görününr bir karakter yok ise boştur döner
			return null;
		}else {
			return new Urun(urunAdi,fiyat,skt);
		}
		
		
	}
	 
	public Optional<Urun> urunOlustur2() {
		System.out.println("urun adı giriniz");
		String urunAdi = sc.nextLine();
		
		System.out.println("urun fiyatı giriniz");
		int fiyat = Integer.parseInt(sc.nextLine());
		
		System.out.println("urun skt giriniz");
		int skt = Integer.parseInt(sc.nextLine());
		
		if(urunAdi.isBlank() || fiyat<=0) {
			return Optional.empty();
		}else {
		return Optional.of(new Urun(urunAdi, fiyat, skt));
			
		}
	}
	
	public void listeyeUrunEkle(Optional <Urun> urun ) {
		if(urun.isPresent()) {
			urunler.add(urun.get());
		}
		
	}
	public void sonKullanmaTarihiGecmisUrunler(List <Urun> urunler) {
		urunler.stream().filter(x->x.getSkt()<2023).forEach(System.out::println);
		
	}
	public void zamYap(List<Urun> urunler) {
		urunler.stream().filter(x->x.getSkt()>2023).map((y)->{
			y.setFiyat(y.getFiyat()*2);
			return y;
		}).forEach(System.out::println);
		
		
	}
}
