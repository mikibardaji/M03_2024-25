package model;

import java.util.Objects;

/**
 * Classe que representa un entrenador de Pokémon.
 * Conté informació bàsica com el seu identificador, nom i contrasenya.
 */
public class Entrenador {
    private int id;
    private String nom;
    private String password;

    // Constructor complet amb tots els camps
    public Entrenador(int id, String nom, String password) {
        this.id = id;
        this.nom = nom;
        this.password = password;
    }

    // Constructor alternatiu (sense id), útil abans d’inserir a la BD
    public Entrenador(String nom, String password) {
        this.nom = nom;
        this.password = password;
    }

    // Getters i setters
/*    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Dos entrenadors es consideren iguals si tenen el mateix id o el mateix nom.
     * Aquesta lògica ens pot ajudar a evitar duplicats quan treballem amb llistes.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Comprovació ràpida: és el mateix objecte
        if (!(obj instanceof Entrenador)) return false; // Només comparem si és realment un Entrenador

        Entrenador other = (Entrenador) obj;

        //return this.id == other.id || 
        return (this.nom != null && this.nom.equalsIgnoreCase(other.nom));
    }

    /**
     * Genera un codi hash coherent amb equals.
     * Això és important si volem utilitzar objectes d’aquesta classe en estructures com HashSet.
     */
 /*   @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }*/

    /**
     * Retorna una representació en text de l’objecte.
     * Utilitzem StringBuilder per millorar el rendiment en concatenacions.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entrenador{");
       // sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setId(int aInt) {
        this.id = aInt;
    }
    
    
    public int getId() {
        return id;
    }

}
