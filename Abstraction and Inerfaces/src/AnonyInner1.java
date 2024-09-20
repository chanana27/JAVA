// Anonymous Inner class can also be used to implement non-functional interface.

interface First{
	void disp();
	void disp2();
	default void disp3(){
		
	}
}

public class AnonyInner1 {

	public static void main(String[] args) {
		First obj = new First() {
			public void disp() {
				System.out.println("disp method");
			}
			public void disp2() {
				System.out.println("disp2 method");
			}
			public void disp3() {
				System.out.println("disp3 method");
			}
		};
		
		obj.disp();
		obj.disp2();
		obj.disp3();
	}
}
