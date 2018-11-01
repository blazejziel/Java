/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

/**
 *
 * @author blasius
 */
public class PI {
    public static void main(String[] args){
        // wyświetlenie liczby PI
        /* wyrażenie %6.5f oznacza, że na liczbę typu float( f na końcu)
           jest przeznaczone 6 miejsc, w tym 5 po przecinku (stąd 6.5)
        */ 
        System.out.printf("Liczba PI"+"%6.5f"+"\n", Math.PI);
    }
    
}