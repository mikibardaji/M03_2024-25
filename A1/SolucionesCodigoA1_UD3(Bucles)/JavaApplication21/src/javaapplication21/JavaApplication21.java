/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author mabardaji
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=1;
       // WHILE
        System.out.println("while");
        while(contador <=20)
        {
            System.out.println(contador);
            contador = contador + 1;
        }
      // do while
      System.out.println("do while");
      contador = 1;
        do
        {
           System.out.println(contador);
            contador = contador + 1;            
        }while(contador<=20);
      //  int contador;
      System.out.println("for");
        for (contador = 1; contador<=20; contador=contador+1) {
              System.out.println(contador);
        }
    }
    
}
