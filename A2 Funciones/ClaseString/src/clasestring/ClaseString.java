/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestring;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "hola hoy llueve";
        System.out.println(frase);
        System.out.printf("-> %s \n", frase);
        String frase2 = " ya parara... ";
        String fraseTotal = frase + frase2;
        System.out.printf(" %s \n", fraseTotal);
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon una frase: ");
        String fraseUsuario = sc.nextLine();
        System.out.printf("Has escrito %s \n",fraseUsuario);
        
//        System.out.println("en la primera posicion " + fraseUsuario.charAt(0));
//        System.out.println("en la quinta opsicion (empieza por 0)" + fraseUsuario.charAt(4));
//        System.out.println("en la septima posicion (empieza por 0)" +fraseUsuario.charAt(6));
        //System.out.println("fuera de limites si no has escrito 100 caracteres " + fraseUsuario.charAt(100));
        
        System.out.println("Letras en minusculas -> " + 
                fraseUsuario.toLowerCase());
        System.out.println("Letras en mayusculas -> " + 
                fraseUsuario.toUpperCase());
        
        if (fraseUsuario.equals("hola"))
        {
            System.out.println("Es igual a hola");
        }
        if (fraseUsuario.equalsIgnoreCase("hola"))
        {
            System.out.println("Es igual a hola sin importar mayus/minus");
        }
        String continuar;
        String CONTINUAR = "SI";
        String NOCONTINUAR = "NO";
        do
        {
            System.out.println("Quieres continuar (SI/NO)");
            continuar =sc.nextLine();
        }while (!continuar.equalsIgnoreCase(CONTINUAR)
                && !continuar.equalsIgnoreCase(NOCONTINUAR));
        
        if (continuar.equalsIgnoreCase(CONTINUAR))
        {
            System.out.println("continuas");
        }
        else
        {
            System.out.println("No continuas");
        }
        
        
        
        
        
        
    }
    
}
