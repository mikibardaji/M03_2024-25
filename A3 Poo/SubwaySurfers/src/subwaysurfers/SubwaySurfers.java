/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subwaysurfers;

import Objetos.Joc;
import Objetos.Monedas;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SubwaySurfers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Monedas coin = new Monedas();
//        System.out.println("coins " + coin.getValor());
//        System.out.println("Power up" + coin.hasPowerUp());
            Joc game;

           String nom  = pedirDatos("Pon nombre jugador");
           String level  = pedirDatos("Pon dificultad");
            
           game = new Joc(nom, level);
           game.JugarV2();
    }

    private static String pedirDatos(String frase) {
           Scanner sc = new Scanner(System.in);
           System.out.println(frase);
           String valor  = sc.nextLine();
           return valor;
    }
    
}
