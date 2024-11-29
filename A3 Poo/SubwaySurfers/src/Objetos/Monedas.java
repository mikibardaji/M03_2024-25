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
    // El valor es al moment de la creaci� i sera un valor aleatori entre 1 i 100.

    public Monedas() {
        Random rd = new Random();
        valor = rd.nextInt(1, 101);
    }

/*
    hasPowerUp(): 
M�tode que preguntar� pels milisegons d�execuci� 
    (System. currentTimeMillis()), 
    si els milisegons es m�ltiple de 3, retornar� true.Sin� retornara false.

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
