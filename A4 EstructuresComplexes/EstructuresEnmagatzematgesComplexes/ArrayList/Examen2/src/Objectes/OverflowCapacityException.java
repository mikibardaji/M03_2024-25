/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class OverflowCapacityException extends Exception{

    public OverflowCapacityException(int capacidad) {
        super("La capacidad de la biblioteca es " + capacidad);
    }
    
}
