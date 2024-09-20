import java.util.Scanner;

class Fan{
//	String brand;
	int cost;
}

public class LaunchArr2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Fan[] f =new Fan[3];
		f[0] = new Fan();
		f[1] = new Fan();
		f[2] = new Fan();
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter data for " + i + " Fan ");
			f[i].cost = inp.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("Data for " + i + " fan is " + f[i].cost);
		}
	}
}
