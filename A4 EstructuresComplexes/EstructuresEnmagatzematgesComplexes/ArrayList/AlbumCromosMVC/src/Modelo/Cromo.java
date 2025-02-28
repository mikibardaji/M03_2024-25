/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class Cromo {
    private int num;
    private String nom;
    private TipoBrawler tipo;

    public Cromo(int num, String nom, TipoBrawler tipo) {
        this.num = num;
        this.nom = nom;
        this.tipo = tipo;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public TipoBrawler getTipo() {
        return tipo;
    }

    public void setNum(int num) throws NumIncorrectException {
        if (num>0)
        {
            this.num = num;
        }
        else 
            throw new NumIncorrectException();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipo(TipoBrawler tipo) {
        this.tipo = tipo;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cromo)) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.num == other.num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cromo num=");
        sb.append(num);
        sb.append(", ");
        sb.append(nom);
        sb.append(", tipo");
        sb.append(tipo.toString());
        //sb.append("\n");
        return sb.toString();
    }
    
         
    
    
    
}
