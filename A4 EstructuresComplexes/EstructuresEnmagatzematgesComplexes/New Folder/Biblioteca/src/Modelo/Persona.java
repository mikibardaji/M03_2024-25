/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private String DNI;
    private String Nombre;

    public Persona(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.DNI);
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
        if (!(obj instanceof Persona)) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.DNI.equalsIgnoreCase(other.DNI);
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("DNI=" + DNI);
         sb.append(" Nom "+ Nombre );
         return sb.toString();
    }
    
    
    
}
