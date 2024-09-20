// Anonymous Inner class is being used to overwrite concrete class method

class Demo4{
	protected void disp() {
		System.out.println("disp method in Demo3");
	}
}

public class AnonyInner2 {

	public static void main(String[] args) {
		Demo4 obj = new Demo4() {
			protected void disp() {
				System.out.println("disp method inside anonyInner class");
			}
		};
		
		obj.disp();

	}

}
