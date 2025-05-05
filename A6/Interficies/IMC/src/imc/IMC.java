/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import javax.swing.SwingUtilities;
import vista.VentanaPrincipal;

/**
 *
 * @author mabardaji
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               VentanaPrincipal window = new VentanaPrincipal();
            }
        });
    }
    
}
