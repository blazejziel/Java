import javax.swing.*;

public abstract class Test {
	//static Produkt nazwa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wprowadzenie nazwy produktu
		String s=JOptionPane.showInputDialog("Wpisz nazwê produktu: ");
		Produkt.setName(s);
		//JOptionPane.showMessageDialog(null, "wpisa³eœ: "+Produkt.getName());
		
		//wprowadzenie ceny produktu
		String s1=JOptionPane.showInputDialog("wpisz cenê produktu: ");
		double d=Double.parseDouble(s1);
		Produkt.setPrice(d);
		//JOptionPane.showMessageDialog(null, "wpisa³eœ cenê: "+d);
		
		Koszyk k=new Koszyk(new Produkt(s,d));
		k.show();
		
		for(int i=0; i<4; i++) {
			s=JOptionPane.showInputDialog("Wpisz nazwê produktu: ");
			Produkt.setName(s);
			s1=JOptionPane.showInputDialog("wpisz cenê produktu: ");
			if(s==null)System.exit(0);
			if(s1==null)System.exit(0);
			d=Double.parseDouble(s1);
			Produkt.setPrice(d);
			k.show();
			
		}
	}

}
