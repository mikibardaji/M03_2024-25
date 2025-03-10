/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticapersones;

/**
 *
 * @author mabardaji
 */
class Persona {
    private String nom;
    private int notaFinal;
    private int edat;

    public Persona(String nom, int notaFinal, int edat) {
        this.nom = nom;
        this.notaFinal = notaFinal;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return nom + " Nota: " + notaFinal + " Edat= " + edat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Persona)) return false;
        
        Persona persona = (Persona) o;
        return nom.equalsIgnoreCase(persona.nom);
    }

    
    @Override
    public int hashCode() {
        return nom.toLowerCase().hashCode();
    }

    public String getNom() {
        return nom;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public int getEdat() {
        return edat;
    }
}
