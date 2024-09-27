/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma,resta,multi,divi;
        // Leer los dos n?meros como enteros
        System.out.print("Ingrese el primer n?mero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo n?mero: ");
        int numero2 = scanner.nextInt();
        
         // Calcular suma, resta y producto
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        
        
         // Mostrar resultados de suma, resta y producto
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + multi);         
        if (numero2!=0) //diferente != en ordinograma <>
        {
            divi = numero1/numero2;
            System.out.println("Division --> " + divi);
        }
        else
        {
            System.out.println("No se puede dividir por 0");
             // Mostrar resultados de suma, resta y producto
        }
        

        
    }
    
}
