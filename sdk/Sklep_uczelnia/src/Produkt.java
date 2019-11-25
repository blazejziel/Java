import javax.swing.JOptionPane;

public class Produkt {
	protected static String name;
	static double price;
	
	public Produkt() {
		//setName("");
		price=0;
	}
	
	public Produkt(String n, double p) {
	//	setName(n);
		price=p;
	}
	
	static String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}

	public static void setName(String n) {
		Produkt.name = n;
	}
	
	public static void setPrice(double p) {
		price=p;
	}
	
	
}
