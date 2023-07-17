package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre

		 

	    // burc hesabı yapan program

	 

	    // Koç Burcu : 21 Mart - 20 Nisan

	 

	    // Boğa Burcu : 21 Nisan - 21 Mayıs

	 

	    // İkizler Burcu : 22 Mayıs - 22 Haziran

	 

	    // Yengeç Burcu : 23 Haziran - 22 Temmuz

	 

	    // Aslan Burcu : 23 Temmuz - 22 Ağustos

	 

	    // Başak Burcu : 23 Ağustos - 22 Eylül

	 

	    // Terazi Burcu : 23 Eylül - 22 Ekim

	 

	    // Akrep Burcu : 23 Ekim - 21 Kasım

	 

	    // Yay Burcu : 22 Kasım - 21 Aralık

	 

	    // Oğlak Burcu : 22 Aralık - 21 Ocak

	 

	    // Kova Burcu : 22 Ocak - 19 Şubat

	 

	    // Balık Burcu : 20 Şubat - 20 Mart
	
	
		Scanner sc= new Scanner(System.in);
		System.out.print("AY GİR:   ");
		int ay= sc.nextInt();
		System.out.print("Gün GİR:    ");
		int gun= sc.nextInt();
		
		switch (ay){
		case 1: 
			if(gun>=1 && gun<=21) {
				System.out.print("Burcunuz Oğlak");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz Kova");
			}
			break;
		case 2: 
			if(gun>=1 && gun<=19) {
				System.out.print("Burcunuz KOVA");
			}else if(gun>29 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz BALIK");
			}
			break;
		case 3: 
			if(gun>=1 && gun<=20) {
				System.out.print("Burcunuz BALIK");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz KOÇ");
			}
			break;
		case 4: 
			if(gun>=1 && gun<=20) {
				System.out.print("Burcunuz KOÇ");
			}else if(gun>30 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz BOĞA");
			}
			break;
		case 5: 
			if(gun>=1 && gun<=21) {
				System.out.print("Burcunuz BOĞA");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz İKİZLER");
			}
			break;
		case 6: 
			if(gun>=1 && gun<=22) {
				System.out.print("Burcunuz BALIK");
			}else if(gun>30 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz YENGEÇ");
			}
			break;
		case 7: 
			if(gun>=1 && gun<=22) {
				System.out.print("Burcunuz YENGEÇ");
			}else if(gun>30 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz ASLAN");
			}
			break;
		case 8: 
			if(gun>=1 && gun<=22) {
				System.out.print("Burcunuz ASLAN");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz BAŞAK");
			}
			break;
		case 9: 
			if(gun>=1 && gun<=22) {
				System.out.print("Burcunuz BAŞAK");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz TERAZİ");
			}
			break;
		case 10: 
			if(gun>=1 && gun<=21) {
				System.out.print("Burcunuz TERAZİ");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz AKREP");
			}
			break;
		case 11: 
			if(gun>=1 && gun<=21) {
				System.out.print("Burcunuz AKREP");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz YAY");
			}
			break;
		case 12: 
			if(gun>=1 && gun<=21) {
				System.out.print("Burcunuz YAY");
			}else if(gun>31 || gun<1) {
				System.err.print("Ocak ayı31 gündür");
			}else {
				System.out.print("Burcunuz OĞLAK");
			}
			break;
	
		
		
		
		
		
		}
		
		
		
		
		
	
	
	
	}

}
