/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examena1pe1;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Exercici2 {
    public static void main(String[] args) {
        // Crear l'esc√†ner per obtenir el preu de l'article
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el preu de l'article: ");
        double preu = scanner.nextDouble();

        // Bucle FOR per calcular i mostrar el preu de 1 a 10 productes
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                // El des√® producte surt gratis, per tant el preu √©s igual al de 9 productes
                System.out.println(i + " productes valen " + (preu * (i-1)) + " Ä. (Gratis)");
            } else if (i==1) 
                {
                    System.out.println(i + " producte val " + preu );
                }
            else {
                // Calcular el preu multiplicant per la quantitat de productes
                System.out.println(i + " productes val " + (preu * i) + " Ä.");
            }
        }    
}
    
}
