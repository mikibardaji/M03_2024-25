/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Coche implements Comparable<Coche> {
    private String marca;
    private int matricula;
    private int anys_antiguetat;

    public Coche(String marca, int matricula) {
        this.marca = marca;
        this.matricula = matricula;
        this.anys_antiguetat = matricula+3;
    }

    public int getAnys_antiguetat() {
        return anys_antiguetat;
    }

    public Coche(int matricula)
    {
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
        return "Coche " + marca + " matricula " + matricula + " años: " + anys_antiguetat;
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

    /*
    retorna -1, 0 , 1 si un es mes gran o mes petit o igual (0)
    */
    @Override
    public int compareTo(Coche o) {
        return this.matricula - o.matricula;
        //return this.marca.compareTo(o.marca);
    }
    
    
    
}
