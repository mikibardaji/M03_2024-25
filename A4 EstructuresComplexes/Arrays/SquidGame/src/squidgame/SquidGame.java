/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squidgame;

import Objetos.Munyeca;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SquidGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] muertos = new int[10]; //cuenta jugadores muertos
       char[] camino = new char[10];
       final int MIN = 1, MAX=6;
       int casilla_jugador=0;
       int eleccion_usuario;
       Munyeca doll = new Munyeca(MIN, MAX);
       
       do{
        //pongo X en la posición del jugador
            camino[casilla_jugador] = 'X';
            mostrarCamino(camino);

            int disparo = doll.disparar();
             //System.out.println("doll -> " + disparo);
            eleccion_usuario = pedirValor("Pon el numero para que no te mate la muñeca: ",MIN,MAX);
            if (doll.teHaMatado(disparo, eleccion_usuario))
            {
                muertos[casilla_jugador]++; //aumenta el contador de esa posicion en 1
                //quitar las X del camino
                //opcion 1 metodo que coge todo el array y lo deja en blanco
                limpiarCamino(camino);

                //opcion 2 poner la posición a blanco
                camino[casilla_jugador] = '_';

                mostrarCamino(camino);
                mostrarMuertos(muertos);
                System.out.println("**** MUERTO ****");
                casilla_jugador = 0; //empieza a 0 el siguiente jugadro
            }
            else
            {
                //todo a _
                limpiarCamino(camino);
                casilla_jugador++;
     //           if (casilla_jugador<c) // porque se hace al inicio del do_while
     //           camino[casilla_jugador] = 'X';
     //           mostrarCamino(camino);
      //          System.out.println("no muerto");
            }
       }while(casilla_jugador<camino.length); //no he llegado al final
       
       if (casilla_jugador==camino.length)
       {
           System.out.println("Has ganado 10000000000000 € ");
       }
    }

    private static int pedirValor(String frase, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do
        {
            System.out.print(frase);
            valor = sc.nextInt();
        }while(valor<min || valor >max);
        return valor;
    }

    /**
     * inicializar camnio a _
     * @param camino 
     */
    private static void limpiarCamino(char[] camino) {
        for (int i = 0; i < camino.length; i++) {
            camino[i] = '_';
        }
    }

    public static void mostrarCamino(char[] array) {
        System.out.print("Camino :");
        for (char valor : array) {
            System.out.print(valor + "*");
        }
        System.out.println();
    }
    
    public static void mostrarMuertos(int[] array) {
        System.out.print("Muertos:");
        for (int valor : array) {
            System.out.print(valor + "*");
        }
        System.out.println();
    }
    
}
