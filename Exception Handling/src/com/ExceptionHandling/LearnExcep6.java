// If the parent class overridden method does not declare any exception, then the child class overridding method can declare only unchecked exceptions and not checked exceptions.

package com.ExceptionHandling;

class Demo10{
	void disp() {
		System.out.println("parent class disp method");
	}
}

class Demo11 extends Demo10{
	public void disp() throws ArrayIndexOutOfBoundsException { // here we cannot write any checked exceptions
		System.out.println("child classs disp method");
	}
}

public class LearnExcep6 extends Throwable{

	public static void main(String[] args) {
		Demo10 d = new Demo11();
		d.disp();
		
	}

}
