/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4operaciones;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X,Y;
        int sumar,resta,division,multi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon valor de la X...");
        X = teclado.nextInt();
        System.out.println("Pon valor de la Y...");
        Y = teclado.nextInt();     
        //operaicones
        
        sumar = X + Y;
        resta = X - Y;
        division = X/Y;
        multi = X*Y;
        
        System.out.println("La suma es " + sumar
                        + "\n la resta da " + resta
                        + "\n su multiplicacion " + multi
                        + "\n y la division " + division);
    }
    
}
