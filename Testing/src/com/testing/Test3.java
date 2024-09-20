package com.testing;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf(10);
		
		System.out.println(i3.hashCode());
		System.out.println(i3 == i4); 
	}

}
