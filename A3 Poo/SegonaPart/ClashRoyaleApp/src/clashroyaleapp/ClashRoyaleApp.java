/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleapp;

import Objectes.CofreArgent;
import Objectes.CofreOr;
import Objectes.CofreOrCorones;

/**
 *
 * @author mabardaji
 */
public class ClashRoyaleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CofreArgent cofreArgent = new CofreArgent();
        cofreArgent.obrirCofre();
        cofreArgent.mostrar_cofre2("Cofre d'Argent");

        CofreOr cofreOr = new CofreOr();
        cofreOr.obrirCofre();
        cofreOr.mostrar_cofre2("Cofre d'Or");

        CofreOrCorones cofreOrCorones = new CofreOrCorones();
        cofreOrCorones.obrirCofre();
        cofreOrCorones.mostrar_cofre2("Cofre d'Or Corones");
    }
    
}
