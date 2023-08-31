package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class ParaSayma {

	
	Stack<Integer> yuksekPara = new Stack<Integer>();
	Stack<Integer> dusukPara = new Stack<Integer>();
	public static void main(String[] args) {
		
		/*
		 * bir stack oluşturalım bu stacke 5 6 tane değer girelim
		 * 100 tl den yüksek olanları toplam değerine ekle 
		 * küçük olanları ise başka bir stağe ekle 
		 * en sonunda toplamı ve yeni oluşturduğumuz stacki yazdıralım
		 */
		ParaSayma calistir = new ParaSayma();
		calistir.paraSayma();
		
	}
	public void paraEkle() {
		yuksekPara.push(152);
		yuksekPara.push(52);
		yuksekPara.push(58);
		yuksekPara.push(800);
		yuksekPara.push(4);
		yuksekPara.push(3);
		
	}
	
	public void paraSayma() {
		paraEkle();
		int toplam = 0;
		while(!yuksekPara.isEmpty()) {
			if(yuksekPara.peek()>100) {
				toplam += yuksekPara.pop();
			}else {
				dusukPara.push(yuksekPara.pop());
			}
		}
		System.out.println("toplam = " + toplam +" "+ dusukPara);
	}

}
