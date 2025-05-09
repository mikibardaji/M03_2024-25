/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaumnes;

import javax.swing.SwingUtilities;
import model.GestorAlumnesDAO;
import vista.PantallaAlumnes;

/**
 *
 * @author usuari
 */
public class NotaAumnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorAlumnesDAO model = new GestorAlumnesDAO();
        SwingUtilities.invokeLater(() -> {
            PantallaAlumnes finestra = new PantallaAlumnes(model);
            finestra.setVisible(true);
        });
      //  new PantallaAlumnes(model);
    }
    
}
