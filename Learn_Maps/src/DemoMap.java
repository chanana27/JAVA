import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoMap {

	public static void main(String[] args) {
		HashMap mp = new HashMap();
		mp.put(13, "kavya");
		mp.put(26, "Pooja");
		mp.put(27, "abhay");
		mp.put("27", "Vishal");
		
		System.out.println(mp);
		
		Set s = mp.keySet(); // To get the keys from the map
		System.out.println(s);
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass());
		
		Collection c = mp.values();
		System.out.println(c);
		System.out.println(c.getClass().getName());
		
		Set mapEntry = mp.entrySet();	
		System.out.println(mapEntry);
		
		Iterator itr = mapEntry.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
