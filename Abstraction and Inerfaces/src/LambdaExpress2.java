interface Calculator50{
	int sum(int a, int b);
}

public class LambdaExpress2 {
	public static void main(String[] args) {
		Calculator50 c = (a, b)-> a+b;
		c.sum(4,5);
	}
}
