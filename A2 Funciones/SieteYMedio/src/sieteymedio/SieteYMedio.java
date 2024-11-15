/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieteymedio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SieteYMedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double puntos_jugador=0, puntos_banca=0, valor_carta;
       int carta;
       String palo;
       
       do{
        carta = generarCarta();
        palo = generarPalo();
        System.out.println(carta + " de " + palo);
        valor_carta = valorCarta(carta);
        puntos_jugador = sumarPuntuacion(puntos_jugador, valor_carta);
        System.out.println("Tienes ==> " + puntos_jugador + " PUNTOS");
       }while(!comprobarSiPerdiste(puntos_jugador) && preguntarSeguir());
       //System.out.println("Tienes ==> " + puntos_jugador + " PUNTOS");
       if(!comprobarSiPerdiste(puntos_jugador))
       { // no he perdido turno de la maquina
           do{
                carta = generarCarta();
                palo = generarPalo();
                System.out.println("MAquina ha sacado " + carta + " de " + palo);
                valor_carta = valorCarta(carta);
                puntos_banca = sumarPuntuacion(puntos_banca, valor_carta);
                System.out.println("BANCA ==> " + puntos_banca + " PUNTOS");
           }while(!plantaBanca(puntos_jugador, puntos_banca));
           
           if (puntos_banca>7.5)
           {
               System.out.println("Ha ganado el jugador");
           }
           else
           {
               System.out.println("Banca gana");
           }
           
       }
       else
       {
           System.out.println("PERDISTE");
       }
    }
    
    /**
     * •	GenerarCarta (random 1 al 10) retornar int , 
     * cuando sea 8,9 y 10 retorna 10,11 y 12
     */
    public static int generarCarta()
    {
        Random rd = new Random();
        int carta = rd.nextInt(1, 11);
        if (carta==8)
        {
            carta=10;
        }
        else if (carta==9)
        {
            carta=11;
        }
        else if (carta==10)
        {
            carta=12;
        }
        return carta;
    }
    
    /**
     * •	ValorCarta (int ) retornar double el mismo valor de entrada 
     * exceptp cuando sea 10, 11 y 12 retornar 0,5
     */
    public static double valorCarta(int carta)
    {
        double valor_carta;
        if (carta==10 || carta==11 || carta==12)
        {
            valor_carta = 0.5;
        }
        else
        {
            valor_carta = carta;
        }
        return valor_carta;
    }
    
    /**
     * •	generarPalo(random 1 al 4) se asigna valor al palo Oros, espadas, retorna un String
     */
   public static String generarPalo()
   {
       Random rd = new Random();
       int tipo_palo = rd.nextInt(1, 5);
       String nombre_palo="";
       switch(tipo_palo)
       {
           case 1:
           nombre_palo = "OROS";
           break;
           case 2:
           nombre_palo = "COPAS";
           break;   
           case 3:
           nombre_palo = "ESPADAS";
           break;           
           case 4:
           nombre_palo = "BASTOS";
           break;           
       }
       return nombre_palo;
   }
   
   
   /**
    * •	sumarPuntuacio(acum, carta) retornar la suma
    */
   public static double sumarPuntuacion(double acum, double carta)
   {
       return carta+acum;
   }
   
   /**
    *   •	comprobarSiPerdiste(acum) retorna true o false si has superado 7,5
    */
   public static boolean comprobarSiPerdiste(double total)
   {
       boolean perdedor=false;
       if (total>7.5)
       {
           perdedor=true;
       }
       return perdedor;
   }
   
   /**
    * •	PlantaBanca(puntuación, puntuación_banca) true si ya supera al jugador  o false si no.
    */
   public static boolean plantaBanca(double puntuacion_jugador, double puntuacion_banca)
   {
       boolean plantar=false;
       if (puntuacion_banca==7.5)
       {
           plantar=true;
       }
       else if(puntuacion_banca>=puntuacion_jugador)
       {
           plantar=true;
       }
       return plantar;           
   }
   
   /**
    * •	PreguntarSeguir()  preguntar_si quieres continuar retornar un boolean.
    */
   public static boolean preguntarSeguir()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Quieres seguir jugando(SI/NO)");
       String respuesta = sc.nextLine();
       if (respuesta.equalsIgnoreCase("SI"))
       {
           return true;
       }
       else
       {
           return false;
       }
               
       
   }
   
   }