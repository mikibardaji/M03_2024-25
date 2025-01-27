/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex18;

import java.util.Arrays;
import java.util.Random;

/**
 * . Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre
0 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla.
 * @author mabardaji
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un array con 100 números enteros aleatorios entre 1 y 100
        int[] lista = new int[10];
        crearArrayAleatorio(lista);
        // Mostrar el contenido del array
        mostrarArray(lista);
        
        
        Arrays.sort(lista);
        mostrarArray(lista);
        
        
        
        
        mostrarArrayDescendiente(lista);
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
    
    
    // Función para mostrar el contenido de un array
    public static void mostrarArrayDescendiente(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = array.length-1 ; i>0;i--) {
            System.out.print(array[i]);
            if (i < array.length-1)
            {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    
    // Función para crear un array de números enteros aleatorios entre 1 y 100
    public static void crearArrayAleatorio(int[] lista) {
        Random random = new Random();
       
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(1000,2800) + 1; // Generar números entre 1 y 100
        }
    }
}
