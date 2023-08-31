package com.bilgeadam.week03.lecture001;

public class Questions28 {

	public static void main(String[] args) {
/**
 * =Java,React,Spring
 * split kullanmadan virgülden bölüp
 * bir for döngüsünde alt alta yazdır
 */
	
	System.out.println("1.ÇÖZÜMMM");
		String deger="Java,React,Spring";
	int index =0;	
	for(int i=0;i<deger.length();i++) {
		if(deger.charAt(i)==',') {
			System.out.println(deger.substring(index,i));
			index=i+1;
		}
		
		}
	System.out.println(deger.substring(index));
	
		System.out.println("2.ÇÖZÜMMMM");
		
		for(int i=0;i<deger.length();i++) {
			if(deger.charAt(i)==',') {
				System.out.println();
			}else {
				System.out.print(deger.charAt(i));
			}
		}
		
		System.out.println("3.ÇÖZÜMMMM");
		
		deger=deger.replace(',','\n');
		System.out.println(deger);
		
		
	}

}
