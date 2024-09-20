import java.util.Scanner;

public class LaunchArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[5];
		int n = a.length;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the marks of student "+ i);
			a[i] = scan.nextInt();
		}
		
		System.out.println("The marks of Student's are: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
