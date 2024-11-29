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
public class Monedas {
    private final int valor; 
    // El valor es al moment de la creació i sera un valor aleatori entre 1 i 100.

    public Monedas() {
        Random rd = new Random();
        valor = rd.nextInt(1, 101);
    }

/*
    hasPowerUp(): 
Mètode que preguntarà pels milisegons d’execució 
    (System. currentTimeMillis()), 
    si els milisegons es múltiple de 3, retornarà true.Sinó retornara false.

    */    
    public boolean hasPowerUp()
    {
        
        if (System.currentTimeMillis()%3 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
            //return System.currentTimeMillis()%3 ==0;
    }

    public int getValor() {
        return valor;
    }
    
    
}
