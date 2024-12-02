/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Jugador {
    private final String nom; //final
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;
    
    public Jugador(String nombre)
    {
        nom = nombre;
        puntuacio = 0;
        distancia_acumulada = 0;
        energia = 50;
        power_up = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPower_up() {
        return power_up;
    }
    
    public void correr()
    {
        int velocitat_normal = 2;
        if (power_up) //power_up==true
        {
            distancia_acumulada = distancia_acumulada + velocitat_normal*3;
        }
        else
        {
            distancia_acumulada = distancia_acumulada + velocitat_normal;
        }
        //System.out.println("Porto " + distancia_acumulada + " metres ");
    }
    
    /*
    recollirMoneda(Moneda coin): Incrementa amb el valor de la moneda.
    S’activa el power-up o es desactiva depenen moneda
    */
    public void recollirMoneda(Monedas coin)
    {
        int monedas = coin.getValor();
        puntuacio = puntuacio + monedas;
        power_up = coin.hasPowerUp();
    }
    
    /**
     * xocar(Obstacle ): Redueix l’energia del jugador 
     * segons el obstacle que es troba. 
     * Es desactiva el power-up.
     */
    public void xocar(Obstacle obs)
    {
        if (power_up)
        {
            power_up = false;
        }
        if (obs.getTipus().equals(TipoObstaculo.BARRERA))
        {
            //energia -= obs.getDificultat();
            this.distancia_acumulada -= 1;
        }
        else
        {
             //energia -= obs.getDificultat(); /*v1*/
             this.distancia_acumulada -= 2; /*v2*/
        }
        System.out.println("He chocado con " + obs.getTipus() + 
        " y tengo energia " + energia);
    }

    public void setEnergia(int energia) {
        if (energia>0)
        {
            this.energia = energia;
        }
        else
        {
            this.energia = 0;
        }
    }

    @Override
    public String toString() {
        return  nom  + " lleva " + distancia_acumulada + " metros de vida le queda" + energia ;
    }
    
    
}
