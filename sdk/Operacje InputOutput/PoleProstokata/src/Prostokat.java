/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blasius
 */

import java.util.*;
public class Prostokat {
    public static void main(String[] args){
        double a, b, pole;
        
        // obiekt klasy Scanner pozwala wczytać 
        // z konsoli znaki wpisane przez użytkownika
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz długość boku a: ");
        
        // wczytujemy zmienną 'a' typu doble
        a=sc.nextDouble();
        System.out.println("Wpisz długość boku b:");
        
        // wczytujemy zmienną 'b' także typu double
        b=sc.nextDouble();
        
        // obliczamy pole prostokąta
        pole=a*b;
        
        System.out.println("Pole prostokąta wynosi: "+pole);
    }
}
