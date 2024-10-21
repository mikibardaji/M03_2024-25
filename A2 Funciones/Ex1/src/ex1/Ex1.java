/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *Escribe un programa que pida dos n�meros reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la funci�n:
double multiplica(double a, double b) // Devuelve la multiplicaci�n de dos n�meros
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b, resultado;
       a = pedirValor();
       b = pedirValor();
       resultado=multiplica(a, b);
       System.out.println(a + "* " + b + "=" + resultado);
    }
    
    /**
     * // Devuelve la multiplicaci�n de dos n�meros
     * @param a
     * @param b
     * @return multiplicacion de a por b
     */
    public static double multiplica(double a, double b)
    {
        double resultado = a * b;
        return resultado;
    }
    
    /**
     * Funci�n que pide al usuario un valor 
     * @return valor introducido
     */
    public static double pedirValor()
    {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un valor : ");
        valor = sc.nextDouble();
        return valor;
    }
}
