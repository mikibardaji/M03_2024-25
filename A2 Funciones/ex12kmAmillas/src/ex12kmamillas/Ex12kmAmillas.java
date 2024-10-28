/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12kmamillas;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex12kmAmillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km = pedirValorPositivo("pon km y los pase a millas");
        double millas = kmAmillas(km);
        System.out.println("en millas son => " + millas);
    }
    
    public static double kmAmillas(double km)
    {
        final double MILLAKM = 1.607;
        double resultado = (double) km/MILLAKM;
        return resultado;
    }
    
    public static double pedirValorPositivo(String frase)
    {
        double valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(frase);
        valor = sc.nextDouble();
        }while(valor<=0);
        return valor;
    }
}

