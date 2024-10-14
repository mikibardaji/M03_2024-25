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
     * 1. Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas
*           *encontrar los pares y sumarlos
*           *encontrar los impares y sumarlos
*           *ir de 100 a 200 (*)
     * 
     * 
     */
    public static void main(String[] args) {
        int par=0, impar=0;
        
        for (int num = 100; num <= 200; num++) {
            //System.out.println(num);
            if (num%2==0)
            { //par
                par = par + num; //par += num; 
               //par += num;
            }
            else //if (num%2 !=0)
            {
                impar = impar + num; //impar += num;
                //impar = +num;
            }
        }
        
        System.out.println("Pares sumados " + par);
        System.out.println("Impares sumados " + impar);
    }
    
}
