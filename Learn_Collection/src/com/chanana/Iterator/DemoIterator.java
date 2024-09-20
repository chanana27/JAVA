package com.chanana.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoIterator {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);

		// for each loop
		for(Object i: arr)
			System.out.println(i);
		
		System.out.println("**************************");
		
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**********ListIterator*************");
		
		LinkedList l1 = new LinkedList();
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		
		// forward iteration
		ListIterator itr1 = l1.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("************ListIterator backward***********");
		// backward iteration
		ListIterator itr2 = l1.listIterator(l1.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
		System.out.println("************Descending Iterator****************");
		Iterator dItr = l1.descendingIterator();
		
		while(dItr.hasNext()) {
			System.out.println(dItr.next());
			
		}
		
		
	}

}
