/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public abstract class CofreGeneric implements EnsenyaCofre{
    protected int numMonedes;
    protected Carta card1;
    protected Carta card2; 

    public int getNumMonedes() {
        return numMonedes;
    }

    public Carta getCard1() {
        return card1;
    }

    public Carta getCard2() {
        return card2;
    }
    
    protected int generarMonedes(int min, int max) {
        Random rd = new Random();
        
        return rd.nextInt(min,max+1);
    }    
    
    public abstract void obrirCofre();
    
    @Override
    public void mostrar_cofre2(String nom)
    {
        System.out.println(nom);
        System.out.println("Monedes: " + numMonedes);
        System.out.println("Cartes:");
        System.out.println("Tinc " + card1.getNumCartesRepetides() + " cartes de " + card1.getNom());
        System.out.println("Tinc " + card2.getNumCartesRepetides() + " cartes de " + card2.getNom());                
    }
}
