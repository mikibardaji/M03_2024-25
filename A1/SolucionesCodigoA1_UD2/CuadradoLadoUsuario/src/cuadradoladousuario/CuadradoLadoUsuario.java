/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradoladousuario;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CuadradoLadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        int area;
        //int lado,area;
        //Variable teclado del tipo Scanner y con el system.in
        //lee del teclado
        Scanner teclado=new Scanner(System.in);
        //Scanner sc
        System.out.println("Pon la medida del lado del cuadrado");
        //lo que ponga el usuario lo guardo en lado
        lado = teclado.nextInt();
        //System.out.println("has introducido --> " + lado);
        
        area = lado * lado;
        System.out.println("La area del cuadrado es " + area);
    }
    
}
