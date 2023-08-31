package com.bilgeadam.week04;

import java.util.Scanner;

public class Uygulama {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		
	}
	public static void uygulama(){
		menu();
	}
	public static void menu() {
		boolean status = true;
		do {
			System.out.println("*******************************");
			System.out.println("********HESAP MAKİNESİ*********");
			System.out.println("*******************************");

			System.out.println("1-Toplama");
			System.out.println("2-Çıkarma");
			System.out.println("3-Bölme");
			System.out.println("4-Çarpma");
			System.out.println("5-EBOB-EKOK");
			System.out.println("0-Ç I K I Ş ");
//			int secim=secimYap();

			switch (secimYap()) {

			case 1:

//				
				System.out.println(toplam());
				break;
			case 2:

//				
				System.out.println(cikarma());
				break;

			case 3:
				System.out.println(bolme());
				break;

			case 4:
				System.out.println(carpma());
				break;
			case 0:
				System.err.println("Program Kapatıldı");
				status = false;
				break;
			default:
				System.err.println("Geçersiz İşlem 0 - 5 Arası Sayı Giriniz");
			}

		} while (status);

	}

	public static int secimYap() {

		System.out.print("Seciminiz: ");
		int secim = sc.nextInt();
		sc.nextLine();
		return secim;

	}

	public static String sayiAl() {

		System.out.print("Lütfen Sayıyı Giriniz..: ");
		String number = sc.nextLine();
		
		return number;

	}

	public static int toplam() {
		int toplam= 0;
		String number = "";
		while(!number.equals("=")) {
			System.out.println("lütfen sayı giriniz:  ");
			number = sc.nextLine();
			if(number.equals("=")) {
				return toplam;
			}else {
				toplam += Integer.parseInt(number);
			}
		
		}
		return toplam;
	
	}

	public static int cikarma() {
		int cikarma = 0;
		String number = "";
		int sayaç = 0;
		while(!number.equals("=")) {
			
			System.out.println("lütfen sayı giriniz:  ");
			number = sc.nextLine();
			if(sayaç == 0 && !number.equals("=")) {
			cikarma = Integer.parseInt(number);
			sayaç++;
			}
				else if(number.equals("=")){
				break;
				}else {
					cikarma -= Integer.parseInt(number);
				}
				}
				return cikarma;
		
		}
	
	
		public static double  bolme() {
		double bolme = 0;
		String number = "";
		int count = 0;
		while(!number.equals("=")) {
			System.out.println("lütfen sayı giriniz:  ");
			number = sc.nextLine();
			if(!number.equals("=")&& count ==0) {
			bolme = Double.parseDouble(number);
			count++;
			}else if(number.equals("=")) {
				return bolme;
			}else {
				bolme /= Double.parseDouble(number);
				
			}
	
		}
	return bolme;
	}
		public static int carpma() {
	int carpma= 1;
	String number = "";
	while(!number.equals("=")) {
		System.out.println("lütfen sayı giriniz:  ");
		number = sc.nextLine();
		if(number.equals("=")) {
			return carpma;
		}else {
			carpma *= Integer.parseInt(number);
		}
	
	}
	return carpma;
		}

	public static int ebobEkok() {
		
		
	}
	
	
}
