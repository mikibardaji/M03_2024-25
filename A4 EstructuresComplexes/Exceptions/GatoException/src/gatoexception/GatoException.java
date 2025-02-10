/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gatoexception;

import Objetos.Gato;
import Objetos.InvalidAgeException;
import Objetos.InvalidLengthStringException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class GatoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gato cat = new Gato("mi", 30);
        } catch (InvalidAgeException  | InvalidLengthStringException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }
    
}
