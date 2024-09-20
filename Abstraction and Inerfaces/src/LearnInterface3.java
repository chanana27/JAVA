// In Java 9 we can also have private methods inside interface. private methods do not participate in inheritance.
interface Demo3{
	private void show() {
		System.out.println("Inside private method of Demo interface");
	}
	
	default void disp() {
		System.out.println("Inside display method of Demo interface"); 
		print();
	}
	
	static void print() {
		System.out.println("Inside static method of Demo interface");
	}
}

class Demo14 implements Demo3{
	
}
public class LearnInterface3 {

	public static void main(String[] args) {
		
		Demo3 obj = new Demo14();
		obj.disp();
		Demo3.print();
	}

}
