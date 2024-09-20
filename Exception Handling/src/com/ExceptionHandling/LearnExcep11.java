// Implementing try with resources (multiple resources in try) 
package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnExcep11 {

	public static void main(String[] args)  {

		try(BufferedReader bf = new BufferedReader(new FileReader("sample.txt")) ; BufferedReader bf1 = new BufferedReader(new FileReader("sample1.txt"))) {
			
		} // as the control reaches here, automatically JVM will call bf.close() and bf1.close() method.
		// If i do not write catch here, i need to mention throws Exception in the main method as there are checked exceptions. then the code will run but it will give FileNotFound exception
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
