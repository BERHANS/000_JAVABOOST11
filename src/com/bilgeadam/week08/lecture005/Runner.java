package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {

	public static void main(String[] args) {
		
		UrunManager urunmng = new UrunManager();
		List<Optional<Urun>> yeniUrunler = new ArrayList<Optional<Urun>>();
//		Urun urun = urunmng.urunOlustur();
//		System.out.println(urun);
//		Optional<Urun> urun2 = urunmng.urunOlustur2();
//		
//		System.out.println(urun2);
		
		for(int i = 0 ;i<3;i++) {
		urunmng.listeyeUrunEkle(urunmng.urunOlustur2());
//		yeniUrunler.add(urunmng.urunOlustur2());
		}
		for(Urun urun : urunmng.urunler) {
			System.out.println(urun);
		}
		System.out.println();
//		for(Optional<Urun> urun : yeniUrunler) {
//			System.out.println(urun);
//		}
		
		//EĞER ÜRÜN VAR İSE ÜRÜNÜN FİYATINI 2 KATINA ÇIKART
		
//		for(Optional<Urun> urun: yeniUrunler) {
//			urun.map(x->{
//				x.setFiyat(x.getFiyat()*2);
//				return x;
//				
//			}).ifPresent(System.out::println);;
//		}
		
		urunmng.sonKullanmaTarihiGecmisUrunler(urunmng.urunler);
		System.out.println();
		urunmng.zamYap(urunmng.urunler);
	}

}
