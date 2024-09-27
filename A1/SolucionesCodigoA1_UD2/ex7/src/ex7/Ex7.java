/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	double millasMarinas, millasMetro;
        final int MILLAS_MARINAS_METRO = 1852; //CONSTA
        // Solicitar la distancia en millas marinas
        System.out.print("Ingrese la distancia en millas marinas: ");
        millasMarinas = scanner.nextDouble();
        millasMetro = millasMarinas *MILLAS_MARINAS_METRO;
        
        // Mostrar la distancia en metros
        System.out.println("La distancia en metros es: " + millasMetro);
        
    }
    
}
