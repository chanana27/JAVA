package com.ExceptionHandling;
// nested try catch. Try catch can be inside catch block also, finally block also
// In this case as the inner catch block does not have the same exception that has occurred therefore the outer catch block runs as it is a generic catch block.
public class LearnExcep9 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside outer try");
			try {
				System.out.println("inside inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException e) {
				System.out.println("inside inner catch");
			}
			System.out.println("outside inner try catch");
		}
		catch(Exception e) {
			System.out.println("Inside outer catch");
		}
		finally {
			System.out.println("Inside outer finally");
		}
	}
}
