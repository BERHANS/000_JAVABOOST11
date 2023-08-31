package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Questions27_Ödev {

	public static void main(String[] args) {
//Dışarıdan bir değer alacağız, bu aldığımız değerin içerisinde kaç tane "a" harfi olduğunu bize döndürecek bir program.
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("BİRŞEY YAZ");
		String kelime=sc.nextLine();
		int i;
		int j=0;
		for( i= 0; i !=kelime.length() ; i++) {
			int a=kelime.indexOf("a");
			if(a<0)break;                                           
			String asayisi=kelime.substring(0,a+1);
			j++;
		
			kelime = kelime.substring(a+1);
			
		}
			System.out.println(j);
			
			
       
		
	}

}
