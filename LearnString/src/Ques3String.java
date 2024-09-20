// check whether two String are Anagram or not.
import java.util.Scanner;

public class Ques3String {
	public static void main(String[] args) {
		String s1, s2;
		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s1 = s1.toLowerCase();
		s2=  s2.toLowerCase();
		
		int size = s1.length();
		
		int [] arr = new int[26];
		
		for(int i=0; i<size; i++) {
			arr[s1.charAt(i) - 'a']++;
			arr[s2.charAt(i) - 'a']--;
		}
		
		String result = "Anagram";
		for(int i=0; i<size; i++) {
			if(arr[i] != 0) {
				result = "Not Aangram";
			}	
		}
		System.out.println(result);
	}
	
}
