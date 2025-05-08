/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carregaimatges;

import Vista.PantallaImatges;
import javax.swing.SwingUtilities;

/**
 *
 * @author usuari
 */
public class CarregaImatges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PantallaImatges finestra = new PantallaImatges();
            finestra.setVisible(true);
        });
    }
    
}
