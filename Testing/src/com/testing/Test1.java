package com.testing;

class Demo1{
	// constructor
	Demo1(){
		System.out.println("Inside Demo1 constructor.....");
	}
}

class Demo2 extends Demo1{
	// constructor
	Demo2(){
		System.out.println("Inside Demo2 constructor");
	}
	Demo2(int a){
		this();
		super();
		System.out.println("Inside Parameterized constructor of Demo2");
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		Demo2 obj = new Demo2(2);
		
	}
}
