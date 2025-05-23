package model;

import java.io.Serializable;

public class Assistent implements Serializable{
    private String nom;
    private int edat;
    private String email;
    private String tipusEntrada;
    private String dia;

    public Assistent(String nom, int edat, String email, String tipusEntrada, String dia) {
        this.nom = nom;
        this.edat = edat;
        this.email = email;
        this.tipusEntrada = tipusEntrada;
        this.dia = dia;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getEmail() {
        return email;
    }

    public String getTipusEntrada() {
        return tipusEntrada;
    }

    public String getDia() {
        return dia;
    }
    
    
    
    @Override
    public String toString() {
    //Marc Garcia (19 anys) - VIP - Divendres    
        StringBuilder sb = new StringBuilder();
        sb.append(nom);
        sb.append(" ("+edat +") ");
        sb.append("- "+tipusEntrada +" ");
        sb.append("- "+dia +"");
        return sb.toString();
    }

    public String toCSV() {
         StringBuilder sb = new StringBuilder();
        sb.append(nom + ",");
        sb.append(String.valueOf(edat) +",");
        sb.append(email +",");
        sb.append(tipusEntrada +",");
        sb.append(dia);
        return sb.toString();
    }
}