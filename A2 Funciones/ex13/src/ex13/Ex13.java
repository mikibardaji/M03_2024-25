/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13;

import java.util.Scanner;

/**
 *
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precio = pedirValor("Precio sin Descuento: ");
        int precio_descuento = pedirValor("precio con descuento: ");
        
        double descuento = calcularDescuento(precio, precio_descuento);
        
        System.out.println("Tu descuento es : " + descuento + "%");
    }
    
    
    public static double calcularDescuento(int precio, int precio_descuento)
    {
        double descuento = (double)(precio_descuento*100)/precio;
        descuento = 100 - descuento;
        return descuento;
    }
    
    public static int pedirValor(String frase)
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        valor = sc.nextInt();
        return valor;
    } 
}
