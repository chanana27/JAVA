// Anonymous Inner class

@FunctionalInterface
interface Demo11{
	void disp();
}

public class AnonyInner {

	public static void main(String[] args) {
		
		Demo11 obj = new Demo11() {
			public void disp() {
				System.out.println("Inside disp implemented inside anonymous inner class");
			}
		};
		
		obj.disp();

	}
}
