import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Handler implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e) {
		
		JFrame f=new JFrame("Potwierdzenie");
		String wj;
		wj=JOptionPane.showInputDialog("Czy na pewno?");
		if(wj.equals("y"))JOptionPane.showMessageDialog(null, "...i robisz, co chcesz :-)");
		
	}

}
