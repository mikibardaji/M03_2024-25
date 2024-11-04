/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex21;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex21 {

    public static void main(String[] args) {
    
        int opcion;
        double radio=0, calculo;
        do {
            opcion = menu();
            if (opcion!=0) //salir
            {
               radio = pideRadio(); 
            }
            switch (opcion) {
                case 1: {
//                    radio = pideRadio();
                    calculo = circunferencia(radio);
                    System.out.println("Circunferencia: " + calculo);
                    break;
                }
                case 2: {
//                    radio = pideRadio();
                    calculo = area(radio);
                    System.out.println("Área: " + calculo);
                    break;
                }
                case 3: {
//                    radio = pideRadio();
                    calculo = volumen(radio);
                    System.out.println("Volumen: " + volumen(radio));
                    break;
                }
                case 4: {
//                    radio = pideRadio();
                    calculo = circunferencia(radio);
                    System.out.printf("Circunferencia: %.1f\n" , calculo);
                    double calculo2 = area(radio);
                    System.out.printf("Área: %14.1f \n" , calculo2);
                    double calculo3 = volumen(radio);
                    System.out.printf("Volumen: %.2f \n" , calculo3);
                    System.out.printf("Circunferencia: %.1f - Área: %.1f - Volumen: %.2f \n", calculo, calculo2, calculo3);
                    break;
                }
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 0);


    }    
    
    
    /**
     * Función que muestra el menú y devuelve la opción elegida por el usuario
     * @return opción elegida (no se valida si es opción valida del menú)
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Menú ===");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        return opcion;
    }

    /**
     * Función que pide el radio y lo devuelve
     * @return radio introducido validado o sea positivo
     */
    public static double pideRadio() {
        Scanner scanner = new Scanner(System.in);
        double radio;
        do{
            System.out.print("Introduce el radio positivo: ");
            radio=scanner.nextDouble();
        }while(radio<=0);
        
        return radio;
    }

    /**
     * Calcula la circunferencia
     * @param r radio de la circunferenca
     * @return longitud circunferencia
     */
    public static double circunferencia(double r) {
        final double NUMEROPI=3.1415;
        return 2 * NUMEROPI* r;
    }

    /**
     * Calcula el área
     * @param r radio de la circunferenca
     * @return area circunferencia
     */
    public static double area(double r) {
        final double NUMEROPI=3.1415;
        return NUMEROPI * r * r;
    }

    // Calcula el volumen
    public static double volumen(double r) {
        final double NUMEROPI=3.1415;
        return (4.0 / 3.0) * NUMEROPI * r * r * r;
    }


    
}
