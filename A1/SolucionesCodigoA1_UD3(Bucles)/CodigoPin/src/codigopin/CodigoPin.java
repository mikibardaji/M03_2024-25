/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigopin;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CodigoPin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int CODIGO_VALIDO = 1234;
        Scanner sc = new Scanner(System.in);
        int codigoUsuario;
        int intentos=3;
        //boolean acierto=false;
        do
        {
            System.out.println("Pon el codigo pin tienes " + intentos + " sino se bloquea");
            codigoUsuario = sc.nextInt();
            if (codigoUsuario!=CODIGO_VALIDO)
            {
                intentos--;
            }
            
        }while(intentos>0 && codigoUsuario!=CODIGO_VALIDO);
    //}while(!(intentos ==0 OR acierto ==TRUE));
        //intentos ==0 OR acierto ==TRUE
        if (intentos==0)
        {
            System.out.println("Targeta bloqueada");
        }
        else
        {
            System.out.println("Puedes sacar dinero");
        }
        
        
    }
    
}
