
public class Mango extends Fruits {

	private String benefits;
	private double weight;
	private double price;

	
	public Mango(String name, String b, double w, double p) {
		super(name);
		this.benefits = b;
		this.weight = w; 
		this.price = p;
		
		System.out.println("Mango constructor is invoke");
	}
	
	public String getBenefits() {
		return this.benefits;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double calPrice() {
		return this.price * this.weight;
	}
	
	public String toString() {
		return ("The benefits " + super.name + " is " + getBenefits() + "\n" 
		        + "Weight: " + getWeight() + "kg" + "\n"
				+ "Total Price: RM" + calPrice());
		
	}

	@Override
	public double totalPrice() {
		return 0;
	}

	@Override
	public double totalPrice(double pp) {
		return 0;
	}

	@Override
	public double totalPrice(double pp, int qq) {
		return 0;
	}
}
