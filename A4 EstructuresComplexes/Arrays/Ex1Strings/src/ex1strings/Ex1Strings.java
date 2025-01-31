/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1strings;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine(); //next() //1er espacio o enter nextLine es hasta el enter
        
        mostrarVertical(frase);
      
    }

    private static void mostrarVertical(String frase) {
         for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }
    
}
