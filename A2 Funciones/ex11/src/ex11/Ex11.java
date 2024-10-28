/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla_del = pedirValorPositivo("pon la tabla de multiplicar: ");
        tablaMultiplicar(tabla_del);
    }
    
    
    public static void tablaMultiplicar(int num_tabla)
    {
        int calculo;
        for (int i = 1; i <= 10; i++) {
            calculo = num_tabla*i;
            System.out.println(num_tabla+"*" + i + "=" + calculo);
        }
        
    }
    
    public static int pedirValorPositivo(String frase)
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(frase);
        valor = sc.nextInt();
        }while(valor<=0);
        return valor;
    }
}
