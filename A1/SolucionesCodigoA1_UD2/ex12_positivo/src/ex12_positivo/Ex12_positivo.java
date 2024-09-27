/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12_positivo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex12_positivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
         Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero: ");
        x = scanner.nextInt();
        
        
        if (x>=0)
        {
            System.out.println("Positivo");
        }
        else
        {
            System.out.println("Negativo");
        }
    }
    
}
