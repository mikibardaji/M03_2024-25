/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraynumerosaleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ArrayNumerosAleatorios {

    public static void main(String[] args) {
        // Crear un array con 100 números enteros aleatorios entre 1 y 100
        int[] lista = new int[10];
        crearArrayAleatorio(lista);
        // Mostrar el contenido del array
        mostrarArray(lista);
        // Pedir al usuario un valor entero R
        int r = pedirValorEntero("Introduce un valor entero (R): ");

        // Contar cuántos valores del array son iguales o superiores a R
        int superiores = contarValoresMayores(lista, r);
        int inferiores = contarMenores(lista, r);

        // Mostrar el resultado
        System.out.println("Superiores a " + r + ": " + superiores);
        System.out.println("Inferiores a " + r + ": " + inferiores);
    }

    // Función para crear un array de números enteros aleatorios entre 1 y 100
    public static void crearArrayAleatorio(int[] lista) {
        Random random = new Random();
       
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(100) + 1; // Generar números entre 1 y 100
        }
    }

    // Función para pedir un valor entero por teclado
    public static int pedirValorEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Función para contar cuántos valores del array son iguales o superiores a R
    public static int contarValoresMayores(int[] lista, int r) {
        int contador = 0;
        for (int valor : lista) {
            if (valor > r) {
                contador++;
            }
        }
        return contador;
    }
    
    // Función para contar cuántos valores del array son iguales o superiores a R
    public static int contarMenores(int[] lista, int r) {
        int contador = 0;
        for (int valor : lista) {
            if (valor < r) {
                contador++;
            }
        }
        return contador;
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
    
}
