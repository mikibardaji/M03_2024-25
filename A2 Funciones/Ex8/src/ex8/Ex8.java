/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

import java.util.Scanner;

/**
Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = pedirValorPositivo("Pon un valor");
        int suma = suma1aN(valor);
        System.out.println("La suma de 1 a "+ valor + " es " + suma );
        int producte = producto1aN(valor);
        System.out.println("El producto de 1 a "+ valor + " es " + producte );
        double mitad = intermedio1aN(valor);
        System.out.println("La mitad es "+ mitad);
    }
    
    
    public static int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    {
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }
    
    public static int producto1aN(int n)
    {
       int producto=1; 
        for (int i = 1; i <= n; i++) {
            producto = producto * i;
        }
        return producto;
    }
    
    public static  double intermedio1aN(int n)
    {
        double mitad = 1;
        mitad = (double)(1+n)/2;
        return mitad;
    }
    
    public static int pedirValorPositivo(String frase)
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(frase);
        valor = sc.nextInt();
        }while(valor<=0);
        return valor;
    }
    
}
