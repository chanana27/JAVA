import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class May30_second {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		System.out.println(s);
		int k=3;
		int n = s.length();
		/* n = 13  
		 * welcometojava
		 * 
		 * 
		 * */
		
		ArrayList<String> data = new ArrayList<>();
		
		for(int i=0; i<=n-k; i++) {
			String str = s.substring(i, i+3);
			data.add(str);	
		}
		
		data.sort(null);
		for(String i: data) {
			System.out.println(i);
		}
	}

}
