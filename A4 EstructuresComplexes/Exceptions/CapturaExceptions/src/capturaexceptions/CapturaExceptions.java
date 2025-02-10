/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capturaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class CapturaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        try {
            //capturaExceptionIndividual();
            //capturaExceptionColectiva();
            //capturaExceptionGenerica();
            
            /* Captura Exception que se ha lanzado para arriba
            try{
            lanzarExceptionArriba();
            }
            catch(InputMismatchException ex)
            {
            System.out.println("No has puesto un valor valido");
            }
            catch(ArithmeticException ex)
            {
            System.out.println("División por 0 no permitida");
            }*/
            
            String frase = "hol";
            
            //recortarFraseAcuatroCaracteres(frase); //tirar Exceoption generica
            recortarFraseAcuatroCaracteresExceptionpropia(frase);
        } catch (InvalidLengthStringException ex) {
            System.out.println(ex.getMessage());
        }
           
  
    }

    private static void capturaExceptionIndividual() {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b ;
        int c;
        try
        {
        System.out.println("Pon un valor para b");
        b = sc.nextInt();
       
        c = a/b;
        System.out.println(c);
        }
        catch(InputMismatchException e)
        {
            System.out.println("No has puesto un numero por eso termino el programa");
        }
        catch(ArithmeticException e)
        {
            System.out.println("No puedes dividir por 0");
            c=-1;
        }
    }

    private static void capturaExceptionColectiva() {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b ;
        int c;
        try
        {
        System.out.println("Pon un valor para b");
        b = sc.nextInt();
       
        c = a/b;
        System.out.println(c);
        }
        catch(InputMismatchException | ArithmeticException e)
        {
            System.out.println("Ha habido un error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }

    private static void capturaExceptionGenerica() {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b ;
        int c;
        try
        {
        System.out.println("Pon un valor para b");
        b = sc.nextInt();
       
        c = a/b;
        System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Ha habido un error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void lanzarException() throws ArithmeticException, InputMismatchException{
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b ;
        int c;
        System.out.println("Pon un valor para b");
        b = sc.nextInt();
       
        c = a/b;
        System.out.println(c);
    }

    private static void lanzarExceptionArriba() throws ArithmeticException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b ;
        int c;
        System.out.println("Pon un valor para b");
        b = sc.nextInt();
       
        c = a/b;
        System.out.println(c);
    }

    /**
     * Metodo que imprime un string de las primeras 4 caracteres de la frase 
     * @param frase 
     */
    private static void recortarFraseAcuatroCaracteres(String frase) 
            throws Exception {
     //   throw new UnsupportedOperationException("Not supported yet.");
        if (frase.length()>=4)
        { //ok
            System.out.println("Recortada " + frase.substring(0, 4));
        }
        else
        { //es mas corta
            //función no esta preparada para hacer
            //avisa con una excepcion
            throw new Exception("String debe tener almenos 4 caracteres");
        }
     
    }

    private static void recortarFraseAcuatroCaracteresExceptionpropia(String frase) 
            throws InvalidLengthStringException {
     //   throw new UnsupportedOperationException("Not supported yet.");
        if (frase.length()>=4)
        { //ok
            System.out.println("Recortada " + frase.substring(0, 4));
        }
        else
        { //es mas corta
            //función no esta preparada para hacer
            //avisa con una excepcion
            throw new InvalidLengthStringException("Longitud erronea " + frase.length());
        }
    }
    
}
