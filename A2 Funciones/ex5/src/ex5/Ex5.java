/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas = pedirValor();
        double km = millas_a_kilometros(millas);
        mostrarResultado(km); 
    }
    
    public static double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
    {
        final double KM_MILLAS = 1.6;
        return millas * KM_MILLAS;
    }
    
    public static int pedirValor()
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon millas y transformare a km : ");
        valor = sc.nextInt();
        return valor;
    }

    public static void mostrarResultado(double km) {
        System.out.println("en km son " + km);
    }
}
