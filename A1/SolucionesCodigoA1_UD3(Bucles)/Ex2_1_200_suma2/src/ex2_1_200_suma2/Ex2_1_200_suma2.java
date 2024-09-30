/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_1_200_suma2;

/**
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello
utiliza un contador y suma de 2 en 2
 * @author mabardaji
 */
public class Ex2_1_200_suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 2;
        final int  NUMERO = 200;
        while (contador <=NUMERO)
        {
            System.out.println(contador);
            contador = contador + 2;
        }
        
        contador=2;
        do
        {
            System.out.println(contador);
            contador = contador + 2;
        }while(contador<=NUMERO);
        
        
        for(contador=2;contador<=NUMERO;contador = contador +2)
        {
            System.out.println(contador);
        }
    }
    
}
