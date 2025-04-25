/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author mabardaji
 */
public class PanelRadioButtons extends JPanel {

    public PanelRadioButtons() {
        this.setLayout(new GridLayout(2, 3));
        initComponents();
    }

    private void initComponents() {
        JRadioButton euro = new JRadioButton("Euros");
        JRadioButton dolar = new JRadioButton("Dolares");
        JRadioButton peso = new JRadioButton("Pesos");
        JRadioButton Yen = new JRadioButton("Yen");
        JRadioButton Dirham = new JRadioButton("Dirham");
        JRadioButton Rublo = new JRadioButton("Rublos");
        
        this.add(euro);
        this.add(dolar);
        this.add(peso);
        this.add(Yen);
        this.add(Dirham);
        this.add(Rublo);
        
    }
    
    
    
}
