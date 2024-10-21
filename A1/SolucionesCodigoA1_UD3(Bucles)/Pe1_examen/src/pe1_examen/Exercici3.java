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
public class Exercici3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialitzaci?³: demanar el nombre d'unitats inicials al magatzem
        System.out.print("Introdueix el nombre d'unitats disponibles al magatzem: ");
        int estoc = scanner.nextInt();
        int vendes=1;
       
        // Bucle principal del programa
        while (estoc >=0 && vendes != 0) {
                // Preguntar quantes unitats s'han venut (o si hi ha recepci?³ de noves unitats)
                System.out.print("Quantes unitats has venut (negatiu si has rebut noves unitats o 0 per acabar): ");
                vendes = scanner.nextInt();

                // Si l'usuari introdueix un nombre negatiu, s'ha rebut un nou lot de productes
                if (vendes < 0) {
                    estoc = estoc - vendes; // Afegim el nombre de productes al magatzem
                    System.out.println("Has rebut  noves unitats. Estoc actual: " + estoc + " unitats.");
                }
                else
                {
                    // Actualitzaci?³ de l'estoc restant despr?©s de les vendes
                    estoc -= vendes;
                }
           
                
                if (estoc < 50) {
                    System.out.println("Atenció! L'estoc ha baixat a menys de 50 unitats. Estoc actual: " + estoc + " unitats.");
                }
            }
        

        // Finalitzaci?³ del programa si l'usuari introdueix 0
        if (vendes == 0) {
            System.out.println("Has decidit finalitzar el programa.");
        }
        if (estoc < 0) {
            System.out.println("Estoc insuficient! L'estoc actual es negatiu (" + estoc + "). Has de tancar la botiga per falta de productes.");
        }

    }    
}
