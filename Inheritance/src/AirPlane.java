class Plane extends Object{
	public void fly() {
		System.out.println("plane is flying");
	}
	public void takeOff() {
		System.out.println("plane has taken off");
	}
}

class CargoPlane extends Plane{
	@Override
	public void fly() { // overridden method
		System.out.println("CargoPlane flies at lower level");
	}
	public void carryCargo() { // specialized method
		System.out.println("CargoPlane carries cargo");
	}
}

class PassengerPlane extends Plane{
	@Override
	public void fly() { // overridden method
		System.out.println("Passenger plane flies at higher level");
	}
	public void carryPassenger() { // specialized method
		System.out.println("Passenger plane carries passenger");
	}
}

public class AirPlane {

	public static void main(String[] args) {
		Plane cp=new CargoPlane(); // upcasting
		cp.fly();
		cp.takeOff();
		((CargoPlane)cp).carryCargo(); // downcasting
		
		Plane pp=new PassengerPlane(); // upcasting
		pp.fly();
		pp.takeOff();
		((PassengerPlane)pp).carryPassenger(); // downcasting

	}

}
