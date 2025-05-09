package model;

/**
 * 
 * @author ChatGPT amb suggerencies del vostre professor
 */
public class Persona {
    private String nom;
    private String dni;
    private double nota;

    public Persona(String nom, String dni, double nota) {
        this.nom = nom;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNom() { return nom; }
    public String getDni() { return dni; }
    public double getNota() { return nota; }

    public void setNota(double nota) { this.nota = nota; }
}
