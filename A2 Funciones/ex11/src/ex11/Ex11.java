/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

/**
 *
 * @author mabardaji
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tablaMultiplicar(6);
    }
    
    
    public static void tablaMultiplicar(int num_tabla)
    {
        int calculo;
        for (int i = 1; i <= 10; i++) {
            calculo = num_tabla*i;
            System.out.println(num_tabla+"*" + i + "=" + calculo);
        }
        
    }
}
