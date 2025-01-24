/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayinicializado;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ArrayInicializado {

    public static void main(String[] args) {
        // Pedir los valores de N y M al usuario
        int n = pedirValor("Introduce el tamaño del array (N): ");
        int m = pedirValor("Introduce el valor a rellenar (M): ");

        // Crear y llenar el array con el valor M
        int[] array = new int[n];
        crearYllenarArray(m, array);
        
        // Mostrar el contenido del array
        mostrarArray(array);
    }

    // Función para pedir un valor entero por teclado
    public static int pedirValor(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        return valor;
    }



    // Función para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i<array.length;i++) {
            System.out.print(array[i]);
            if (i < array.length-1)
            {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    private static void crearYllenarArray(int m, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = m;
        }
    }
    
}
