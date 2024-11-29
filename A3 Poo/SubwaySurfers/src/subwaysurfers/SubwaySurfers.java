/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subwaysurfers;

import Objetos.Monedas;

/**
 *
 * @author mabardaji
 */
public class SubwaySurfers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monedas coin = new Monedas();
        System.out.println("coins " + coin.getValor());
        System.out.println("Power up" + coin.hasPowerUp());
    }
    
}
