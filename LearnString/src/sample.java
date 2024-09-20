public class sample{
	public static void main(String []args) {
		String s1 = new String("Abhay");
		String s2 = s1.intern();
		s2 = "Abhay";
		String s3 = "Abhay";
		System.out.println(s3 == s2);
	}
}