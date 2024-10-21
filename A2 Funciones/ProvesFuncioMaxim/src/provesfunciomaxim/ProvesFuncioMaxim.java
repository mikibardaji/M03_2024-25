/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesfunciomaxim;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProvesFuncioMaxim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1,v2,max,v3,v4;
       
        
        v1 = pedirValorPositivo(1);
        v2 = pedirValorPositivo(2);
        v3 = pedirValorPositivo(3);
        v4 = pedirValorPositivo(4);
        

        max = maximo(v1, v2);
        max = maximo(v3, max);
        max = maximo(v4, max);
        System.out.println("El maximo de los 3 numeros es " + max);
        
//        if (v1>v2)
//        {
//            max = v1;
//        }
//        else
//        {
//            max = v2;
//        }
//        
//        if (max<v3)
//        {
//            max=v3;
//        }
//        
//        if (max<v4)
//        {
//            max=v4;
//        }
        
        

    }
    
    
    /**
     * funcion que devuelve el numero mas grande
     * @param num1 primer numero a comparar
     * @param num2 segudo numero a comparar
     * @return el valor mas grande
     */
    public static int maximo(int num1, int num2)
    {
        if (num1>num2)
        {
            return num1;
        }
        else //if (num1<=num2)
        {
            return num2;
        }
    }
    
    /**
     * Función que pide al usuario un valor 
     * y fuerza que sea positivo si no, vuelve a pedirlo
     * @return valor positivo
     */
    public static int pedirValorPositivo(int order)
    {
        int valor;
         Scanner sc = new Scanner(System.in);
         do{
            System.out.print("Pon un valor positivo (>0) para el valor "+ order + ": ");
            valor = sc.nextInt();
         //}while(!(valor>0));
         }while(valor<=0);
        
         return valor;
    }
    
}
