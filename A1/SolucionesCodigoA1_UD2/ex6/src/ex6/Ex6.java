/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double precioVenta, precioArticulo;
         int  diferenciaPrecio, porcentajeDescuento;
        // Solicitar el precio del art?culo
        System.out.print("Ingrese el precio del art?culo: ");
        precioArticulo = scanner.nextDouble();
        
        System.out.println("Ingrese previo venta");
        precioVenta = scanner.nextDouble();
        
        diferenciaPrecio = (int) (precioArticulo - precioVenta);
        porcentajeDescuento = (int) ( 100 - (precioVenta*100)/precioArticulo);
        
        // Mostrar resultados
        System.out.println("Diferencia de precio: " + diferenciaPrecio);
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento + "%");
    }
    
}
