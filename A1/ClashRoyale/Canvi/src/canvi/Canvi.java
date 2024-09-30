/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canvi;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Canvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cambio;
       Scanner sc = new Scanner(System.in);
       System.out.print("Dime el cambio: ");
       cambio = sc.nextInt();
       int billetes20,billetes5=0,monedas2=0, monedas1=0;
       billetes20 = cambio/20;
       cambio = cambio%20;
//       if (cambio==0) //ya no hay mas monedas
//       {
//           System.out.println("Billete de 20 --> " + billetes20);
//       }
       if (cambio!=0)
       { //ya has calculado billetes20 y no se tocan
           billetes5 = cambio/5;
           cambio = cambio%5;
//           if (cambio!=0) //ya no hay mas monedas
//             { //billete5 y de 20
//             System.out.println("Billete de 20 --> " + billetes20
//                + " billetes de 5 " + billetes5);
//             }
           if (cambio!=0)
            {
              monedas2 = cambio/2; //monedas 2
              cambio = cambio%2; //residuo monedas 1
//              if (cambio==0) //ya no hay mas monedas
//             { //billete5 y de 20
//             System.out.println("Billete de 20 --> " + billetes20
//                + " billetes de 5 " + billetes5
//                + " monedas de 2 " + monedas2);
//             }
//              if (cambio!=0)
//              {
//                System.out.println("Billete de 20 --> " + billetes20
//                + " billetes de 5 " + billetes5
//                + " monedas de 2 " + monedas2
//                + " monedas de 1 " + cambio);  
//              }
            }
       }
       System.out.println("20 --> " + billetes20
                + "\n 5 -->  " + billetes5
                + "\n 2 --> " + monedas2
                + "\n 1 --> " + cambio);
       
    }
    
}
