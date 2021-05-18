
public class Main {

	public static void main(String[] args) {
		
		Durian d = new Durian("Durian",30.0, 4); //new object for super class
		System.out.println(d);
		System.out.println(); 
		
		MusangKing mk = new MusangKing("Musang King", 50.99, 5, "Sweet", "Golden"); //new object for sub class
		System.out.println(mk);
		System.out.println();
		
		D24 dd = new D24("Durian D24", 29.99, 8, "White", "Oval"); //new object for sub class
		System.out.println(dd);
		System.out.println();
		
		Mango m = new Mango("Mango Harum Manis", "High level of vitamin C", 0.5, 13.5);
		System.out.println(m);
	}

}
