
public abstract class Fruits {

	protected String name; 
	
	public Fruits(String name) {
		this.name = name;
	} 
	
	public abstract double totalPrice();
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(double pp, int qq);
}
