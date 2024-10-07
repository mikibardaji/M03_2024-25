/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,cont_veces=1;
        int cont_pos=0;
        //int cont_neg=0; opcion tambien valida
        final int NUMEROS_INTRODUCIDOS = 4;
        while (cont_veces<=NUMEROS_INTRODUCIDOS)
        {
            System.out.println("Pon un numero no nulo");
            num = sc.nextInt();
            if (num==0)
            {
                System.out.println("numero nulo no valido");
            }
            else if (num>0)
            {
                cont_pos = cont_pos + 1;
                cont_veces = cont_veces + 1;
                //cont_pos++;
            }
            else
            {
               // cont_neg = cont_neg + 1;
                cont_veces++;
            }
            
        }
        System.out.println("Has puesto " + cont_pos + " positivos");
        System.out.println("Has puesto " + (NUMEROS_INTRODUCIDOS- cont_neg) + " negativos");
    }
    
}
