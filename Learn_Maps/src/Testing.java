
class Demo{
	public int value;
	Demo(int value){
		this.value = value;
	}
	
	public String toString() {
		return "hello";
	}
	public int hashCode() {
		return 45;  
	}
}

public class Testing {

	public static void main(String[] args) {
		
		Demo d = new Demo(11);
		Demo d1 = new Demo(11);
		System.out.println(d);
		System.out.println(d1);
		
		System.out.println(d.value);
		System.out.println(d1.value);
		d.value = 45;
		System.out.println(d.value);
		System.out.println(d1.value);
		
		System.out.println(d== d1);
		
	}
}
