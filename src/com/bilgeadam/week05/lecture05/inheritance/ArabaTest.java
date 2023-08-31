package com.bilgeadam.week05.lecture05.inheritance;

public class ArabaTest {
public static void main(String[] args) {

	
	MotorluTasit tasit = new MotorluTasit();
	
	tasit.setRenk("mavi");
	tasit.setKm(0);
	tasit.setMarka("bmw");
	
//	System.out.println(tasit.getMarka()+ tasit.getRenk()+ tasit.getKm());
	System.out.println(tasit.toString());//bu yöntem üsttekinden daha iyi
	MotorluTasit tasit2 = new MotorluTasit();
	
	tasit2.setRenk("siyah");
	tasit2.setKm(150);
	tasit2.setMarka("audi");

//	System.out.println(tasit2.getMarka()+ tasit2.getRenk()+ tasit2.getKm());
	System.out.println(tasit2.toString());
	System.out.println();
	
	Araba araba = new Araba();
	araba.setRenk("mavi");
	araba.setKm(0);
	araba.setMarka("mercedes");
	araba.setKapıSayisi(5);
	System.out.println(araba.toString());
	
	
	Araba araba2 = new Araba("audi", "siyah",150,5);
	System.out.println(araba2.toString());
	
			araba2.calistir();
	
			Araba araba3 = new Araba();
	
}
}
