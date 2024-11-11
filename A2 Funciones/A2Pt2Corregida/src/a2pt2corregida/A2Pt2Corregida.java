/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2pt2corregida;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class A2Pt2Corregida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        char opcion;
        boolean salir = false; //sol s'activara al a Z

        while (!salir) {
            mostrarMenu();
            System.out.print("Seleccioneu una opció: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Introdueix la temperatura en graus Fahrenheit:");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("La temperatura a Celsius és: " + conversorTemperatura(fahrenheit));
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'B':
                    System.out.print("Introdueix un nombre enter: ");
                    int numero = scanner.nextInt();
                    if (esPar(numero)) {
                        System.out.println("El número " + numero + " es par.");
                    } else {
                        System.out.println("El número " + numero + " es impar.");
                    }
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'C':
                    int carta = tiradaCarta();
                    System.out.print("El número de la carta es: " + carta + " de ");
                    paloCarta();  // Muestra el palo aleatorio
                    break;

                case 'D':
                    System.out.print("Introdueix la quantitat de segons:");
                    int segundos = scanner.nextInt();
                    convertirSegundos(segundos);
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'E':
                    System.out.print("Introduïu el nom de l'estudiant: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Introdueix la mitjana de l'estudiant: ");
                    double promedio = scanner.nextDouble();
                    verificaEstudianteAprobado(nombreEstudiante, promedio);
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'F':
                    System.out.print("Introdueix el preu original del producte: ");
                    double precio = scanner.nextDouble();
                    double precioFinal = calcularDescuento(precio);
                    System.out.println("El preu final és:" + precioFinal);
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'G':
                    System.out.print("Introdueix la distància recorreguda (en metres):");
                    double distancia = scanner.nextDouble();
                    System.out.print("Introdueix la teva edat: ");
                    int edad = scanner.nextInt();
                    calcularEstadoFisico(distancia, edad);
                    scanner.nextLine();  // Limpiar el buffer
                    break;

                case 'Z':
                    salir = true;
                    System.out.println("Gràcies per fer servir el programa!");
                    break;

                default:
                    System.out.println("Opció no vàlida. Torneu-ho a provar.");
            }
        }

    }
    
    
    /**
     * convierte grados farenhei a celsius
     * @param gradosFahrenheit de entrada
     * @return grados en celsuis
     */
    public static double conversorTemperatura(double gradosFahrenheit) {
        double Celsius = (double) (gradosFahrenheit - 32) * (5 / 9);
        double dd = (gradosFahrenheit-32)*(5/9);
        return Celsius;
    }

    /**
     * función que nos indica si el numero es par
     * @param numero de entrada
     * @return true si es un numero par , false si es impar
     */
    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
        /*if (numero % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }*/
    }

   /**
    * 
    * @return aleatorio del 1 al 12
    */
    public static int tiradaCarta() {
        Random rand = new Random();
        int num = rand.nextInt(1,13);  // Genera un número aleatorio entre 1 y 12
        return num;
    }    
   /**
    * 
    * @return aleatorio del 0 al 3
    */
    public static void paloCarta() {
        Random rand = new Random();
        int num = rand.nextInt(4);  // Genera un número aleatorio entre 0 y 3
        if (num==0)
        {
            System.out.println(" Oros");
        }
        else if (num==1)
        {
            System.out.println(" Espadas");
        }
        else if(num==2)
        {
            System.out.println(" Copas");
        }
        else
        {
            System.out.println(" Bastos");
        }

    }    
    
    /**
     * Convierte los segundos en horas y 
     * @param segundos 
     */
    public static void convertirSegundos(int segundos) {
        int horas = segundos / 3600;
        //busco los segundos que no son horas
        int segundos_minutos = segundos % 3600;
        //los segundos sobrantes los paso a minutos
        int minutos = segundos_minutos / 60;
        segundos = segundos_minutos % 60;
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
    
    
    /**
     * 
     * @param nombre
     * @param promedio 
     */
    public static void verificaEstudianteAprobado(String nombre, double promedio) {
        if (promedio >= 5.0) {
            System.out.println("Hola, " + nombre + " has pasado de curso.");
        } else {
            System.out.println("Hola, " + nombre + " tienes que ir a recuperación.");
        }
    }
    
    
     public static double calcularDescuento(double precioOriginal) {
        double descuento;
        final double DESCUENTO20=0.8,DESCUENTO15=0.85,DESCUENTONO=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el tipo de descuento: ");
        System.out.println("1. Descuento normal (20%)");
        System.out.println("2. Descuento por estudiante (15%)");
        System.out.println("3. Sin descuento");
        int opcion = scanner.nextInt();

        descuento = 0;
        switch (opcion) {
            case 1:
                descuento = DESCUENTO20; // 20% de descuento
                break;
            case 2:
                descuento = DESCUENTO15; // 15% de descuento
                break;
            case 3:
                descuento = DESCUENTONO;  // Sin descuento
                break;
        }
        double precio = precioOriginal*descuento;
        return precio;
     }
     
     
    public static void calcularEstadoFisico(double distancia, int edad) {
        double imc = distancia / (edad * edad);
        if (imc<50)
        {
            System.out.println("Condición inferior a la normal");
        }
        else if (imc>=50 && imc<=80)
        {
            System.out.println("Condición fisica normal");
        }
        else
        {
            System.out.println("Condición fisica superior a la normal");
        }
    }
    /**
     * Muestra el menu con opciones
     */
    public static void mostrarMenu() {
        System.out.println("\n*** MENÚ ***");
        System.out.println("A. Convertir Temperatura");
        System.out.println("B. Número par o impar");
        System.out.println("C. Tirada carta");
        System.out.println("D. Conversor segundos");
        System.out.println("E. Aprobado curso");
        System.out.println("F. Calculadora precio con descuento");
        System.out.println("G. Calculadora estado físico");
        System.out.println("Z. Salir del programa");
    }
}
