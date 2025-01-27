/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desplazarderecha;

/**
 *
 * @author mabardaji
 */
public class DesplazarDerecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cadenatotal = {3,26,9,33,37,19};
        
        int pos;
        int valor_i_mas_1;
        for (int i = 0; i < cadenatotal.length; i++) {
            pos = i+1;
            valor_i_mas_1 = cadenatotal[pos]; //guardaria el 26
            cadenatotal[pos] = cadenatotal[i];
        }
        
        int ultimo = cadenatotal[cadenatotal.length-1];
        for (int i = cadenatotal.length-1; i > 0; i--) {
            cadenatotal[i] = cadenatotal[i-1];
        }
        
        cadenatotal[0] = ultimo;
        
        
    }
    
}
