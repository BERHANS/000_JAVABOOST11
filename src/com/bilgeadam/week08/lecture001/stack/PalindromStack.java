package com.bilgeadam.week08.lecture001.stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {
	
	Stack<Character> palindromList = new Stack<>();
	public static void main(String[] args) {

		// dışarıdan bir metin girilecek sonra bu metni bir stacke atayacağız 
		//sdaha sonra bu kelimenin palindrom olup olmadığını kontrol eden bir method yazacağız .
		
		PalindromStack palindromStack = new PalindromStack();
		Scanner sc = new Scanner (System.in);
		System.out.println("kelime giriniz: ");
		String kelime = sc.nextLine();
		
		if(palindromStack.isPalindrome(kelime)) {
			System.out.println("kelime bir palindrom");
		}else {
			System.out.println("kelime palindrom değil");
		}
		
		
		
	}

	public void stackOlusturma(String kelime) {
		for(int i = 0; i<kelime.length();i++) {
			palindromList.push(kelime.charAt(i));
		}
	
		
	}
	
	public boolean isPalindrome(String kelime) {
		stackOlusturma(kelime);
		
		for(int i = 0; i<kelime.length()/2;i++) {
			if(palindromList.pop() != kelime.charAt(i)) {
				return false;
		}
		}
	return true;
	}	
}
