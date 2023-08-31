package com.bilgeadam.week05.lecture03;

public class StaticOrnek {
	
	int number = 0;//nesne değişkeni
	static int number2 = 0;//sınıf değişkeni
	
	public static void main(String[] args) {
	
		StaticOrnek staticOrnek = new StaticOrnek();
		int sayi = staticOrnek.number;
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		staticOrnek = new StaticOrnek();
		System.out.println(staticOrnek.number);
		System.out.println(staticOrnek.number2);
	}
	
	public void numaraVer(){
	number +=1;
	number2 +=1;
	System.out.println(number);
	System.out.println(number2);
	}
	
	}
