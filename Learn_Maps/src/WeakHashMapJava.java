import java.util.WeakHashMap;
import java.util.HashMap;

public class WeakHashMapJava {

	public static void main(String[] args) throws Exception {
		
		Integer i1 = 450;
		
		HashMap hm = new HashMap();
		hm.put(i1, "Abhay");
		
		i1 = null;
		System.gc();
		System.out.println(hm);
		
	}
}

	
