package com.bilgeadam.week04.lecture002;

public class Questions47 {

	public static void main(String[] args) {

		/** Dışarıdan 10 sayısı girilecek. imetotlara parametre olarak 10 sayısını vererek;

		 

		1- 10+50

		2- (10+50) *30

		3- ((10+50)*30)-40

		4- (((10+50)*30)-40)/20 işlemlerini yaptıracağız.

		 

		Bunu tek bir satırda metotların içerisine metotlar geçirerek yapacağız.

		 

		**/
		
		System.out.println(besinciIslem());
		
		
		
		
	}
	public static int ilkIslem(int sayi) {
		return 50+sayi;
	}
	public static int ikinciIslem() {
		
		return ilkIslem(10)*30;
	}
	public static int ucuncuIslem() {
		return ikinciIslem()-40;
	}
	public static int dorduncuIslem() {
		return ucuncuIslem()/20;
	}
	public static int besinciIslem() {
		return dorduncuIslem()*30;
	}
}
