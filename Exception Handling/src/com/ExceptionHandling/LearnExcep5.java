package com.ExceptionHandling;
import java.util.Scanner;

class First{
	void divide() throws ArithmeticException{ // not necessarily write throws here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Number ");
		int a=scan.nextInt();
		System.out.println("Enter second Number ");
		int b=scan.nextInt();
		try {
			int res = a/b;
			System.out.println("Result is "+a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter non-zero number");
			throw e;
		}
		finally {
			System.out.println("Thankyou for using the application");			
		}
	}
}

public class LearnExcep5 {
	public static void main(String[] args) {
		First f = new First();
		try {
			f.divide();	
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
