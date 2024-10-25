/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio_sin_iva = pedirValor();
        double precio_final = precioConIVA(precio_sin_iva);
        System.out.println("Precio final-->" + precio_final);
        
    }
    
    
    /**
     * Devuelve el precio tras sumarle un 21% de IVA
     * @param precio precio entrada sin iva
     * @return precio aplicado iva
     */
    public static double precioConIVA(double precio)
    {
        final double IVA = 0.21;     //final double IVA = 0.21;
        double iva_producto = precio * IVA; //double iva_producto = precio * IVA;
        double precio_total = precio + iva_producto;
        return precio_total;
    }
    
    /**
     * Función que pide al usuario un valor 
     * @return valor introducido
     */
    public static double pedirValor()
    {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon precio : ");
        valor = sc.nextDouble();
        return valor;
    }

}
