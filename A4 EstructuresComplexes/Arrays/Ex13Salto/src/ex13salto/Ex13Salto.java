/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13salto;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13Salto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        int valor_inicial;
        int salto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon valor inicial");
        valor_inicial = sc.nextInt();
        System.out.println("Pon salto");
        salto = sc.nextInt();
        valores[0] = valor_inicial;
        
        //Opcion 1
        for (int i = 1; i < valores.length; i++) { //començo per la segona posició del array
            valores[i] = valores[i-1] + salto; //pregunto la posició anterior del array i li sumo salt
        }
        mostrarArray(valores);
        //Opcion 2
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valor_inicial + salto*i; 
        }
        mostrarArray(valores);
        //Opcion 3
        int acum = valor_inicial; //variable acumulativa
        for (int i = 0; i < valores.length; i++) {
            valores[i] = acum;
            acum += salto; //acumulo valor
        }
        mostrarArray(valores); 
    }

    private static void mostrarArray(int[] primero) {
        for (int i = 0; i < primero.length; i++) {
            System.out.print(primero[i]);
            if (i < primero.length-1)
            { //para no pintar el ultimo guin
                System.out.print("-");
            }
        }
        System.out.println("");
    }
    
}
