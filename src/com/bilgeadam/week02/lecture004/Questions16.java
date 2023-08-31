package com.bilgeadam.week02.lecture004;

public class Questions16 {

	public static void main(String[] args) {
//1 den 100e kadar olan çift sayıların toplamının tek sayılara olan toplamını bulalım
	
	
	
	int i=1;
	double çift_toplam=0;
	double tek_toplam=0;
	for (i=1;i<=100;i++) {
		if(i%2==0) {
			çift_toplam+=i;
		}else {
			tek_toplam+=i;
		}
	}
	double ortalama=çift_toplam/tek_toplam;
	System.out.println(çift_toplam+ " " + tek_toplam + " " + ortalama);
	
	
	
	
	}

}
