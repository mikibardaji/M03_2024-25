/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Introduce numero a: ");
         a = scanner.nextInt();
         System.out.print("Introduce numero b: ");
         b = scanner.nextInt();
         
         
         if (a>b)
         {
             System.out.println(a + " es mayor que " + b);
         }
         else 
         {
             System.out.println(b + " es mayor que " + a);
         }
    }
    
}
