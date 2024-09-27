/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leercaracter;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class LeerCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una letra");
        letra = sc.next().charAt(0); //recoge la priemra letra 
        
        if (letra == 'a'
            || letra == 'e'
            || letra == 'i'
            || letra == 'o'
            || letra == 'u')
        {
            System.out.println("Vocal");
        }
        else
        {
            System.out.println("Consonante");
        }
    }
    
}
