/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9;

/**
 *
 * @author mabardaji
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont=0, ac_suma=0, ac_prod=1;
       
       
        for (cont = 1; cont <= 10; cont++) 
            {
                ac_suma = ac_suma + cont;
                ac_prod = ac_prod * cont;
            }
        
        
        System.out.println("El resultado de sumar los numeros del 1 a l0 es " + cont);
        System.out.println("El resultado de multiplicar los numeros del 1 a l0 es " + ac_prod);
    }
    
}
