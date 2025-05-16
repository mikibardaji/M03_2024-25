package model;

public class Assistent {
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

    public String getTipusEntrada() {
        return tipusEntrada;
    }

    public String getEmail() {
        return email;
    }

    public String getDia() {
        return dia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nom);
        sb.append(", (").append(edat).append(" anys), ");
        sb.append("Entrada:").append(tipusEntrada).append(" ");
        sb.append("Dia:").append(dia);
        return sb.toString();        
    }

    public String toCSV() {
        return nom + "," + edat + "," + email + "," + tipusEntrada + "," + dia;
    }
}