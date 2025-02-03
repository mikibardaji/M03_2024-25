/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3bidimensionals;

import java.util.Random;

/**
 *  *  Crea un programa que cree una matriz de tamaño NxM iunicializar con aleatorios. Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
 * @author mabardaji
 */
public class Ex3Bidimensionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] valores = new int[3][4];
        
        
        inicializarAleatorios(valores);
        mostrarValores(valores);
        contarPositivosNegativos(valores);
    }
    
    
    private static void mostrarValores(int[][] valores) {
        for (int fila = 0; fila <valores.length; fila++) {
            for (int colum = 0; colum < valores[fila].length; colum++) {
                System.out.format("%02d ",valores[fila][colum]);
                //System.out.print(valores[fila][colum] + " "); //array de una dimensio amb la fila fixa (sense canviar)
            }
            System.out.println("");
        }
    }

    private static void inicializarAleatorios(int[][] valores) {
        Random rd = new Random();
        
        for (int fila = 0; fila <valores.length; fila++) {
            for (int colum = 0; colum < valores[fila].length; colum++) {
                    valores[fila][colum] = rd.nextInt(-50, 51);
                
            }    
        }
    }

    private static void contarPositivosNegativos(int[][] valores) {
        int positivos=0;
        int negativos=0;
        int cero= 0;
        for (int fila = 0; fila <valores.length; fila++) {
            for (int colum = 0; colum < valores[fila].length; colum++) {
                if (valores[fila][colum]>0)
                {
                    positivos++;
                }
                else if (valores[fila][colum]<0)
                {
                    negativos++;
                }
                else
                {
                    cero++;
                }   
            }
            }
        System.out.println("Positivos : " + positivos);
        System.out.println("Negativos "+ negativos);
        System.out.println("Ceros: " + cero);
    }
}
