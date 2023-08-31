package com.bilgeadam.week05.Marathon1;

public class OgrenciOzelListe {
	
	String[] ogrenciListesi;
	int kapasite =0;
	public void add (String ad) {
		
		String[] liste1;
		if(ogrenciListesi == null) {
		ogrenciListesi = new String[1];
		ogrenciListesi[0] = ad;
		}else {
		liste1  = new String[kapasite+1];
		
		for(int i = 0; i<kapasite ; i++)
			liste1[i] = ogrenciListesi[i];
			liste1[kapasite] = ad;
			ogrenciListesi = liste1;
		}
	 
		kapasite++;
	} 

}
