import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
}

interface asdf{
	void add();
	void sub();
	
}
class Calculator1 implements Calculator, asdf{
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number to add");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd number to add");
		int b = scan.nextInt();
		
		System.out.println(a+b);
	}
	
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number to sub");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd number to sub");
		int b = scan.nextInt();
		
		System.out.println(a-b);
	}
}

class Calculator2 implements Calculator{
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void sub() {
		int a=45;
		int b=30;
		System.out.println(a-b);
	}
}

class Calc{ // reducing the line of code by creating this class, therefore polymorphism also reduces the line of code.
	public void permit(Calculator obj) {
		obj.add();
		obj.sub();
	}
}

public class LearnInterface {
	public static void main(String[] args) {
		Calculator c1 = new Calculator1();
		Calculator c2 = new Calculator2();
		
		Calc c = new Calc();
		c.permit(c1);
		c.permit(c2);
	}
}
