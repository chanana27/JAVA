class Alien{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class LaunchEncap2 {

	public static void main(String[] args) {
		Alien a=  new Alien();
		a.setAge(23);
		a.setName("aalu");
		
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
	}

}
