import java.util.IdentityHashMap;
public class IdentityHashMapJava {

	public static void main(String[] args) {
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(10, "hello");
		ihm.put(10, "asdf");
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		ihm.put(a, "world");
		ihm.put(b, "india");
		
		System.out.println(ihm);
		
	}

}
