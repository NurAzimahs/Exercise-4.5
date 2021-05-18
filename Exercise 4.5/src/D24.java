
public class D24 extends Durian {

	private String colour; 
	private String shape;
	
	public D24(String name, double p, int q, String c, String s) {
		super(name, p, q);
		this.colour = c;
		this.shape = s; 
	}
	public String getColour() {
		return this.colour;
	}
	public String getShape() {
		return this.shape;
	}
	
	public String toString() {
		return ("Total Price: RM" + paid + "\n"
				+ "Quantity is " + quantity + "\n"
				+ "Colour: " + getColour() + "\n"
				+ "The shape of " + super.name + " is " + getShape());
	}
}
