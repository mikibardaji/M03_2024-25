/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1punto;

import Objecte.Punto;

/**
 *
 * @author mabardaji
 */
public class Ex1Punto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto uno = new Punto(5, 3);
        Punto dos = new Punto(2, 2);
        uno.imprime();
        uno.setXY(7, 7);
        uno.imprime();
        uno.desplaza(1, 2);
        uno.imprime();
        uno.setXY(3, 3);
        uno.imprime();
        System.out.println("Distancia entre puntos " + uno.distancia(dos));
    }
    
}
