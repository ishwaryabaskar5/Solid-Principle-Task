public class Car extends Toy  {
	
	public Car(String color, double prize) {
		super(color, prize);
	}
	
	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}
