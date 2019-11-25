
public class Produkt {
	static String nazwa;
	static double cena;
	
	public Produkt() {
		nazwa="";
		cena=0;
	}
	
	public Produkt(String naz, double c) {
		nazwa=naz;
		cena=c;
	}
	
	public String getName() {
		return nazwa;
	}
	
	public double getPrice() {
		return cena;
	}
		
}
