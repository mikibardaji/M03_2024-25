/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydescendiente;

import java.util.Arrays;

/**
 *
 * @author mabardaji
 */
public class ArrayDescendiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cadenatotal = {3,26,9,33,37,19};
        
        
        //desplazar todo a la derecha
        Arrays.sort(cadenatotal);
        int[] cadenaDescendiente  = new int[cadenatotal.length];
        
        int index = 0;
        for (int i = cadenatotal.length-1; i >= 0; i--) {
            cadenaDescendiente[index] = cadenatotal[i];
            index++;
        }
        
        //para poner la misma cadena descendiente
        int index2=0;
        for (int i = cadenatotal.length; i >= (cadenatotal.length/2); i--) {
            int temp = cadenatotal[i];
            cadenatotal[i] = cadenatotal[index2];
            cadenatotal[index2] = temp;
        }
        
        
        
    }
    
}
