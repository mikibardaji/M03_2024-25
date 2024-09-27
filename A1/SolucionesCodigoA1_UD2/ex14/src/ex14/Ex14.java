/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int x, y;
         Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero X: ");
        x = scanner.nextInt();
         System.out.println("introduce numero Y: ");
        y = scanner.nextInt();
        
        if (x>=y)
        { //SI
            if(x==y)
            { //SI
                System.out.println("Numeros iguales");
            }
            else
            {
                System.out.println(x + " es mas grande que " + y);
            }
        }
        else
        { //NO
            System.out.println(y + " es mas grande que " + x);
        }
    }
    
}
