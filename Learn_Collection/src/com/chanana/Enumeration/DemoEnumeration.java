package com.chanana.Enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
