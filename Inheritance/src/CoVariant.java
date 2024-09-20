// Different return type could be there in case of method overriding only when the return type is of co-variant type.
class First{
	
}
class Second extends First{
	
}

class Animal{
	public First eat() {
		System.out.println("eat method of animal class");
		First f = new First();
		return f;
	}
}
class Tiger extends Animal{
	public Second eat() {
		System.out.println("eat method of Tiger class");
		Second s = new Second();
		return s;
	}
}

public class CoVariant{
	public static void main(String[] args) {
		
		Animal obj = new Tiger();
		obj.eat();
	}
}