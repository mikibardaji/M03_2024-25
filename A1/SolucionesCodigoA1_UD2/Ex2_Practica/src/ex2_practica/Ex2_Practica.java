/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_practica;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int subscripcion, duracion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Subscripción basica(0) o premium(1)");
        subscripcion = sc.nextInt();
        System.out.println("Duracion < 12 meses)(0) + 12 meses (1)");
        duracion = sc.nextInt();
        
        switch (subscripcion) {
            case 0:
                if (duracion==0)
                {
                    System.out.println("Pagas 35 €");
                }
                else //if (duracion==1)
                {
                    System.out.println("Pagas 32 €");
                }
                break;
            case 1:
            default: //excepcionalment e nesta practica acepto la opcion en default, pero si no case 1
                if (duracion==0)
                {
                    System.out.println("Pagas 47 €");
                }
                else //if (duracion==1)
                {
                    System.out.println("Pagas 43 €");
                }
        }
    }
    
}
