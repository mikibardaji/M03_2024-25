/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class NumberOutofAlbum extends Exception{

    public NumberOutofAlbum(int num) {
        super("Cromo excedeix el numero maxim de la col·lecció " + num);
    }
    
    
}
