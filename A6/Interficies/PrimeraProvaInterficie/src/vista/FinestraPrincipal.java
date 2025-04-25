/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame {



    public FinestraPrincipal(String title){
        initComponents(title);
    }

    private void initComponents(String title) {
        this.setTitle(title);
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        afegirComponents();
        
        this.setVisible(true); //ultima linea
    }

    /** components que estaran dins la finestra*/
    private void afegirComponents() {
        
        
        //disposicioFlowLayout();
        //disposicioBorderLayout();
        //disposicioGridLayout();
        disposicioMixConversorMoneda();

    }

    private void disposicioFlowLayout() {
                //definin amb quina disposicio volem colocar-los
        //flowLayout Dispone los componentes en filas de izquierda a derecha
        this.getContentPane().setLayout(new FlowLayout());
        
        
        JLabel etiqueta = new JLabel("Posa el teu nom");
        this.getContentPane().add(etiqueta);
        JTextField input = new JTextField("Miquel Angel");
        this.getContentPane().add(input);
        JButton boto = new JButton("Apreta'm");
        this.getContentPane().add(boto, FlowLayout.CENTER);
        JButton boto2 = new JButton("Boto2");
        this.getContentPane().add(boto2);
    }

    /**
     * Divide un contenedor en cinco secciones: norte, sur, este, oeste y centro. Cada región solo puede contener un componente y es identificada por la constante correspondiente:
NORTH, SOUTH, EAST, WEST, CENTER.
     */
    private void disposicioBorderLayout() {
        this.getContentPane().setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("Posa el teu nom");
        this.getContentPane().add(etiqueta, BorderLayout.NORTH);
        JButton boto2 = new JButton("Boto2");
        this.getContentPane().add(boto2, BorderLayout.SOUTH);
        JTextField input = new JTextField("...");
        this.getContentPane().add(input, BorderLayout.CENTER);
        JRadioButton radio = new JRadioButton("Opcio1");
        this.getContentPane().add(radio, BorderLayout.EAST);
        JCheckBox check = new JCheckBox("Opcio1");
        this.getContentPane().add(check, BorderLayout.WEST);
        //BorderLayout.North, 
        
        
    }

    private void disposicioGridLayout() {
            this.getContentPane().setLayout(new GridLayout(3,2));
       
        JRadioButton radio1 = new JRadioButton("Dolares");
        this.getContentPane().add(radio1);
        JButton boto1 = new JButton("Calcular");
        this.getContentPane().add(boto1);
        JRadioButton radio2 = new JRadioButton("Euros");
        this.getContentPane().add(radio2);
        JButton boto2 = new JButton("Reset");
        this.getContentPane().add(boto2);
        JTextField input = new JTextField();
        this.getContentPane().add(input);              
        JButton boto3 = new JButton("Enviar");
        this.getContentPane().add(boto3);
        
    }

    private void disposicioMixConversorMoneda() {
        this.getContentPane().setLayout(new BorderLayout());
        
        
        JTextField textoEntrada = new JTextField("pon numero");
        this.getContentPane().add(textoEntrada, BorderLayout.CENTER);
        
        JButton conversor = new JButton("Calcular");
        this.getContentPane().add(conversor, BorderLayout.SOUTH);
        
        
        
        PanelRadioButtons opciones_conversion = new PanelRadioButtons();
                
        this.getContentPane().add(opciones_conversion, BorderLayout.NORTH);
        PanelRadioButtons opciones_conversion2 = new PanelRadioButtons();
        this.getContentPane().add(opciones_conversion2, BorderLayout.EAST);
                
    }
    
    
}
