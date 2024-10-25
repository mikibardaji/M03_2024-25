/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex19;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digitos = pedirValor("Pon tu dni sin la letra");
        
        char letra = calcularLetraNIF(digitos);
        
        System.out.println("Tu letra es "+ letra);
        
    }
    
    
    public static char calcularLetraNIF(int DNI)
    {
        char letra=' ';
        int residuo = DNI%23;
        if (residuo==0)
        {
            letra = 'T';
        }
        else if(residuo==1)
        {
            letra = 'R';
        }
        else if(residuo==2)
        {
            letra = 'W';
        }
        else if(residuo==15)
        {
            letra = 'S';
        }
        return letra;
       
    }
    
    public static int pedirValor(String frase){
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        valor = sc.nextInt();
        return valor;
    }
}
