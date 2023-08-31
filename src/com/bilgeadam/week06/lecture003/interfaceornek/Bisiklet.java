package com.bilgeadam.week06.lecture003.interfaceornek;

public class Bisiklet extends Tasit {

	@Override
	public void ilerle() {
		
		System.out.println("bisiklet gidiyor");
		
	}

	@Override
	public void dur() {
		System.out.println("bisiklet durdu");
		super.dur();
	}

	
	
}
