/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Leer los dos n?meros como enteros
        System.out.print("Ingrese el primer n?mero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo n?mero: ");
        int numero2 = scanner.nextInt();

        // Mostrar los n?meros en orden ascendente
        if (numero1 < numero2) {
            System.out.println(numero1 + "<"  + numero2);
        } else {
            System.out.println(numero2 + "<" + numero1);
        }
    }
    
}
