/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17;

import java.util.Arrays;
/**
 *
 * @author mabardaji
 */
public class EX17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cadenatotal = {3,6,9,3,7,9};
        int[] cadena3 = new int[3];
        for (int i = 0; i < cadena3.length; i++) {
            cadena3[i] = cadenatotal[i];
        }
      int[] cadena1 = Arrays.copyOf(cadenatotal, 3);
      
      int[] cadena2 =  Arrays.copyOfRange(cadenatotal, 3, cadenatotal.length);
      
      
      if(Arrays.equals(cadena1, cadena2))
      {
          System.out.println("iguales");
      }
      else
      {
          System.out.println("Diferentes");
      }
          
    }
    
}
