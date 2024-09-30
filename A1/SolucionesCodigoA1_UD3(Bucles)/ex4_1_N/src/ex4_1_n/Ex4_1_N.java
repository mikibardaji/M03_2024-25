/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4_1_n;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4_1_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor maximo a imprimir");
        N = sc.nextInt();
        int cont=1;
        while (cont<=N)
        {
            System.out.println(cont);
            cont = cont +1;
//            ++cont;
//            cont++;
        }
        
        
        for (cont = 1; cont < N; cont++) {
             System.out.println(cont);
        }
    }
    
}
