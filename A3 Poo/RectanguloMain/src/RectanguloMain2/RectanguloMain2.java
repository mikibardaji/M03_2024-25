/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RectanguloMain2;

import Objetos.Articulo;
import Objetos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class RectanguloMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(0, 0, 3, 3);
        
        System.out.println("Area "+ rect.getArea());
        System.out.println(rect);
        Articulo tienda = new Articulo("Bicis", 10, 15);
        System.out.println(tienda);
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas quieres?");
        int compra = sc.nextInt();
        tienda.vender(compra);
        System.out.println("Cuantas quieres almacenar?");
        int mas_stock = sc.nextInt();
        if (tienda.almacenar(mas_stock))
        {
            System.out.println("Almacenadas");
        }
        else
        {
            System.out.println("No se pueden almacenar");
        }
        System.out.println("Te quedan " + tienda.getCuantosQuedan());
    }
    
}
