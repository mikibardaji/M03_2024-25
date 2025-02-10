/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Gato {
    
    private String nombre;
    private int edat;

    public Gato(String nombre, int edat) 
            throws InvalidAgeException, InvalidLengthStringException {
        this.setEdat(edat);
        this.setNombre(nombre);
//        this.nombre = nombre;
//        this.edat = edat;
    }

    public void setNombre(String nombre) throws InvalidLengthStringException {
        if (nombre.length()<3)
        {
            throw new InvalidLengthStringException("longitud del nombre incorrecte" + nombre);
        }
        else
            this.nombre = nombre; //una sola linea no fa falta  {}
    }

    public void setEdat(int edat) throws InvalidAgeException {
        if (edat<0)
        {
            throw new InvalidAgeException();
        }
        else
            this.edat = edat;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdat() {
        return edat;
    }

    @Override
    public String toString() {
        return "Gato se llama " + nombre + " y tiene " + edat + " años.";
    }
    
    
    
}
