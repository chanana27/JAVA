
public class DemoVarargs {
	
	public static int add(int ... nums) {
		int sum=0;
		
		for(int it: nums)
			sum+=it;
		
		return sum;
	}

	public static void main(String ...args) {
		
		int result = add(3,4,5,6);
		System.out.println(result); 
	}

}
