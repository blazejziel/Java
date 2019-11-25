import java.awt.event.*;

import javax.swing.JOptionPane;

public class MouseHandler implements ActionListener{
	private Produkt p;
	public void actionPerformed(ActionEvent e) {
		Produkt p1=new Produkt(Okno.getPr(), Okno.cen);
		System.out.println("wpisane: "+Produkt.nazwa);
		System.out.println("Produkt: "+p1.getName());
		JOptionPane.showMessageDialog(null, "Klick!"+Okno.pr+" mia³o byæ pr...");
	}

}
