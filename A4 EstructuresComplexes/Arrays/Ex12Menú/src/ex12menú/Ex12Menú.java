/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12men�;

import java.util.Scanner;

/**
 * . Crea un programa que cree un array de 10 enteros y luego muestre el siguiente men� con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opci�n �a� mostrar� todos los valores por pantalla. La opci�n �b� pedir� un valor V y una
posici�n P, luego escribir� V en la posici�n P del array. El men� se repetir� indefinidamente hasta
que el usuario elija la opci�n �c� que terminar� el programa.
 * @author mabardaji
 */
public class Ex12Men� {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        char opcion;
        
        do{
        opcion = Menu();
        switch(opcion)
        {
            case 'a':
                mostrarArray(valores);
                break;
            case 'b':
                ponerValor(valores);
                break;
            case 'c':
                System.out.println("adios");
                break;
            default:
                System.out.println("Opcion no correcta");
        }
        }while (opcion!='c');
    }

    private static char Menu() {
        char letra ;
        Scanner sc = new Scanner(System.in);
        System.out.println("a Mostrar Valores");
        System.out.println("b Introducir Valor");
        System.out.println("C salir");
        System.out.print("Pon opcion: ");
        letra = sc.next().charAt(0);
        return letra;
    }

    
    private static void mostrarArray(int[] primero) {
        for (int i = 0; i < primero.length; i++) {
            System.out.print(primero[i] + "-");
        }
        System.out.println("");
    }

    private static void ponerValor(int[] valores) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor que quieres");
        int pos;
        int num = sc.nextInt();
        do{
            System.out.println("Pon la posicion donde la quieres poner 0-" + valores.length);
            pos = sc.nextInt();
        }while(pos>=valores.length);
        valores[pos] = num;
    }
}
