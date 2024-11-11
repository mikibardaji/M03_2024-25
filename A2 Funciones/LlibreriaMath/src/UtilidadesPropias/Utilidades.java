/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilidadesPropias;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Utilidades {
    
    /**
     * Pide valor al usuario y lo devuelve sin validar nada mas
     * @param frase Que mostrara al usuario entero
     * @return valor introducido
     */
    public static int pedirValorEntero(String frase){
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        valor = sc.nextInt();
        return valor;
    }

    /**
     * Pide valor al usuario y lo devuelve sin validar nada mas
     * @param frase Que mostrara al usuario entero
     * @return valor introducido double
     */
    public static double pedirValorDouble(String frase){
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        valor = sc.nextDouble();
        return valor;
    }

    public static int pedirValorEnteroPositivo(String frase){
        int valor;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(frase);
            valor = sc.nextInt();
            if (valor<=0)
            {
                System.out.println("El numero debe ser positivo");
            }
        }while(valor<=0);
        
        return valor;
    }
    
    public static int pedirValorEnteroEntreDosValores(String frase, int min, int max){
         int valor;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(frase);
            valor = sc.nextInt();
            if (valor<min || valor>max)
            {
                System.out.println("El valor debe de estar entre " + min + "- " + max);
            }
        }while(valor<min || valor>max);
        
        return valor;
    }
    
    /**
     * te va a dar un aleatorio entre el valor minimo y el maximo incluidos
     * @param min el minino que genera el aleatorio
     * @param max
     * @return 
     */
    public static int aleatorio(int min, int max)
    {
        int x;
        if (min >max)
        {
            x= min;
            min = max;
            max = x;
        }
        Random rd = new Random();
        int valor = rd.nextInt(min, max+1);
        return valor;
    }
    
}
