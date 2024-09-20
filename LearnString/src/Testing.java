
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Telusko";
		String s2 = "iNeuron";
		String s3 = "Telusco" + "iNeuron";
		String s4 = "Telusco".concat("iNeuron");
		String s5 = s1+"iNeuron";
		
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		
		StringBuffer sb = new StringBuffer("asdf");
		sb.append("adsf");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer(3);
		System.out.println(sb1.capacity());
		
		sb.insert(8, false);
		System.out.println(sb);
	
	}

}
