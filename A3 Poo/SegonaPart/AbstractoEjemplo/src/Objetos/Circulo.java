/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Circulo implements Figura {
    private float diametro;

    public Circulo(float diametro) {
        this.diametro = diametro;
    }

    public double radio()
    {
        return diametro/2;
    }
    
    
    @Override
    public double area() {
        return PI * diametro*diametro /4;
    }

    @Override
    public double perimetro() {
        return PI*radio()*radio()*radio();
    }
    
    
}
