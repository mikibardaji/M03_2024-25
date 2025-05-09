/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import javax.swing.SwingUtilities;
import model.ContadorModel;
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
        ContadorModel modelo = new ContadorModel();
        SwingUtilities.invokeLater(() -> {
            new FinestraPrincipal();
            //new FinestraPrincipal(modelo);
        });
    }
    
}
