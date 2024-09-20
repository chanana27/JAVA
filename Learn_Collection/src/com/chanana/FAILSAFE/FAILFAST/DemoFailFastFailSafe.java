package com.chanana.FAILSAFE.FAILFAST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoFailFastFailSafe {

	public static void main(String[] args) {
		
		/*ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println(arr);
		
		// Example of Fail Fast. Trying to add while iterating over collection gave us exception. (ConcurrentModificationException)
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//arr.add(34); // will give exception  
		}
		*/
		// Fail Safe. The iteration completes. No Exception. The element does not gets added.
		CopyOnWriteArrayList arr2 = new CopyOnWriteArrayList();
		arr2.add(11);
		arr2.add(12);
		arr2.add(13);
		arr2.add(14);
		arr2.add(15);
		
		Iterator it2 = arr2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
			arr2.add(2334);
		}
		
		System.out.println(arr2);
	}

}
