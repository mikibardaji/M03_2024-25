/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_practica;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantitatLlibres,preuLlibre;
        char soci;
        double descompteExtra=0, descompteSoci=0,preuBase, precioFinal;
         Scanner sc = new Scanner(System.in);
        System.out.println("Llibres que compres");
        quantitatLlibres = sc.nextInt();
        System.out.println("Preu llibre");
        preuLlibre = sc.nextInt();
        System.out.println("Ets soci (s/n)");
        soci = sc.next().charAt(0);
        
        preuBase = quantitatLlibres * preuLlibre;
        
        if (soci=='s' || soci == 'S')
        {
            descompteSoci = preuBase * 0.15;
            //precioFinal = preuBase - descompteExtra;
            if (quantitatLlibres>=3)
            {
                descompteExtra = preuBase * 0.05;
               // precioFinal = precioFinal - descompteExtra;
            }
        }
        
        precioFinal = preuBase - descompteExtra - descompteSoci;
        
        System.out.println("PRecio inicial" + preuBase);
        System.out.println("Descompte per soci" + descompteSoci);
        System.out.println("Descompte per mes de 2 llibres" + descompteExtra);
        System.out.println("Preu final" + precioFinal);
        //else no es socio no hago nada de calculos
            
    }
    
}
