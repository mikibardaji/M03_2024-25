/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i=1;
        boolean negatiu =false;
        while (i<=10)
        {
            System.out.println("Pon un numero no nulo");
            num = sc.nextInt();
            if (num<0)
            {
                negatiu = true;
            }
            if (num!=0)
            {
                i = i+1;
            }
            else
            {
                System.out.println("has puesto 0 valor no valido");
            }
        }
        
        
        
        
        for ( i = 1; i <= 4; i++) {
           // do{opcion 1 correcta
                System.out.println("Pon un numero no nulo");
                num = sc.nextInt();
            //}while(num==0);
            if (num<0)
            {
                negatiu = true;
            }
            else if (num==0)
            {
                i = i -1;
                System.out.println("Valor nulo no valido");
            }
//            else //porque desactiva que he encontrado un negativo
//            {
//                negatiu = false;
//            }
        }
        
        if (negatiu==true)
        //if (negatiu)    
        {
            System.out.println("has puesto almenos un negativo");
        }
        else
        {
            System.out.println("no has puesto ningun negativo");
        }
    }
    
}
