import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(2);
		ts.add(12);
		ts.add(6);
		ts.add(6);
		
		System.out.println(ts.lower(7));
		System.out.println(ts.floor(7));
		
		System.out.println(ts.higher(10));
		System.out.println(ts.ceiling(10));
		
		System.out.println(ts.ceiling(424));
			
		System.out.println(ts);
		
		
		System.out.println("********************");
		for(int i=0; i<ts.size(); i++) {
			System.out.println(ts.getFirst());
			ts.add(43);
		}
		System.out.println("********************");
		for(Object o: ts) {
			System.out.println(o);
			ts.add(o);
		}
		
		System.out.println("*******************");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(ts);

	}

}
