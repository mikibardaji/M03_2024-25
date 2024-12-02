/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Profesor extends Persona {
    private String departament;
    private String modulos;

    public Profesor(String nombre, int DNI, int TELEFONO, Vida life, String module) {
        super(nombre, DNI, TELEFONO, life);
        departament = "Informatica";
        modulos = module;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    @Override
    public void respira() {
        System.out.println("Respiro muy profundamente");
    }

    @Override
    public String toString() {
        String superior = super.toString();
        return superior + " imparte "+ modulos ;
    }

    
}
