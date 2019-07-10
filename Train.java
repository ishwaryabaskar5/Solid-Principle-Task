public class Train extends Toy {
	
	public Train(String color, double prize) {
		super(color, prize);
	}
	
	@Override
	public void move() {
		System.out.println("Train is moving");
	}
}
