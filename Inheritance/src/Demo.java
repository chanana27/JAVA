
class A{
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In A's Int");
	}
}
class B extends A{
	public B() {
		System.out.println("In B");
	}
	public B(int i) {
		System.out.println("In B's Int");
	}
}

public class Demo {

	public static void main(String[] args) {
		B obj = new B(4);

	}

}
