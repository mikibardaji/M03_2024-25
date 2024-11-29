/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RectanguloMain2;

import Objetos.Rectangulo;

/**
 *
 * @author mabardaji
 */
public class RectanguloMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(0, 0, 3, 3);
        
        System.out.println("Area "+ rect.getArea());
        System.out.println(rect);
    }
    
}
