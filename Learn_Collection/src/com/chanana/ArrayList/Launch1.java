package com.chanana.ArrayList;
import java.util.ArrayList;

public class Launch1 {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add("10");
		arr1.add(10);
		arr1.add("abhay chanana");
		arr1.add(45.65);
		
		System.out.println(arr1);
		
		ArrayList arr2 = arr1;
		System.out.println(arr2);
		
		ArrayList arr3 = new ArrayList();
		arr3.add("10");
		arr3.add(10);
		arr3.add("abhay chanana");
		arr3.add(45.65);
		
		System.out.println(arr1.equals(arr3));
		
		arr3.add(2, 45);
		System.out.println(arr3.get(2));
		
	}

}
