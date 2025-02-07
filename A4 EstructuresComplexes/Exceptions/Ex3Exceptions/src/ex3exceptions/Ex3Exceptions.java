/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3exceptions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Exceptions {

    /**
     * Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un
bucle, pida 6 valores por teclado y los introduzca en el vector. Tendrás que manejar la/las
posibles excepciones y incluyendo cuando pida el 6º numero, que no debe insertarlo, pero
si controlar la excepción cuando lo intente insertar en el vector.
     */
    public static void main(String[] args) {
        
        //exercici3Estandard();
        double[] valores = new double[5];
        Scanner sc = new Scanner(System.in);
        int posicion;
        double valor;
        do
        {
            System.out.println("Pon la posición del array donde quieres poner el valor");
            posicion = sc.nextInt();
            System.out.println("Pon el valor que quieres introducir en el array");
            valor = sc.nextDouble();
            try
            {
            if (valor!=-1)
            {
                valores[posicion] = valor;
            }
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Posicion no valida para el array que tiene " + valores.length+
                         " posiciones. ");
            }
        }while(valor!=-1);    
         
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        
        
    }

    private static void exercici3Estandard() {
        double[] valores = new double[5];
        Scanner sc = new Scanner(System.in);
        try
        {
        for (int i = 0; i < 6; i++) {
            System.out.println("Pon un valor para poner en el array");
            valores[i] = sc.nextDouble();
        }
        }catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Posición no valida en el array");
            System.out.println(ex.getMessage());
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
    
}
