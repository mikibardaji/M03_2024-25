/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14plenararray;

import java.util.Arrays;

/**
 *
 * @author mabardaji
 */
public class Ex14PlenarArrayFill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tamany array es la suma de tots els valores
        int tamany = 0;
        for (int i = 1; i <= 10; i++) {
            tamany += i;
        }

        // Creem el tamany 
        int[] valores = new int[tamany];

        
        int index = 0;
        for (int i = 1; i <= 10; i++) { // Desde 1 fins 10 
            for (int j = 0; j < i; j++) { // fiquem el valor i , i cops
                Arrays.fill(valores, index,++index,i);
            }
        }

        int index2=0;
        for (int i = 1; i <= 10; i++) { // Desde 1 fins 10 
                Arrays.fill(valores, index2,index2+i,i);
                index2 = index2+i;
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
