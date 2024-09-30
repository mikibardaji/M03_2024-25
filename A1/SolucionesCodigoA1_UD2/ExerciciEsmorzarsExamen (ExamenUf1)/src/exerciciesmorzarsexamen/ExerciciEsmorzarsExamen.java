/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciesmorzarsexamen;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExerciciEsmorzarsExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char tipoDia;
        int tipoAlmuerzo;
         Scanner sc = new Scanner(System.in);
         System.out.println("Tipo dia (L/S/F)");
         tipoDia = sc.next().charAt(0);
         System.out.println("tipo almuerzo(1/2) ");
         tipoAlmuerzo = sc.nextInt();
         
        switch (tipoDia) {
            case 'L':
            case 'l':
                if (tipoAlmuerzo==1)
                {
                    System.out.println("Precio 2€ ");
                }
                else //else if (tipoAlmuerzo==2)
                {
                    System.out.println("Precio 2,5€ ");
                }
                break;
            case 'S':
            case 's':
                if (tipoAlmuerzo==1)
                {
                    System.out.println("Precio 2,2€ ");
                }
                else //else if (tipoAlmuerzo==2)
                {
                    System.out.println("Precio 2,7€ ");
                }
                break;
            case 'F':
            case 'f':  
                 if (tipoAlmuerzo==1)
                {
                    System.out.println("Precio 2,3€ ");
                }
                else //else if (tipoAlmuerzo==2)
                {
                    System.out.println("Precio 2,8€ ");
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
         
    }
    
}
