/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3 {

    /**
     * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
     */
    public static void main(String[] args) {
        int v1,v2, min;
        v1 =pedirValor();
        v2 = pedirValor();
        
        min = minimo(v1, v2);
        System.out.println("El mas pequeño es " + min);

    }
    

        /**
     * Función que pide al usuario un valor 
     * @return valor introducido
     */
    public static int pedirValor()
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un valor : ");
        valor = sc.nextInt();
        return valor;
    }
    
    public static int minimo(int a, int b) 
    {
        if (a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
