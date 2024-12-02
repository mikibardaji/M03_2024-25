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
public class Joc {
    private Jugador player;
    private String dificultat;
    private Guardia guard;
    private final String LEVELEASY = "facil";
    private final String LEVELHARD = "dificil";
    
    
    public Joc(String name_player, String dificultat) {
        this.player = new Jugador(name_player);
        guard = new Guardia();
        /*if (!dificultat.equalsIgnoreCase("facil")
                && !dificultat.equalsIgnoreCase("dificil"))*/
        if (!dificultat.equalsIgnoreCase(LEVELHARD))
        {
            this.dificultat = LEVELEASY;
        }
        else
        {
            this.dificultat = dificultat;
        }
        
    }
    
    public void Jugar() throws InterruptedException 
    {
        Random rd = new Random(); //para 
        //controlar que obstaculo o moenda sale
        boolean esMoneda;
        int aparicion;
        do{
            player.correr();
            aparicion = rd.nextInt(0, 10);
            if (dificultat.equalsIgnoreCase(LEVELHARD))
            {
                if (aparicion>=7 && aparicion <=9)
                {//moneda 
                    esMoneda = true;
                }
                else
                {
                    esMoneda = false;
                }
            }
            else
            {
                if (aparicion>=7 && aparicion <=9)
                {//moneda 
                    esMoneda = false;
                }
                else
                {
                    esMoneda = true;
                }
            }
            if (esMoneda)
            {
                Monedas coin = new Monedas();
                player.recollirMoneda(coin);
                System.out.println("He cogido una moneda" + coin.getValor());
            }
            else
            {
                Obstacle obstaculo = new Obstacle();
                player.xocar(obstaculo);
                System.out.println("chocado con " + obstaculo);
            }
            System.out.println(player);
            Thread.sleep(1000);
        }while(player.getEnergia()>0);
        System.out.println("Distancia recorrida " + player.getDistancia_acumulada());
        System.out.println("Monedas " + player.getPuntuacio());
    }
    
 public void JugarV2() throws InterruptedException 
    {
        Random rd = new Random(); //para 
        //controlar que obstaculo o moenda sale
        boolean esMoneda;
        int aparicion;
        do{
            player.correr();
            guard.correr();
            aparicion = rd.nextInt(0, 10);
            if (dificultat.equalsIgnoreCase(LEVELHARD))
            {
                if (aparicion>=7 && aparicion <=9)
                {//moneda 
                    esMoneda = true;
                }
                else
                {
                    esMoneda = false;
                }
            }
            else
            {
                if (aparicion>=7 && aparicion <=9)
                {//moneda 
                    esMoneda = false;
                }
                else
                {
                    esMoneda = true;
                }
            }
            if (esMoneda)
            {
                Monedas coin = new Monedas();
                player.recollirMoneda(coin);
                System.out.println("He cogido una moneda" + coin.getValor());
            }
            else
            {
                Obstacle obstaculo = new Obstacle();
                player.xocar(obstaculo);
                System.out.println("chocado con " + obstaculo);
            }
            System.out.println(player);
            System.out.println(guard);
            Thread.sleep(1000);
        }while(!guard.atrapat(player));
        System.out.println("Distancia recorrida " + player.getDistancia_acumulada());
        System.out.println("Monedas " + player.getPuntuacio());
    }    
    
    
    
    
    
}
