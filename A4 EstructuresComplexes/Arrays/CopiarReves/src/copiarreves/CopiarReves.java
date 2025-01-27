/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiarreves;

import java.util.Random;

/**
 * . Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.

 * @author mabardaji
 */
public class CopiarReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primero = new int[5];
        int[] inverso = new int[5];
        
        llenarArray(primero);
        mostrarArray(primero);
        System.out.println("------------------");
        copiarInversa(primero, inverso);
        mostrarArray(inverso);
        
    }

    private static void llenarArray(int[] primero) {
        Random rd = new Random();
        for (int i = 0; i < primero.length; i++) {
            primero[i] = rd.nextInt(1, 101);
        }
    }

    private static void mostrarArray(int[] primero) {
        for (int i = 0; i < primero.length; i++) {
            System.out.println(primero[i]);
        }
    }

    private static void copiarInversa(int[] primero, int[] inverso) {
        int index = 0;
//        for (int i = primero.length-1; i >= 0; i--) {
//            inverso[index] = primero[i];
//            index++;
//        }
        
        
        for (int i = primero.length-1; i >= 0; i--) {
            index = (primero.length -1) - i;
            inverso[index] = primero[i];
            
        }
    }
    
}
