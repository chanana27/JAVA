// Normal Arithmetic Exception most popular example divide by 0.
package com.ExceptionHandling;
import java.util.Scanner;

public class LearnExcep1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int num = scan.nextInt();
			System.out.println("Enter the Denominator");
			int den = scan.nextInt();
			
			int res = num / den;
			System.out.println("The result after division is "+ res);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator must be greater than zero");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
