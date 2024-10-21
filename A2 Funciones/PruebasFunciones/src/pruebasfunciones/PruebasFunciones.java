/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasfunciones;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PruebasFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*imprimeHolaMundo();
        int num=3;
        imprimeHolaMundoVariasVeces(num);
        System.out.println("variable num main " + num);
        num=9;
        System.out.println("variable num main " + num);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor y te mostrare hola mundo el triple de veces");
        int valor = sc.nextInt();
        int result = triple(valor);
        //System.out.println("El triple es " + result);
        imprimeHolaMundoVariasVeces(result);

    }
    
    public static void imprimeHolaMundo()
    {
        System.out.println("Hola Mundo en función");
    }
    
    public static void imprimeHolaMundoVariasVeces(int num)
    {
        for (int i = 1; i <= num; i++) 
        {
            System.out.println("Hola Mundo en función linea " + i);
        }
//        System.out.println("variable num imprimeHolaMundoVariasVeces " + num);
//        num=3;
//        System.out.println("variable num imprimeHolaMundoVariasVeces " + num);
                
    }
    
    public static int triple(int valor)
    {
        int resultado = valor * 3;
        return resultado;
    }
   
    
}
