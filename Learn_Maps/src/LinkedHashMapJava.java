import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapJava {
	public static void main(String []args) {
		LinkedHashMap lhm = new LinkedHashMap();
		HashMap hm = new HashMap();
		hm.put(1, "abhay");
		hm.put(2, "chanana");
		hm.put(3, "happy");
		
		lhm.putAll(hm);
		lhm.put(4, "laptop");
		lhm.put(5, "mouse");
		
		System.out.println(lhm);
		
		// getting the keys from the map;
		Set keys = lhm.keySet();
		System.out.println(keys);
		
		// iterating over every element of LinkedHashMap
		Set entries = lhm.entrySet();
		Iterator itr = entries.iterator();
		
		while(itr.hasNext()) {
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println("The key is " + data.getKey() + " and the value is " + data.getValue());
		}
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a == b);
	}
}
