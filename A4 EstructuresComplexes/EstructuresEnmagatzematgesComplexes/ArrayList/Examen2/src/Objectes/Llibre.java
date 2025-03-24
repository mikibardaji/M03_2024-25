/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class Llibre implements Comparable<Llibre>{
    private static int codigo_unico=0;
    private int codi;
    private String Titol;
    private String Autor;
    private double satisfaction;
    private int pagines; 
    private Set<String> generes;
    
    public Llibre(String Titol, String Autor, double satisfaction, int pagines, String genero) throws InvalidLengthFieldException {
       
        if (Titol.length()>2 && Autor.length()>2)
        {
            generes = new HashSet<>(); //opcio 1 dejarlo asi y ponerlo todo en el setter
            generes.add(genero); //opcio 2
             codigo_unico++;
            this.codi = codigo_unico;
            this.Titol = Titol;
            this.Autor = Autor;
            this.satisfaction = satisfaction;
            if (pagines > 0)
            {
                this.pagines = pagines;
            }
            else
            {
                this.pagines = 0;
            }
        }
        else
        {
            throw new InvalidLengthFieldException();
        }
        
    }

    public static int getCodigo_unico() {
        return codigo_unico;
    }

    public int getCodi() {
        return codi;
    }

    public String getTitol() {
        return Titol;
    }

    public String getAutor() {
        return Autor;
    }

    public double getSatisfaction() {
        return satisfaction;
    }

    public int getPagines() {
        return pagines;
    }

    @Override
    public int compareTo(Llibre o) {
        return this.Autor.compareToIgnoreCase(o.Autor);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codi;
        hash = 17 * hash + Objects.hashCode(this.Titol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Llibre)) {
            return false;
        }
        final Llibre other = (Llibre) obj;
        if (this.codi != other.codi) {
            return false;
        }
        return this.Titol.equalsIgnoreCase(other.Autor);
    }

    public void setGeneres(String nuevo_genero) {
        this.generes.add(nuevo_genero);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("codi=" + codi);
        sb.append(" Titol=" + Titol);
        sb.append(" generes=" + generes + "\n");
        return sb.toString();
    }

    public Set<String> getGeneres() {
        return generes;
    }
    
    
    
    
}
