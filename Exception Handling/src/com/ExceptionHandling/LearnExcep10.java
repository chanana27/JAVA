// User-defined Exception example

package com.ExceptionHandling;
import java.util.Scanner;

class InvalidUserException extends Throwable{
	InvalidUserException(String msg){
		super(msg); //  already there no need to explicitly write also
	}
}

class Atm{
	private int accountNum = 1111;
	private int password = 2222;
	private int accNum;
	private int pswd;
	
	public void verify() throws InvalidUserException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number ");
		accNum=scan.nextInt();
		System.out.println("Enter password ");
		pswd=scan.nextInt();
		
		if(accountNum == accNum && password == pswd) {
			System.out.println("Collect your cash");
			System.exit(0);
		}
		else {
			throw new InvalidUserException("Invalid Credentials!");
		}
	}
}

class Bank{
	public void check() {
		Atm obj = new Atm();
		try {
			obj.verify();
		}
		catch(InvalidUserException e) {
			try {
				System.out.println(e.getMessage());
				obj.verify();
			}
			catch(InvalidUserException f) {
				try {
					System.out.println(f.getMessage());
					obj.verify();
				}
				catch(InvalidUserException g) {
					System.out.println(g.getMessage());
					System.out.println("Your card has been blocked");
				}
			}
		}
	}
}

	
public class LearnExcep10 {
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.check();
	}
}
