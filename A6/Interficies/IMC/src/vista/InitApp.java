/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author mabardaji
 */
public class InitApp extends JPanel {

    public InitApp() {
        initComponents();
    }

    private void initComponents() {
            String titulo  = "CALCULADORA IMC V 1.0";
            this.setLayout(new BorderLayout());
            
            JLabel texto = new JLabel(titulo, SwingConstants.CENTER);
            //texto.setAlignmentX(CENTER_ALIGNMENT);
            this.add(texto);
    }
    
}
