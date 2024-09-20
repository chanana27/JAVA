package com.testing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayDeque arr = new ArrayDeque();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.getFirst());
//			arr.add(45);
//		}
		
		for(Object o: arr) {
			System.out.println(o);
			arr.removeFirst();
		}
		
//		Iterator itr = arr.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.remove();
//		}
		
		System.out.println(arr);
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
		    Integer val = it.next();
		    if (val % 2 == 0) {
		        it.remove();  // Safely removes even numbers
		    }
		}
	}

}
