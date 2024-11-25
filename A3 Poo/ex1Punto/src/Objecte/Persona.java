/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private final String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private final static int MAYORIA_EDAD=18; //al ser final Y STATIC
    
    public Persona(String dni1, String nombre1, String apellidos1, int edad)
    {
        if (DNIvalido(dni1))
        {
            this.DNI = dni1; //obligatori al ser final
        }
        else
        {
            this.DNI ="XXXXXXXXXXX";
        }
        this.nombre = nombre1;
        this.apellido = apellidos1;
        this.edad = edad;
        //MAYORIA_EDAD = 18;
    }
    
    private String getDNI()
    {
        return DNI;
    }
    
    private String getNombre()
    {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprime()
    {
        System.out.println("DNI: " + this.DNI + " Nombre: " + this.nombre);
    }
    
    public boolean esMayorEdad()
    {
        return this.edad>=MAYORIA_EDAD;
    }
    
    public boolean esJubilado()
    {
        return this.edad>=65;
    }
    
    public int diferenciaEdad(Persona p)
    {
        int resta;
        if (this.edad < p.getEdad())
        {
            resta = p.getEdad() - this.edad;
        }
        else
        {
            resta = this.edad - p.getEdad() ;
        }
        //opcio 2
        //resta = Math.abs(p.getEdad() - this.edad);
        return resta;
    }
    
    public static boolean DNIvalido(String DNI)
    {
        return DNI.length()==9;
    }
}
