/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex12 {

    /**
     *  Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla.
* pedir valores A y B
* repetir B veces en el bucle
* multiplicar A , B veces
     */
    public static void main(String[] args) {
        int A, B; //base, exponente
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor de A");
        A = sc.nextInt();
        System.out.println("Pon el valor de B");
        B = sc.nextInt();
        int resultAcum=1;
        int contador=1;
//        do
//        {
//            resultAcum = resultAcum*A;
//            contador = contador + 1;
//        }while(contador<=B);
        contador=1;
        while(contador<=B)
        {
            resultAcum = resultAcum*A;
            contador = contador  + 1;
        }
        
//        for (contador = 1; contador <= B; contador++) 
//        {
//            resultAcum = resultAcum*A;
//            //System.out.println(resultAcum);
//        }
        System.out.println("El resultado es " + resultAcum);
    }
    
}
