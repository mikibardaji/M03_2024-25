/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import javax.swing.SwingUtilities;
import vista.FinestraPrincipal;

/**
 *
 * @author usuari
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FinestraPrincipal();
        });
    }
    
}
