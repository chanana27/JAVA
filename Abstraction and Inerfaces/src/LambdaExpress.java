interface Computer{
	void show();
}

public class LambdaExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer obj = ()-> System.out.println("in show");
		obj.show();
	}

}
