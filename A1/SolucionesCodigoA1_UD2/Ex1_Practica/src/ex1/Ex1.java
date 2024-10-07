/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Año nacimiento");
        int anyo = sc.nextInt();
        
        if (anyo<0)
        {
            System.out.println("Edad no reconocida");
        }
        else if (anyo>=2020)
            {
                    System.out.println("Matriculate en infantil");   
            }
        else if (anyo>=2015)
        {
              System.out.println("Matriculate en primaria");  
        }
        else if (anyo>=2010)
        {
              System.out.println("Matriculate en secundaria");  
        }
       else if (anyo>=2005)
        {
              System.out.println("Matriculate en Bachillerato");  
        }
        else
       {
           System.out.println("MAtriculate en universidad");
       }
    }
    
}
