/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractoejemplo;

import Objetos.Brawler;
import Objetos.Epicos;
import Objetos.Legendarios;

/**
 *
 * @author mabardaji
 */
public class AbstractoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epicos epic = new Epicos();
        Legendarios legend = new Legendarios();
        epic.saludo();
        legend.saludo();
        epic.correr();
        legend.correr();
    }
    
}
