/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydesdephastaq;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ArrayDesdePHastaQ {

    public static void main(String[] args) {
        // Pedir los valores de P y Q al usuario
        int p = pedirValor("Introduce el valor inicial (P): ");
        int q = pedirValor("Introduce el valor final (Q): ");

        int max = Math.max(p, q);
        int min = Math.min(p, q);
        int tamaño2 = max - min + 1;
        // Crear el array que contiene los valores desde P hasta Q
        int tamaño = Math.abs(q - p) + 1; // Calcular el tamaño del array
        int[] valores = new int[tamaño];
        
        crearArrayDesdePHastaQ(min, max, valores);

        // Mostrar el contenido del array
        mostrarArray(valores);
    }

    // Función para pedir un valor entero por teclado
    public static int pedirValor(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        return valor;
    }

    // Función para crear un array que contiene todos los valores desde P hasta Q
    public static void crearArrayDesdePHastaQ(int min, int max,  int[] valores) {
 
        // Llenar el array con los valores desde P hasta Q
        for (int i = 0; i < valores.length; i++) {
            valores[i] = min;
            min++;
        }

    }

    // Función para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        System.out.println("Contenido del array:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
