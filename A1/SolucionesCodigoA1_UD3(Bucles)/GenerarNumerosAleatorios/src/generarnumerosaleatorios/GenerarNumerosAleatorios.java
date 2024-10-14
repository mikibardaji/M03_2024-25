/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generarnumerosaleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class GenerarNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int aleatorio, minimo, maximo;
        System.out.println("pon valor minimo");
        minimo = sc.nextInt();
        System.out.println("pon valor maximo");
        maximo = sc.nextInt();
        maximo = maximo + 1;
        for (int i = 1; i <= 15; i++) 
        {
            aleatorio = rd.nextInt(minimo, maximo);
            System.out.println(aleatorio);
        }
            
    }
    
}
