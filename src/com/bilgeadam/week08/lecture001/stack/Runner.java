package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class Runner {

	public static void main(String[] args) {
			
		// Stack ->>> LIFO ->> Last in first out 
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); //1 sayısını stacke ekler
		stack.push(2);//2 sayısını stacke ekler genellikle stacklerde ekleme işlemi için psuh kullanılır.
		stack.peek();// son eklenen değeri okur ama silmez 
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		stack.pop();//son değeri bulur ve değeri okuduktan sonra siler
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	
		//stack.pop() stackte eleman kalmamışken bu method tekrar çalıştırılırsa emptystackexception alırız
		
		stack.isEmpty();//stackte eleman olup olmadığını kontrol eder egerhiç eleman yoksa true eleman varsa false döner
		
			System.out.println(stack.isEmpty());
			
		
			
			
			
	}

}
