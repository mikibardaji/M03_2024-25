/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class Plantel extends EquipoFutbol{

    public Plantel(int id, String nombre, int edad, double salario) {
        super(id, nombre, edad, salario);
    }
 
    public abstract void entrenar();
}
