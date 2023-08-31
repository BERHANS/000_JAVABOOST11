package com.bilgeadam.week02.lecture002;

public class Questions2Java {
	/*
	 * Bir ürünün fiyatı %18 kdv var ve %15 kar olduğunu biliyoruz bir ürün fiyatım
	 * olsun bu ürün fiyatımdan ham fiyatını bulucaz.
	 * 
	 */

	public static void main(String[] args) {

		float rawPrice = 0, price = 100, priceWithoutVat;
		priceWithoutVat = price / 1.18f;
		System.out.println("kdvsiz fiyat:" + priceWithoutVat);
		rawPrice = priceWithoutVat / 1.15f;
		System.out.println("hamfiyat:" + rawPrice);

	}

}
