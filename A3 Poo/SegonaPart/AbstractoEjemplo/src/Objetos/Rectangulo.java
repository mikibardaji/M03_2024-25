/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Rectangulo implements Figura, FigurasCuadradas {
    double lado;
    double ancho;

    public Rectangulo(double alto, double ancho) {
        this.lado = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double area() {
        return lado*ancho;
    }

    @Override
    public double perimetro() {
        return lado*2 + ancho*2;
    }
    
}
