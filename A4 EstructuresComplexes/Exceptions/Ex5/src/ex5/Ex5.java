/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Implementa un programa con tres funciones:
? void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
? void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
? La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con
distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las
funciones, etc. Maneja las posibles excepciones.
 * @author mabardaji
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            imprimePositivo(5);
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
        try
        {
            imprimePositivo(-5);
        } catch (Exception ex) {
               System.out.println(ex.getMessage());
        }
        try
        {
            imprimeNegativo(15);
               } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
        try
        {
            imprimeNegativo(-15);
        } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
    }

    private static void imprimePositivo(int i) throws Exception {
        if (i>0)
        {
            System.out.println("Positivo " + i);
        }
        else
        {
            throw new Exception("El numero no es positivo " + i);
        }
        
    }

    private static void imprimeNegativo(int i) throws Exception{
         if (i<0)
        {
            System.out.println("Negativo " + i);
        }
        else
        {
            throw new Exception("El numero no es negativo " + i);
        }
    }
    
}
