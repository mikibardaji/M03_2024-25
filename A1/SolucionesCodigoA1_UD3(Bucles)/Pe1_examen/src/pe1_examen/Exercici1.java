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
public class Exercici1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demanem el nombre inicial de bacteris
        System.out.print("Amb quants bacteris comenceu l'estudi?: ");
        int bacterisInicials = scanner.nextInt();

        // Demanem el nombre d'hores
        System.out.print("Quantes hores fareu l'estudi? ");
        int hores = scanner.nextInt();

        // Inicialitzem la població de bacteris
        int poblacioBacteris = bacterisInicials;

        // Utilitzem un bucle for per calcular la població cada hora
        for (int hora = 1; hora <= hores; hora++) {
            poblacioBacteris *= 2; // Doblem la població de bacteris
        }

	 System.out.println("Al cap de  " + hores + ", tindreu " + poblacioBacteris);
    }
    
    
}
