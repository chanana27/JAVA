package com.ExceptionHandling;
import java.util.InputMismatchException;


class Testing1 extends Object{
	public void divide()  {
		int a = 10;
		int b = 0;
		try {
			int res = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("code handled");
			throw new ArithmeticException();
			
		}
		finally {
			
			Character b1 = Character.valueOf('a');
			System.out.println(b1);
		}
	}
}

public class testing {

	public static void main(String[] args) throws Exception {
		Testing1 obj=new Testing1();
		
		try {
			
			obj.divide();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
