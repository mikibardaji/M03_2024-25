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
        //funcionregex();
        //replace();
        //iguales();
        
    String s1 = "appLe";
    String s2 = "oranGe";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println("substring 2" + s1.substring(2,4));    
        
        String s = "hola mundo";
        System.out.println(s.startsWith("ello"));
        System.out.println(s.indexOf("o"));
        
  }

  public static void compareStrings(String s1, String s2) {
    int comparacion = s1.compareToIgnoreCase(s2);

    if (comparacion > 0) {
      System.out.println(s1 + " despues " + s2);
    } else if (comparacion < 0) {
      System.out.println(s1 + " antes " + s2);
    } else {
      System.out.println(s1 + " iguales " + s2);
    }
  }    
    
    public static String funcion(String frase1)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase");
        String frase2 = sc.nextLine();
        System.out.println(frase2);
        return frase2;     }
    
    public static void funcion()
    { Scanner sc = new Scanner(System.in);
    char letra='A';
        switch(letra)
        {  case 'A':
                /*vuestro codigo*/
                sc.nextLine();
                break;
        }
    }

    private static void pruebas() {
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

    private static void funcionregex() {
        String regex = "cat|dog|fish";
        String frase = "DOG";
        System.out.println(frase.matches(regex));
        System.out.println("longitud frase" + frase.length());
       // pruebas();
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }

    private static void replace() {
        String frase1="hota mundo tota";
        String frase2=frase1.replace("t", "l");
        System.out.println(frase2);
    }

    private static void iguales() {
        String frase1 = "Hola Mundo";
        String frase2 = "hola mundo";
        String frase3 ="";
        if (frase3.isBlank())
        {
            System.out.println("esta vacio");
        }
        else
        {
            System.out.println("No esta vacio");
        }
        
        if (frase1.equalsIgnoreCase(frase2))
        //if (frase1.equals(frase2)) distingueix minusculas
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("Diferentes");
        }
        
    }
}
