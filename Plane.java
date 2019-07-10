public class Plane extends Toy {
	
	public Plane(String color, double prize) {
		super(color, prize);
	}
	
	@Override
	public void move() {
		System.out.println("Plane is moving");
	}
	
	@Override
	public void fly() {
		System.out.println("Plane is playing");
	}
}
