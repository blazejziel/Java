import java.awt.event.*;

import javax.swing.JOptionPane;
public class EndHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String c;
		c=JOptionPane.showInputDialog("czy na pewno?");
		if(c.equals("Y"))System.exit(0);
		else if(c.equals("y"))System.exit(0);

	}

}
