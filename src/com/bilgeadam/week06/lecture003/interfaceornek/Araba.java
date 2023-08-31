package com.bilgeadam.week06.lecture003.interfaceornek;

public class Araba extends Tasit {

	@Override
	public void ilerle() {
		System.out.println("araba ilerliyor");
		super.ilerle();
	}

	@Override
	public void dur() {
		System.out.println("araba durdu");
		super.dur();
	}

	
	
}
