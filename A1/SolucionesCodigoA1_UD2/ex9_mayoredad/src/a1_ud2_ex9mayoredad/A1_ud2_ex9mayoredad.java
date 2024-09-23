/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1_ud2_ex9mayoredad;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class A1_ud2_ex9mayoredad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int edad;
        System.out.println("Que edad tienes?");
        edad = teclado.nextInt();
        
//        if (edad>=18)
//        { //SI
//            System.out.println("Eres mayor de edad");
//        }
//        else
//        { //SINO
//            System.out.println("Eres menor de edad");
//        }
        //version 2 detectando negativos
        if (edad>=18)
        { //SI
            System.out.println("Eres mayor de edad");
        }
        else if (edad>=0)
        { //SINO
            System.out.println("Eres menor de edad");
        }
        //else //opcion negativa
        else if (edad<0)
        {
            System.out.println("Edad no valida");
        }
        
        
        
    }
    
}
