package com.bilgeadam.week07.lecture003.footballappHocaCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlar;
	int[] macSkoru;
	 long sure = 90000; //90.000 milisaniye sürse, bu 90 saniye yapar 
	
	
	public Mac() {
		this.takimlar = new ArrayList<Takim>();
		this.macSkoru = new int[2];
		this.takimlar.add(new Takim("ev sahibi"));
		this.takimlar.add(new Takim("deplasman"));
		this.sure = 90000;
	
	}
	public Mac(List<Takim> takimlar) {
		this.takimlar = takimlar;
		this.macSkoru = new int[2];
		this.sure = setSure(90000);
	}
	
	public void mac() throws InterruptedException {
		System.out.println("Yazı Tura Atılıyor ve maça başlanıyor \n");
	Thread.sleep(1000);
	Takim takim = yaziTura();
	System.out.println("maça " + takim.getAd()+ " başlıyor\n");
	while (sure> System.currentTimeMillis()) {
		AktifFutbolcu futbolcu =oyna(takim);
		takim = golVurusu(futbolcu);
		System.out.println((sure-System.currentTimeMillis())/1000 + " saniye kaldı..\n");
		
	}
	System.out.println("*********************************");
	System.out.println("MAÇ SONA ERDİ\n");
	skorGoster();
	}
	public AktifFutbolcu oyna(Takim takim) throws InterruptedException {
		int pasiVerecekOyuncu = pasKontrol(12);
		
		for(int i = 0; i<3 ;i++) {
			
			List<AktifFutbolcu> futbolcular = takim.getFutbolcu();
			
			if(futbolcular.get(pasiVerecekOyuncu).pasVer()) {
				int pasAlacakOyuncuIndex = pasKontrol(pasiVerecekOyuncu);
			System.out.println(takim.getAd()+" adli takimdan  "+ futbolcular.get(pasiVerecekOyuncu).getFormaNo()+" no lu oyuncu "+
			futbolcular.get(pasAlacakOyuncuIndex).getFormaNo()+" nolu oyuncuya pas atıyor \n");
			pasiVerecekOyuncu = pasAlacakOyuncuIndex;
			Thread.sleep(1500);
			
			}else {
				System.out.println(takim.getAd() + " adli takımdan " + futbolcular.get(pasiVerecekOyuncu).getFormaNo()+
						" nolu oyuncunun pasi başarısız oldu\n");
			takim = takimDegistir(takim);
				System.out.println("top diğer takıma geçti");
				System.out.println();
				pasiVerecekOyuncu = pasKontrol(12);
				i = -1;
				Thread.sleep(1500);
			}
			
			}
//		golVurusu(takim.getFutbolcu().get(pasiVerecekOyuncu), takim);
		return takim.getFutbolcu().get(pasiVerecekOyuncu);
	}
	
	public Takim takimDegistir(AktifFutbolcu aktifFutbolcu) {
		if(takimlar.get(0).equals(aktifFutbolcu)) {
			return takimlar.get(1);
		}else {
			return takimlar.get(0);
		}
	}
	
	
	public int pasKontrol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);
		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}
		return oyuncuIndex;
	}

	public Takim golVurusu(AktifFutbolcu aktifFutbolcu) throws InterruptedException {
		Kaleci kaleci = takimDegistir(aktifFutbolcu);
		Takim takim = futbolcuTakiminiBul(aktifFutbolcu);
		System.out.println("ŞUUUUUUTTTTT");
		System.out.println("kaleci topa uzanıyor\n");
		Thread.sleep(1500);
		if(aktifFutbolcu.sutCek(kaleci.kurtarisSkoru())) {
			System.out.println("GOOOLLLLL\n");
			int takimIndex = takimlar.indexOf(takim);
			macSkoru[takimIndex] += 1;
			
			System.out.println(takim.getAd()+" adlı takımdan " + aktifFutbolcu.getFormaNo()+ " forma numaralı futbolcu "+
			" golü atıyor\n");
			skorGoster();
		
		}else {
			System.out.println(takim.getAd()+" adlı takımdan " + aktifFutbolcu.getFormaNo()+ " forma numaralı futbolcu "+
					" golü kaçırdı\n");
			
		}
		return takimlar.get(1);
	}
	
	public Takim futbolcuTakiminiBul(AktifFutbolcu futbolcu) {
		for(int i = 0;i<takimlar.get(0).getFutbolcu().size();i++) {
			if(futbolcu.equals(takimlar.get(0).getFutbolcu().get(i))) {
				return takimlar.get(0);
			}
		}
		return takimlar.get(1);
	}
	public void skorGoster() {
		System.out.println("** MAC SKORU**");
		System.out.println("=================\n");
		System.out.println(takimlar.get(0).getAd()+" : " + macSkoru[0] + " - " + macSkoru[1] +" : " + takimlar.get(1).getAd()+"\n");
		
		
	}
	public Takim yaziTura() {
		Random random = new Random();
		int index = random.nextInt(2);
		return takimlar.get(index);
	}
	public List<Takim> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(List<Takim> takimlar) {
		this.takimlar = takimlar;
	}

	public int[] getMacSkoru() {
		return macSkoru;
	}

	public void setMacSkoru(int[] macSkoru) {
		this.macSkoru = macSkoru;
	}

	public long getSURE() {
		return sure;
	}

	public long setSure(long sure) {
		return this.sure = sure + System.currentTimeMillis();
	}

}
