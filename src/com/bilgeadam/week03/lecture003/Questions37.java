package com.bilgeadam.week03.lecture003;

public class Questions37 {

	public static void main(String[] args) {
		/*
		 * 
		 * int [] sayilar={1,4,5,6,1,1,4,8};
		 * 
		 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
		 * adetinden büyükse true değilse false
		 * 
		 */
		int[] sayilar={1,4,5,6,1,1,4,8};
		int j =0;
		int k=0;
		for(int i = 0; i<sayilar.length ; i++) {
			if(sayilar[i]==1) {
				j++;
			}
			
		if(sayilar[i]==4) {
			k++;
		}
		
	}
	
			System.out.println("4 sayısı\t" +k+ "\tkere geçmiş\t" + "\n1 sayısı\t" +j+ "\tkere geçmiş " + (j>k));
	
		
		
	}

}
