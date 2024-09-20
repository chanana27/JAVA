package com.chanana.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Launch1 {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		
		ll1.add(ll1);
		
		System.out.println(ll1);
		
		LinkedList ll2 = new LinkedList();
		ll2.add(11);
		ll2.add("22");
		ll2.add("abhay");
		
		ll2.add(1, "chanana");
		System.out.println(ll2);
		
		Object ans = ll2.get(2);
		System.out.println(ans);
		
		System.out.println(ll2.size());
		
		ArrayList arr1 = new ArrayList();
		arr1.add(23);
		arr1.add(83);
		
		ll2.add(3, arr1);
		ll2.offer("elephant");
		System.out.println(ll2);
		
		for(int i=0; i < ll2.size(); i++) {
			System.out.println(ll2.get(i));
		}
	}

}
