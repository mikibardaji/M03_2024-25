/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4bcontarletrasfrase;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4bContarLetrasFrase {

    /**
     * Desenvolupeu un programa que escriguis una frase i conti quantes vegades surt cada lletra.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = inputNombre("Introduce frase: "); 
        
        char[] letras = new char[frase.length()]; //por si todas son diferentes
        int[] cont_letras = new int[letras.length]; //tiene que haber todo a 0
        
        //inicializo los arrays a espacios y a 0
        for (int i = 0; i < letras.length; i++) {
            letras[i] = ' '; //espacios
            cont_letras[i]  =0;
        }
        frase = frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            //charat //recorro letra a letra
            char letra_buscada = frase.charAt(i);
            //System.out.println(letra_buscada);
            if (letra_buscada!= ' ')
            {
//                int posicion_letra = encontrarLetra(letras, letra_buscada);
//                //posicion letra la que sea 
//                //si existia aumento el contador
//                cont_letras[posicion_letra]++;
//                letras[posicion_letra] = letra_buscada;
                int posicion_letra = encontrarEscribirLetra(letras, letra_buscada);
                //posicion letra la que sea 
                //si existia aumento el contador
                cont_letras[posicion_letra]++;
            }
            
        }
        
        //mostrar resultados
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != ' ')
            {
                System.out.println(letras[i] + " - " + cont_letras[i]);
            }
        }
        
       
    }

    private static String inputNombre(String frase) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(frase);
        String respuesta = scanner.nextLine(); //una palabra
        return respuesta;
    }

    /**
     * busca la letra charAt en el array de char's
     * cuando la encuentre devuelvo la posicion, 
     * si encuentro un espacio deveuvla esa posicion porqeu ya no existia
     * @param letras
     * @param letraBuscada
     * @return 
     */
    
    private static int encontrarLetra(char[] letras, char letraBuscada) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i]==letraBuscada)
            { //ya existe
                return i; //posicion donde esta la letra
            }
            if (letras[i] == ' ') //he llegado y no he encontrado la letra
            {
                return i;
            }
        }
        return -1;
    }
    
    private static int encontrarEscribirLetra(char[] letras, char letraBuscada) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i]==letraBuscada)
            { //ya existe
                return i; //posicion donde esta la letra
            }
            if (letras[i] == ' ') //he llegado y no he encontrado la letra
            {
                letras[i] = letraBuscada;
                return i;
            }
        }
        return -1;
    }    
    
 
}
