import java.util.Scanner;
public class Ques4String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		s = s.toLowerCase();
		int [] arr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(arr[i]> 1) {
				System.out.println("Character "+ (char)('a'+ i) +" "+ arr[i] + " times");
			}
		}

	}

}
