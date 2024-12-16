/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

public class Entrenador extends Plantel {
    private boolean tieneTitulo;

    public Entrenador(int id, String nombre, int edad, boolean tieneTitulo) {
        super(id, nombre, edad, 1500);
        this.tieneTitulo = tieneTitulo;
    }

    public Entrenador(int id, String nombre, int edad) {
        this(id, nombre, edad, true);
    }

    public Entrenador(int id, String nombre) {
        this(id, nombre, 40, true);
    }
    
    
   /* public void dirigirPartido() {
        System.out.println(nombre + " està dirigint un partit.");
    }*/
    @Override
    public void diaPartido() {
        System.out.println(nombre + " està dirigint un partit.");
    }
    
    @Override    
    public void entrenar() {
        System.out.println(nombre + " està entrenant l'equip.");
    }

    public boolean isTieneTitulo() {
        return tieneTitulo;
    }
    
}
