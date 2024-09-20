import java.util.Hashtable;

public class HashTableJava {

	public static void main(String[] args) {
		
		Hashtable hm = new Hashtable();
		hm.put(new Temp(5),"A");
		hm.put(new Temp(2),"B");
		hm.put(new Temp(6),"C");
		hm.put(new Temp(15),"D");
		hm.put(new Temp(23),"E");
		hm.put(new Temp(16),"f");
		
		System.out.println(hm);

	}	
}

class Temp{
	int i;
	public Temp(int i) {
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	@Override
	public String toString() {
		return i + "";
	}
}