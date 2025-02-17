/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen14022025ex1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Volem guardar una gran quantitat de dades, diguem-ne 20. Aquestes dades són nombres enters generats
aleat?riament del 0 al 10 (inclosos).
- Tria una estructura de dades per desar totes aquestes dades
-Crea una funció que creï aquesta estructura de dades i guardi-hi els 20 valors generats a
l'atzar(0'25pt)
-Demana un valor a l'usuari de l'1 al 10.
-Creeu una funció que recorri l'estructura de dades i canviï tots els valors que coincideixin amb
l'introduït per l'usuari per un 0. (1,25 pt)
-Crea una funció que recorri aquesta estructura de dades i canviï el primer número més petit de 4,
per un -1, només el primer (1,5 pt)
-Funció que mostra el resultat de l'estructura en passar per les dues funcions (0,25 sempre que
estigui feta alguna de les funcions anteriors)
 */
public class Examen14022025Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] valors = new int[20];
       Scanner sc = new Scanner(System.in);
       
       
       plenarValors(valors);
       mostrarArray(valors);
        System.out.println("Posa un valor");
        int num = sc.nextInt();
       plenarA0(valors,num);
       trobarMenor4(valors);
        mostrarArray(valors);
    }

    private static void plenarValors(int[] valors) {
        Random rd = new Random();
        for (int i = 0; i < valors.length; i++) {
            valors[i] = rd.nextInt(0, 11);
        }
        
    }

    private static void plenarA0(int[] valors, int num) {
        for (int i = 0; i < valors.length; i++) {
            if (valors[i] == num)
            {
                valors[i] = 0;
            }
        }
    }

    private static void mostrarArray(int[] valors) {
         for (int i = 0; i < valors.length; i++) {
             System.out.print(valors[i]+",");
    }
         System.out.println("");
    }

    private static void trobarMenor4(int[] valors) {
        int i=0;
        boolean trobat = false;
        while(i<valors.length && !trobat)
        {
            if (valors[i]>0 && valors[i]<4) //&& !trobat
            {
                valors[i] =-1;
                trobat = true;
                //i=valors.length
            }
            i++;
        }
    }
}
