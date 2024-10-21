/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int edad = pedirEdad();
        
        boolean adulto = esMayorEdad(edad);
        
        InformarSiEresAdulto(adulto);
        
    }
    
    
        /**
     * Función que pide al usuario un valor 
     * @return valor introducido
     */
    public static int pedirEdad()
    {
        int valor;
         Scanner sc = new Scanner(System.in);
         do{
            System.out.print("Pon tu edad: ");
            valor = sc.nextInt();
         //}while(!(valor>0));
         }while(valor<=0);
        
         return valor;
    }
    
    /**
     * / Devuelve verdadero si a>=18, falso en caso contrario
     * @param a
     * @return true si es mayor de edad
     */
    
    public static boolean esMayorEdad(int edad)
    {
        if (edad>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void InformarSiEresAdulto(boolean adulto)
    {
        if (adulto) //adulto == true
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres menor de edad");
        }
    }
}
