/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijeras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pointPlayer=0, pointMachine=0;
        int jugadaPlayer, jugadaMachine;
        int ganador;
        
        jugadaPlayer = jugada();
        jugadaMachine = jugadaOrdenador();
        System.out.print("Has elegido");
        impJugada(jugadaPlayer);
        System.out.print("Maquina ha elegido");
        impJugada(jugadaMachine);
        ganador = quienGana(jugadaPlayer, jugadaMachine);
        imp_ganador(ganador);
    }
    
    /*
    xxx jugada(): pide al usuario una tirada 
    al jugador mostrando una frase similar a "que sacas? (0 piedra, 1 papel, 2 tijera)" 
    Retorna el valor introducido siempre 
    que sea un valor vàlido, sino debe seguir pidiendo tirada. 
    No escribe nada cuando eliges, lo hará otra función  0,5 ptos
    */
    public static int jugada()
    {
        Scanner sc = new Scanner(System.in);
        int jugadaUsuario;
        do{
        System.out.print("que sacas? (0 piedra, 1 papel, 2 tijera): ");
        jugadaUsuario = sc.nextInt();
        }while(jugadaUsuario!=0 && jugadaUsuario!=1 && jugadaUsuario!=2);
//        }while(
//                !(jugadaUsuario==0 || 
//                jugadaUsuario==1 || 
//                jugadaUsuario==2)
//               );
        
        return jugadaUsuario;
    }
    
    public static String jugadaString()
    {
        String jugada;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Pon piedra papel o tijeras");
            jugada = sc.nextLine();
        }while(!(jugada.equalsIgnoreCase("PIEDRA")
                || jugada.equalsIgnoreCase("TIJERAS")
                || jugada.equalsIgnoreCase("PAPEL")));
        return jugada.toLowerCase();
    }
    
    /**
     * proporciona un valor aleatoria entre 0 y 2 incluido .
     * @return el valor aleatorio
     */
    public static int jugadaOrdenador()
    {
         Random aleatorio = new Random();
         int jugada_ordenador  = aleatorio.nextInt(0, 3);
         return jugada_ordenador;
    }
    
    /*
    imprime por pantalla la frase "Piedra", "papel" o "tijera" en 
función del parametro de entrada (0 piedra, 1 papel, 2 tijera)) .
    */
    public static void impJugada(int choose)
    {
        if (choose==0)
        {
            System.out.println(" Piedra");
        }
        else if (choose ==1)
        {
            System.out.println(" Papel");
        }
        else if (choose ==2)
        {
            System.out.println(" Tijeras");
        }
    }
    
    public static void imp_ganador(int ganador)
    {
        if (ganador==0)
        {
            System.out.println("Hay empate");
        }
        else if (ganador == 1)
        {
            System.out.println("Has ganado");
        }
        else if (ganador ==2)
        {
            System.out.println("Ha ganado el ordenador");
        }
    }
    
    public static void marcador(int point_player1,int point_player2)
    {
        System.out.println("Tu puntuación " + point_player1);
        System.out.println("Puntuación maquina " + point_player2);
    }
    
    //retorna el valor de entrada aumentado en uno
    public static int aumentar_punto(int score)
    {
        score = score +1;
        return score;
    }
    
    /**
     * (0 piedra, 1 papel, 2 tijera))
     * Piedra(0), Piedra(0): empate.
        Piedra, Papel: gana papel.
        Piedra, Tijera, gana piedra.
        Papel, papel: empate
        Papel, tijera: gana tijera
        Tijera, tijera: empate.
     * @param choose1
     * @param choose2
     * @return 
     */
    public static int quienGana(int choose1, int choose2)
    {
//        if (choose1==0 && choose2==0)
//        {
//            return 0; //empate 
//        }
//        else if (choose1==1 && choose2==1)
//        {
//            return 0; //empate
//        }
//        else if (choose1 == 2 && choose2 == 2) 
//        {
//            return 0;  //empate
//        } //(0 piedra, 1 papel, 2 tijera))
        if (choose1==choose2)
        {
            return 0;
        }
        else if (choose1==1 && choose2==0)
        {
            return 1;
        }
        else if (choose1==2 && choose2==1)
        {
            return 1;
        }
        else if (choose1==0 && choose2==2)
        {
            return 1;
        }//(0 piedra, 1 papel, 2 tijera))
        else if (choose1==0 && choose2==1)
        {
            return 2;
        }
        else if (choose1==1 && choose2==2)
        {
            return 2;
        }
        else if (choose1==2 && choose2==0)
        {
            return 2;
        }
        
        return -1;
    }
}
