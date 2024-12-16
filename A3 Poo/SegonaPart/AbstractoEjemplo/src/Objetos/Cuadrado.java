/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Cuadrado implements Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }
    
}
