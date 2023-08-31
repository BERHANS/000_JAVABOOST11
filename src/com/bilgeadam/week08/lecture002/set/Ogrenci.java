package com.bilgeadam.week08.lecture002.set;

public class Ogrenci implements Comparable<Ogrenci> {

	int id ;
	String ad ;

	
	
	
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + "]";
	}




	public Ogrenci(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}




	@Override
	public int compareTo(Ogrenci o) {
		if(o.id<this.id) {
			return 1;
		}else if(o.id == this.id) {
			return 0;
		}else {
			return -1;
		}
	
	}
	
	
}
