import javax.swing.JOptionPane;

public class Koszyk {
	private static Produkt produkt;
	
	Koszyk(){
		JOptionPane.showMessageDialog(null, "Koszyk jest pusty!!!");
	}
	
	public Koszyk(Produkt p) {
		produkt=p;
	}
	
	static Produkt getKoszyk() {
		return produkt;
	}
	
	static void setKoszyk(Produkt pr) {
		Koszyk.produkt=pr;
	}
	
	void show() {
		JOptionPane.showMessageDialog(null, "produkt: "+produkt.name+
					"\n"+"cena: "+produkt.price);
		
		
	}
}
