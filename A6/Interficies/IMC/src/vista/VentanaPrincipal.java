/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

     JTextField inpPes;
     JTextField inpAlt;
     JTextField inpIMC; 
     
     private ActionListener listener;
     
    public VentanaPrincipal() {
        //si la classe no implements ActionListner
        //et permet tenir listener per cada component
//        listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                procesarAccion(e);
//            }
//
//        };
        listener = this;
        initComponents();
        crearMenu();
        this.setVisible(true); //ultima linea
    }
    
    
    private void initComponents() {
        this.setTitle("Calculadora IMC");
        this.setSize(300, 125);
        //falta centrar-ho al mig de la pantalla
        this.setLocationRelativeTo(null); //centrar a la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        carregarPanel();
      
    }

    private void carregarPanel() {
        this.setContentPane(new InitApp());
    }

    private void crearMenu() {
        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Principal");
        JMenuItem ventana = new JMenuItem("Ventana Calculo");
        ventana.setActionCommand("ventanaprincipal");
        ventana.addActionListener(listener);
        menu.add(ventana);
        JMenuItem exit = new JMenuItem("Exit...");
        menu.add(exit);
        JMenu menu2 = new JMenu("Calculos");
        JMenuItem calc = new JMenuItem("Calcular");
        menu2.add(calc);
        barra.add(menu);
        barra.add(menu2);
        this.setJMenuBar(barra);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        switch(accion)
        {
            case "ventanaprincipal":
                cambiarPanelPrincipal();
                break;
        }
        
    }
    
    
    public void procesarAccion(ActionEvent e)
    {
        
    }

    private void cambiarPanelPrincipal() {
         this.setContentPane(new PanelPrincipal());
         this.validate();
    
    }
}
