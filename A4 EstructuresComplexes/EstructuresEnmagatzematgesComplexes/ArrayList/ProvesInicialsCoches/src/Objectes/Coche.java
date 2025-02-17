/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Coche {
    private String marca;
    private int matricula;

    public Coche(String marca, int matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Tienes un coche " + marca + " y su matricula es" + matricula;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Coche)) {
            return false;
        }
        final Coche other = (Coche) obj;
//        if (this.matricula != other.matricula)
//        {
//            return false;
//        }
//        else
//        {
//            return this.marca.equalsIgnoreCase(other.marca);
//        }
        return this.matricula == other.matricula; //int ==
        //marca equals
    }
    
    
    
}
