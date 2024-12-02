/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Alumno extends Persona {
    private String ciclo; //atributs propis del fill
    private int curso; // atributs propis del fill

    public Alumno(String nombre, int DNI, int TELEFONO, Vida life, String ciclo, int curso) {
        super(nombre, DNI, TELEFONO, life);
        this.ciclo = ciclo;
        this.curso = curso;
        this.TELEFONO = 12;
    }



    @Override
    public void respira() {
        super.respira(); //ejecutar respira de la clase superior
        System.out.println("Respiro dos veces ");
    }
    //que tiene los atributos y metodos de la clase persona

    @Override
    public void morir() {
        System.out.println("Los alumnos nunca mueren!!! ");
    }
    
    
    
}
