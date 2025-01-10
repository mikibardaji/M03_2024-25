/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Carta {
    CartesNoms nom;
    private int elixir;
    private int nivell;
    private int numCartesRepetides;

    public Carta(int numCartesRepetides) {
        CartesNoms[] llista = CartesNoms.values();
        Random rd = new Random();
               
        int posicio = rd.nextInt(llista.length);
        this.nom = llista[posicio];
        this.elixir = rd.nextInt(1, 9);
        //this.nivell = elixir == 7 ? 10 : elixir == 8 ? 12 : elixir == 9 ? 13 : elixir;
        this.nivell = elixir;
        if (this.elixir==7)
        {
            this.nivell=10;
        }
        else if (this.elixir==8)
        {
            this.nivell = 12;
        }
        else if (this.elixir==9)
        {
            this.nivell = 13;
        }
        this.numCartesRepetides = numCartesRepetides;
    }

    public String getNom() {
        return nom.name();
    }

    public int getElixir() {
        return elixir;
    }

    public int getNivell() {
        return nivell;
    }

    public int getNumCartesRepetides() {
        return numCartesRepetides;
    }

    public void setElixir(int elixir) {
        if(elixir>=1 && elixir<=9)
        {
            this.elixir = elixir;
        }
        else
        {
            System.out.println("valor no valid" + elixir);
        }
            
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Carta)) {
            return false;
        }
        final Carta other = (Carta) obj;
        
        return this.nom.name().equalsIgnoreCase(other.nom.name());
    }

    @Override
    public String toString() {
        return "La carta " + nom + " s'invoca amb " + elixir +  " d'elixir ";
    }
    
    
    
    
}
