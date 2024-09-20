// During Java8 interfaces can have default methods and static methods.
interface Demo{
	default int sum() {
		return 5+5;
	}
	
	void display();
	
	static void show() {
		System.out.println("Inside static method in Demo Interface");
	}	
}

class Demo1 implements Demo{
	public int sum() {
		return 5+6;
	}
	
	public void display() {
		System.out.println("Inside Demo1 display method");
	}
	
	static void show() {
		System.out.println("Inside static method of Demo1 Class");
	}
}

public class LearnInterface2 {

	public static void main(String[] args) {
		Demo obj = new Demo1();
		System.out.println(obj.sum());
		obj.display();
		Demo.show();
		((Demo1)obj).show();
	}

}
