/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_1_200_suma1;

/**
 *
 * @author mabardaji
 */
public class Ex3_1_200_suma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int contador = 1;
        final int  NUMERO = 10;
        while (contador <= NUMERO)
        {
            if (contador %2 ==0)
            {
                System.out.println(contador);
            }
            contador = contador + 1; //FORA DEL IF
        }
        
        contador = 1;
        do
        {
            if (contador %2 ==0)
            {
                System.out.println(contador);
            }
            contador = contador + 1; //FORA DEL IF
        }while(contador<= NUMERO);
        
        for(contador=1;contador<=NUMERO;contador++)
        {
            if (contador %2 ==0)
            {
                System.out.println(contador);
            }
        }
        
        
        
    }
    
}
