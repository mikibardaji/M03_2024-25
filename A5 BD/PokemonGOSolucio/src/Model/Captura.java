package model;

/**
 * Representa una captura d’un Pokémon per part d’un entrenador.
 */
public class Captura {
    private int id;
    private String nomEntrenador; // No esta a la taula captura pero seria interessant que quant llistem es mostres això
    private int numPokemon;
    private String nomPokemon; // No esta a la taula captura pero seria interessant que quant llistem es mostres això
    private int combatPoints;
    

    public Captura(int id, int numPokemon, int combatPoints) {
        this.id = id;
        this.numPokemon = numPokemon;
        this.combatPoints = combatPoints;
    }

    public Captura(String nomEntrenador, String nomPokemon, int combatPoints) {
        this.nomEntrenador = nomEntrenador;
        this.nomPokemon = nomPokemon;
        this.combatPoints = combatPoints;
    }
    //no tinc clar que l'utilitzarem
    public Captura(int id, String nomEntrenador, int numPokemon, String nomPokemon, int combatPoints) {
        this.id = id;
        this.nomEntrenador = nomEntrenador;
        this.numPokemon = numPokemon;
        this.nomPokemon = nomPokemon;
        this.combatPoints = combatPoints;
    }
    
    public String getNomEntrenador() {
        return nomEntrenador;
    }

    public void setNomEntrenador(String nomEntrenador) {
        this.nomEntrenador = nomEntrenador;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    public int getCombatPoints() {
        return combatPoints;
    }

    public void setCombatPoints(int combatPoints) {
        this.combatPoints = combatPoints;
    }

    /**
     * Retorna una descripció clara de la captura.
     * IMPORTANT: SEGURAMENT NO LA UTILITZAREM AL CODI
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captura{");
        sb.append("nomEntrenador='").append(nomEntrenador).append('\'');
        sb.append(", numPokemon=").append(numPokemon);
        sb.append(", combatPoints=").append(combatPoints);
        sb.append('}');
        return sb.toString();
    }
}

