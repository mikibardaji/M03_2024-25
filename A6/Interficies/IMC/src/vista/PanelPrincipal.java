/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.calculoIMC;

/**
 *
 * @author mabardaji
 */
public class PanelPrincipal extends JPanel implements ActionListener{

    private calculoIMC model;
    
    JTextField inpPes;
    JTextField inpAlt;
    JTextField inpIMC; 
    JButton calc;
    
    private ActionListener listener;
     
    public PanelPrincipal() {
        listener = this;
        model = new calculoIMC(); //inicialitzo model
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new FlowLayout());
        //aqui aniran les dades d'entrada (JLable i JtextField)
        JPanel datos = new JPanel(new GridLayout(3, 2));
        
        JLabel lblPes = new JLabel("Peso en kg:", SwingConstants.CENTER);
        JLabel lblAlt = new JLabel("Alto en cm:", SwingConstants.CENTER);
        JLabel lblIMC = new JLabel("      IMC!:", SwingConstants.CENTER);
        //aquest els faig variables globals
        //perque necessitare referenciar-los al listener
        inpPes = new JTextField();
        inpAlt = new JTextField();
        inpIMC = new JTextField();
        inpIMC.setEditable(false);
        datos.add(lblPes);
        datos.add(inpPes);
        datos.add(lblAlt);
        datos.add(inpAlt);
        datos.add(lblIMC);
        datos.add(inpIMC);
        
       // this.getContentPane().add(datos, BorderLayout.WEST);
        this.add(datos);
        calc = new JButton("Calcular IMC");
        calc.setActionCommand("calc");
        calc.addActionListener(listener);
        //this.getContentPane().add(calc, BorderLayout.EAST);
        this.add(calc);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hola");
        switch (e.getActionCommand())
        {
            case "calc":
                calcularIMC();
                break;
            default:
                break;
        }
    }

    private void calcularIMC() {
        double altura = Double.parseDouble(inpAlt.getText());
        double peso = Double.parseDouble(inpPes.getText());
        double imc_calcu = model.IMCCalc(altura, peso);
        
        inpIMC.setText(String.valueOf(imc_calcu));
        
    }
    
}
