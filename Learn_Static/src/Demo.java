// static block runs before main method
public class Demo {
	static int a, b, c;
	
	static {
		System.out.println("Static block running");
		a=10; b=20; c=30;
	}
	
	static void display() {
		System.out.println("Inside display method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void display2() {
		System.out.println("Display 2");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		display();
	}

}
