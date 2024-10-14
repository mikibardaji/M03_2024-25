/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     * Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
*   * Leer notas hasta poner -1 (bucle)
*   * Detectar un 10 (condicional)
* 
     */
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        boolean es10=false;
        do
        {
            System.out.println("pon una nota");
            nota = sc.nextInt();
            if (nota==10)
            {
                es10=true;
            }
            System.out.println(nota);
        }while(nota!=-1); //termine nota==-1
        
        if (es10==true) // if (es10)
        {
            System.out.println("Has puesto un 10");
        }
        else
        {
            System.out.println("no has sacado ningun 10");
        }
    }
    
}
