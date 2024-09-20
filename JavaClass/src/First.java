public class First{
	public static void main(String[] args) {
		
		String s = "geeksss@for@geekssss";
		String [] arr = s.split("s");
		System.out.println(arr.length);
		for(String value: arr)
			if(value == "") {
				System.out.println("space");
			}else
				System.out.println(value);
		
		System.out.println(arr.length);
				
	}
}