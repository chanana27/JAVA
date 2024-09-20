
public class GarbageCollectorAction  {

	public static void main(String[] args)throws Exception {
		
		Employee e = new Employee();
		e = null;
		System.gc(); // Informing the JVM to active the garbage collector thread to clean the garbage object
		Thread.sleep(5000);
	}

}

class Employee{
	@Override
	public void finalize() {
		System.out.println("Garbage Collector Cleaning");
	}
}
