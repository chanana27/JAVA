// If the parent class overridden method declares an uncheckedany exception, then the child class overridding method can declare only unchecked exceptions or no exception  not checked exceptions.

package com.ExceptionHandling;

import java.io.IOException;

class Demo12{
	void disp() throws ArithmeticException{ // declares unchecked exception
		System.out.println("parent class disp method");
	}
}

class Demo13 extends Demo12{ 
	public void disp() throws ArrayIndexOutOfBoundsException{  // we cannot declare checked exception here
		System.out.println("child classs disp method...");
	}
}

public class LearnExcep7 {

	public static void main(String[] args) {
		Demo12 d = new Demo13();
		d.disp();
		
	}

}
