package model;

import java.util.Objects;
import java.util.Random;

/**
 * Representa un Pokémon amb les seves característiques bàsiques.
 */
public class Pokemon {
    private int numeroPokedex;
    private String nom;
    private String tipus;



    public Pokemon(int numeroPokedex, String nom, String tipus) {
        this.numeroPokedex = numeroPokedex;
        this.nom = nom;
        this.tipus = tipus;

    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }



    /**
     * Dos Pokémons es consideren iguals si tenen el mateix número de Pokédex o el mateix nom.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pokemon)) return false;

        Pokemon other = (Pokemon) obj;

        return this.numeroPokedex == other.numeroPokedex ||
               (this.nom != null && this.nom.equalsIgnoreCase(other.nom));
    }

    /**
     * Genera un codi hash tenint en compte el número de Pokédex i el nom.
     */
    @Override
    public int hashCode() {
        return Objects.hash(numeroPokedex, nom);
    }

    /**
     * Representació del Pokémon en forma de text.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{");
        sb.append("numeroPokedex=").append(numeroPokedex);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", tipus='").append(tipus).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
    
    public static int fuerzaPokemon(int fuerzaMaxima)
    {
        Random rd = new Random();
        return rd.nextInt(10,fuerzaMaxima+1);
    }
}
