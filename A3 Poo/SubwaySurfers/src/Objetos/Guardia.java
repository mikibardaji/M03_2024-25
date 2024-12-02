/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Guardia {
    private final String name;
    private int distancia_acumulada;

    public Guardia() {
        name = "Ted Lutz";
        distancia_acumulada = 0;
    }
    
    /**
     *  sempre avança 1 metre
     */
    public void correr()
    {
        distancia_acumulada += 1;
    }
    
    public boolean atrapat(Jugador player)
    {
        if (player.getDistancia_acumulada()<= this.distancia_acumulada)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " llevo " + distancia_acumulada + " metros ";
    }
    
}
