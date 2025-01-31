/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3arrays;

import java.util.Scanner;

/**
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 * @author mabardaji
 */
public class Ex3Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre1 = inputNombre("Introduce nombre 1: "); 
        String nombre2 = inputNombre("Introduce nombre 2: "); 
        String nombre3 = inputNombre("Introduce nombre 3: ");
        
        
        //Opción 1: recortar cada uno en 3 posiciones con metodo
        nombre1 = nombre1.substring(0, 3);
        nombre2 = nombre2.substring(0,3);
        nombre3 = nombre3.substring(0,3);
        
        
        //Opcion 2: recortar cada uno en 3 posiciones recorriendo letra a letra
        String recorte1="";
        for (int i = 0; i < 3; i++) {
            recorte1 = recorte1 + nombre1.charAt(i);
        }
        System.out.println("recorte1 " + recorte1);
        String recorte2="";
        for (int i = 0; i < 3; i++) {
            recorte2 = recorte2 + nombre1.charAt(i);
        }
        System.out.println("recorte2 " + recorte2);
        String recorte3="";
        for (int i = 0; i < 3; i++) {
            recorte3 = recorte3 + nombre1.charAt(i);
        }
        System.out.println("recorte3 " + recorte3);
        //pasarlo a mayuscula
        String nombreTotal = nombre1+nombre2+nombre3; //recorte1+recorte2+recorte3
        System.out.println(nombreTotal.toUpperCase());
        
        
        
        
    }

    private static String inputNombre(String frase) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(frase);
        String respuesta = scanner.next(); //una palabra
        return respuesta;
    }
    
}
