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
public class CofreOr extends CofreOrGeneric{

    @Override
    public void obrirCofre() {
        numMonedes = generarMonedes(420, 480);
        Random rd = new Random();
        card1 = new Carta(rd.nextInt(1, 11));
        card2 = new Carta(rd.nextInt(1, 11));
        card3 = new Carta(rd.nextInt(1, 11));
    }

    @Override
    public void mostrar_cofre() {
        System.out.println("Cofre d'or:");
        System.out.println("Monedes: " + numMonedes);
        System.out.println("Cartes:");
        System.out.println("Tinc " + card1.getNumCartesRepetides() + " cartes de " + card1.getNom());
        System.out.println("Tinc " + card2.getNumCartesRepetides() + " cartes de " + card2.getNom());        
        System.out.println("Tinc " + card3.getNumCartesRepetides() + " cartes de " + card3.getNom());        
    }
    
}
