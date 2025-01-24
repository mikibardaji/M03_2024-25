/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Munyeca {
    int min;
    int max;

    public Munyeca(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    
    /**
     * penar un aleatorio y devolverlo
     * @return 
     */
    public int disparar()
    {
        Random rd = new Random();
        
        int disparo = rd.nextInt(min, max+1);
        return disparo;
    }
    
    
    public boolean teHaMatado(int disparo, int jugador)
    {
        return disparo == jugador;
    }
    
}
