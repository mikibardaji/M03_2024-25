/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

    /**
     * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
     */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura = pedirValorPositivo("Pon la altura del rectangulo: ");
        double base = pedirValorPositivo("Pon la base del rectangulo: ");
        
        double peri = perimetroRectangulo(base, altura);
        double area = areaRectangulo(base, altura);
        System.out.println("perimetro " + peri);
        System.out.println("area " + area);
    }



    public static double pedirValorPositivo(String frase)
    {
        double valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(frase);
        valor = sc.nextDouble();
        }while(valor<=0);
        return valor;
    }
    
    public static double perimetroRectangulo(double ancho, double alto)
    {
        double perimetro = (ancho*2) + (alto*2);
        return perimetro;
    }
    
    public static double areaRectangulo(double ancho, double alto)
    {
        double area = ancho*alto;
        return area;
    }
    

    
}
