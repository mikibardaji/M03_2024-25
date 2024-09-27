/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int edad;
        // Leer un n?mero entero
        System.out.print("Ingrese su edad: ");
         edad = scanner.nextInt();
         
         if (edad>=18)
         {
             System.out.println("Eres mayor de edad");
         }
         else    //if (edad >= 0 && edad<18) //AND
         {
             System.out.println("Eres menor de edad");
         }
    }
    
}
