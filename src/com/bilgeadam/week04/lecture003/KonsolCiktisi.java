package com.bilgeadam.week04.lecture003;

import java.util.Scanner;

public class KonsolCiktisi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen tek bir sayı giriniz :  ");
		int sayi = sc.nextInt();
		System.out.print("Lütfen sütun sayısını giriniz :  ");
		int sutun = sc.nextInt();
		System.out.print("Lütfen satır sayısını giriniz :  ");
		int satir = sc.nextInt();
		printArray(sayi, sutun, satir);

	
	}
	
	public static void printArray(int max, int satir, int sutun) {
		int min = 1;
		int orta = (max+min)/2;
		int[][] array = new int[satir][sutun];
		
		for(int i = 0; i<array.length;i++) {
			
			for(int j = 0; j<array[i].length ;j++) {
				if(i == j) {
					array[i][j] = orta;
				}else if(i<j){
					array[i][j] = max;
				}else {
					array[i][j] = min;
				}
				System.out.print(array[i][j]);
			}
		System.out.println();
		}
	}
	
}
