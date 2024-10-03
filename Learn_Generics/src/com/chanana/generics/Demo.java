package com.chanana.generics;

import java.util.ArrayList;

class Generic<T>{
	T obj;
	Object [] arr = new Object[45];
	
	Generic(T obj){
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("The type of object is "+ obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
	
	public void add(Object value, int ind) {
		arr[ind] = value;
	}
}

public class Demo {

	public static void main(String[] args) {
		Generic<String> obj1 = new Generic<String>("10");
		obj1.show();
		System.out.println(obj1.getObject());
		
		Generic<Integer> obj2 = new Generic<Integer>(10);
		obj2.show();
		System.out.println(obj2.getObject());
		
		Generic obj3 = new Generic("kk");
		obj3.show();
		System.out.println(obj3.getObject());
		obj3.add("Asdf", 0);
		obj3.add(78, 1);
		
		System.out.println(obj3.arr[2]);
		
			
	}
}
