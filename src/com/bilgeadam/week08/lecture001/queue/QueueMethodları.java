package com.bilgeadam.week08.lecture001.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethodları {

	public static void main(String[] args) {
		
		/*
		 * Queue FIFO ->> First İnFirst out prensibiyle çalışır yani ilk gelen ilk çıkar
		 */

		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(2);//sıraya bir eleman ekler
		queue.add(2);//siraya bir eleman ekler
		queue.peek();//sıradaki ilk öğeyi gösterir herhangi bir işlem yapmaz 
		queue.poll();//ilk öğeyi okur ve sıradan çıkarır.
		queue.isEmpty();//sırada eleman kalıp kalmadığını gösterir
	}

}
