import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testing{
	   
	public static void main(String[] args) {
		
		char[] ca = new char[26];
	    String s = "eat";
        for (char c : s.toCharArray()) ca[c - 'a']++;
	    
		String ans = String.valueOf(ca);
		System.out.println(ans);
	}
}
	