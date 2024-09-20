import java.util.Scanner;

public class Ques1String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		StringBuilder sb1 = new StringBuilder("iNeuron");
		StringBuilder sb1 = new StringBuilder();
		String input = scan.nextLine();
		sb1.append(input);
		
		sb1.reverse();
		System.out.println(sb1);
		
	}

}
