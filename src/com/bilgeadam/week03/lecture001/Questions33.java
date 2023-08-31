package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Questions33 {

	public static void main(String[] args) {

		/*

		// dizide en büyük ve en küçük öğeyi bulma
		0, 120, 5, 85, -256, 16, 1258, 81, 14 dizi elemanlarım.





		SORU 2

		// dizide en büyük 2.sayıyı bulalım.

		1300, 120, 130, 125, -256, 16, 1258, 81, 14






		SORU 3

		// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
		// sonlansın yoksa false yazdıralım 
		 2, -256, 2, 1258, 2, 2
		 */
		Scanner sc = new Scanner(System.in);
		int[] dizi_array = new int[9] ;
		 dizi_array[0] = 0;
		 dizi_array[1] = 120;
		 dizi_array[2] = 5;
		 dizi_array[3] = 85;
		 dizi_array[4] = -256;
		 dizi_array[5] = 16;
		 dizi_array[6] = 1258;
		 dizi_array[7] = 81;
		 dizi_array[8] = 14;
		 
		
		 boolean kontrol = true;
		 while (kontrol) {
		 System.out.println("1. İŞLEM SAYILARDAN EN BÜYÜĞÜ VE EN KÜÇÜĞÜ BULMAMIZI SAĞLAR        ");
		 System.out.println("******************************************************************");
		 System.out.println("2. İŞLEM DİZİDEKİ EN BÜYÜK 2.SAYIYI BULALIM:    ");
		 System.out.println("********************************************************** *****  ");
		 System.out.println("3. İŞLEM Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 mi ona bakılır");
		 System.out.println("0.ÇIKIŞ");
		 System.out.println("SEÇMEK İSTEDİĞİNİZ İŞLEM NEDİR");
         int secim = sc.nextInt();
      
		int maks = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
         switch(secim) {
         case 1:
        	 for(int i=0; i<dizi_array.length;i++) {
        		 if(dizi_array[i]<min) 
        		 min = dizi_array[i];
        		  
        		 if(dizi_array[i]>maks) 
        		 maks = dizi_array[i];
        	 }
        	 System.out.println("en büyük sayı" + maks + "" + "en küçük sayı" + min);
        	 
         case 2: 
        	 int[] dizi_array2 = { 120,1300, 130, 125, -256, 16, 1258, 81, 14} ;
        	
    		 
    		 int maks1 = Integer.MIN_VALUE;
    		int maks2 =0;
    		 for(int i=0; i<dizi_array2.length;i++) {
        	if(dizi_array2[i]>maks1) { 
        		 maks1 = dizi_array2[i];
        		 }
	}
        	for(int i=0; i<dizi_array2.length;i++) {
            		 if(dizi_array2[i]<maks1 && dizi_array2[i]>maks2) { 
            		 maks2 = dizi_array2[i];
            		 }
        	}
                System.out.println("2. en büyük sayı" + maks2);break;
         case 3:
        	 boolean kontrol2 = true;
        	 int[] dizi_array3 = {2, -256, 2, 1258, 2, 3};
        	 while (kontrol2) {
        		 for (int i = 0; i<dizi_array3.length-1;i++)
        			if (dizi_array3[i] == dizi_array3[i+1]) {
        				System.out.println("döngü sonlandı");
        				kontrol2=false;
        			} else 
        				System.out.println("true");
        		            kontrol2=false;
        	 }
    	
                
               
    			
			
			
        	 
           
    		 
    		
        	 
        	 
         }//SWİTCH
         
         
         
		 }//WHİLE
		
		
		
	}

}
