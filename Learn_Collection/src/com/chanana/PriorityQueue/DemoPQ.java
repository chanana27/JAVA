package com.chanana.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class DemoPQ {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(40);
		pq.add(90);
		pq.add(80);
		pq.add(50);
		pq.add(10);
		
		System.out.println(pq);
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
