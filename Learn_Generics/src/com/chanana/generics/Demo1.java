package com.chanana.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static ArrayList methodOne(List<String> arr) {
		ArrayList<String> ar = new ArrayList<String>();
		return ar;
	}
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		methodOne(al1);
	}


}
