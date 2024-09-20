import java.util.Scanner;
public class Ques2String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = new String();
		s1 = scan.nextLine();
		
		String[] s2 = s1.split(" ");
		
		String result = "";
		for(int i=0; i<s2.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(s2[i]);
			sb.reverse();
			result += sb + " ";
		}
		
		System.out.println(result);
		
	}

}
