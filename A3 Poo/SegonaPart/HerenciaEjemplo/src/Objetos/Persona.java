/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Persona {
    protected String nombre;
    protected int DNI;
    protected int TELEFONO;
    protected Vida life; // en este caso fuerzo el enum pero lo logico boolean
    
    /*public Persona()
    {
        life = Vida.VIVO;
    }*/

    public Persona(String nombre, int DNI, int TELEFONO, Vida life) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.TELEFONO = TELEFONO;
        this.life = life;
    }
   
    
    public void respira()
    {
        if (this.life.equals(Vida.VIVO))
                {
                    System.out.println("Inspiro... expiro");
                }
        
    }
    
    public void morir()
    {
        this.life = Vida.MUERTO;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public Vida getLife() {
        return life;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public void setLife(Vida life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Persona " + nombre + " su  DNI=" + DNI ;
    }

    
}
