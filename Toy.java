public class Toy implements ToyOperations{
	private String color;
	private double prize;
	
	public Toy(String color, double prize) {
		this.color = color;
		this.prize = prize;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrize() {
		return prize;
	}
	
	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	@Override
	public void move() {
		System.out.println("Toy is moving");
	}
	
	@Override
	public void fly() {
		System.out.println("Toy is flying");
	}
}
