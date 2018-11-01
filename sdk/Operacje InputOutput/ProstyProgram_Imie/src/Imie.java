/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blasius
 */

import javax.swing.*;
public class Imie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String imie=JOptionPane.showInputDialog(null, "Wpisz swoje imie: ");
        JOptionPane.showMessageDialog(null, "Witaj, "+imie);
    }
    
}
