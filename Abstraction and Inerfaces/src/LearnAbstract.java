import java.util.Scanner;

abstract class Shapes{
	float area;
	
	abstract void input();
	abstract void compute();
	
	void display() {
		System.out.println("The area is "+ area);
	}
}

class Rectangle extends Shapes{
	float len, bre;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length for rectangle");
		len = scan.nextFloat();
		
		System.out.println("Enter the breadth of rectangle");
		bre = scan.nextFloat();
	}
	
	void compute() {
		area = len*bre;
	}
}

class Square extends Shapes{
	float side;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the side of square");
		side = scan.nextFloat();
	}
	void compute() {
		area = side*side;
	}
}

class Circle extends Shapes{
	float rad;
	final float pi = 3.14f;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		rad = scan.nextFloat();
	}
	
	void compute() {
		area = pi*rad*rad;
	}
}

class Geometry{
	void permit(Shapes s) {
		s.input();
		s.compute();
		s.display();
	}
}

public class LearnAbstract {

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		Square s= new Square();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
	}

}
