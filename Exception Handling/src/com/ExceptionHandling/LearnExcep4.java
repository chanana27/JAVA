// Exception object is propagated to the caller methods until the last caller method. We can have try catch block at any of the caller method. If not handled by any caller method the JVM gives it to Default Exception handler.

package com.ExceptionHandling;
import java.util.Scanner;

class Alpha{
	Scanner scan = new Scanner(System.in);
	public void division() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Result: "+ a/b);
	}
}

class Beta{
	public void display() {
		try {
			Alpha a = new Alpha();
			a.division();	
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter non-zero second number");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class LearnExcep4 {
	public static void main(String[] args) {
		Beta b = new Beta();
		b.display();

	}

}
