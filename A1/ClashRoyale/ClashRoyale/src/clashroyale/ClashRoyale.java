/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copas;
        char carta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas tienes? ´á ");
        copas = sc.nextInt();
        
        if (copas>= 2000)
        {
            if (copas>=3000)
            {
                System.out.println("Ejercito(j) o gigante(g)");
                carta = sc.next().charAt(0); //leer caracter
                if ( carta =='j' || carta == 'J')
                {
                    System.out.println("Ejercito");
                }
                else
                {
                    System.out.println("gigante");
                }
            }
            else
            { //menos de 3000 pero tengo 2000
                System.out.println("Cavallero(C) o bandida(b)");
                carta = sc.next().charAt(0); //leer caracter
                if ( carta =='c' || carta == 'C')
                {
                    System.out.println("Cavallero");
                }
                else
                {
                    System.out.println("Bandida");
                }    
            }
            
        }
        else
        { //copas <2000
            System.out.println("Mago electrico(m) o Mega esbirro(e)");
            carta = sc.next().charAt(0); //leer caracter
            if ( carta =='m' || carta == 'M')
            {
                System.out.println("Mago electrico");
            }
            else
            {
                System.out.println("Mega esbirro");
            }            
        }
        
        
        //System.out.println("carta" + carta);
        
        
    }
    
}
