// Multiple catch block for a single try block. The generic catch block must be at last. If it is kept first jvm will only execute that as it can handle every type of exception. We will not be able to write more catch block after generic catch block as compiler will give us compile time error.
package com.ExceptionHandling;
import java.util.Scanner;

public class LearnExcep2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int num = scan.nextInt();
			System.out.println("Enter the Denominator");
			int den = scan.nextInt();
			
			int res = num / den;
			System.out.println("The result after division is "+ res);
			
			System.out.println("Enter the size of array");
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			System.out.println("Enter the element to insert");
			int element = scan.nextInt();
			
			System.out.println("Enter the position at which the element is to be inserted");
			int position = scan.nextInt();
			arr[position] = element;
			System.out.println("Successfully inserted the element");
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator must be greater than zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter postion within the limits of array");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array size cannot be negative");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Thank you for using the application");

	}

}
