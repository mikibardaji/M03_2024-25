/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16_notas;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex16_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer calificación numérica
        System.out.print("Ingrese la calificación (0 a 10): ");
        double nota = scanner.nextDouble();
        
        if (nota>=0 && nota<3)
        {
            System.out.println("Muy deficiente");
        }
        else if (nota>=3 && nota <5)
        {
            System.out.println("Insuficiente");
        }
        else if (nota>=5 && nota <6)
        {
            System.out.println("Bien");
        }
        else if (nota>=6 && nota <9)
        {
            System.out.println("Notable");
        }
        else if (nota>=9 && nota <10)
        {
            System.out.println("Excelente");
        }
        else if (nota<0  ||  nota>10) //OR solo hace falta una condicion cierta para entrar
        {
            System.out.println("nota invaldia");
        }
    }
    
}
