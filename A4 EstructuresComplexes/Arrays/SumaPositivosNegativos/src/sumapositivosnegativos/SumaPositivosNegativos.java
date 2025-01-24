/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumapositivosnegativos;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SumaPositivosNegativos {

 public static void main(String[] args) {
        // Crear un array para almacenar los números
        int[] numeros = new int[5];

        // Llenar el array con los valores introducidos por el usuario
        llenarArray(numeros);

        // Calcular y mostrar las sumas de positivos y negativos
        calcularSumaPositivosYNegativos(numeros);
    }

    // FunciÃ³n para llenar el array con 20 valores introducidos por teclado
    public static void llenarArray(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

    }

    // FunciÃ³n para calcular y mostrar la suma de positivos y negativos
    public static void calcularSumaPositivosYNegativos(int[] numeros) {
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) 
        {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }
        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Suma de los números positivos: " + sumaPositivos);
        System.out.println("Suma de los números negativos: " + sumaNegativos);
    }
    
}
