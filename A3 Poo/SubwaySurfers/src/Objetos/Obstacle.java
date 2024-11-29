/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 * 
 * tipus (String): Pot ser "tren" o "barrera".
dificultat (int): Impacta quanta energia 
* perd el jugador quan hi xoca. La dificultat es far� en el moment de la creaci� i en funci� de si surt barrera, la dificultat sera un valor aleatori entre 1 i 5, si es un tren entre 5 i 10.
M�todes:
interactuar(Jugador jugador): Redueix l�energia del jugador segons la dificultat de l�obstacle.

 * @author mabardaji
 */
public class Obstacle {
    private final String tipus;//final
    private final int dificultat; //final

    /**
     * aleatoriament barrea o tren
     */
    public Obstacle() {
        Random rd = new Random();
        int valor = rd.nextInt(1, 3);
        if (valor ==1)
        {
            tipus = "Barrera";
            dificultat = rd.nextInt(1, 6);
        }
        else
        {
            tipus = "Tren";
            dificultat = rd.nextInt(5, 11);
        }
            
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }
    
    //dificultat = rd.nextInt(1, 6);
    
}