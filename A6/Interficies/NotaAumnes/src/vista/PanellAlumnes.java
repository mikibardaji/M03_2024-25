/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.GestorAlumnesDAO;
import model.Persona;

/**
 *
 * @author usuari
 */
public class PanellAlumnes extends JPanel implements ActionListener{
    private JTextField campNom, campDni, campNota;
    private JButton btnSeguent, btnAnterior, btnGuardar;
    private GestorAlumnesDAO model;
    private DecimalFormat formatNota;
    ActionListener listener;
    public PanellAlumnes(GestorAlumnesDAO modelo) {
        formatNota = new DecimalFormat("0.00"); //li passare el decimal i tindra 2
        model = modelo;
        listener = this;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout()); //marco el Jpanel quina disposicio tindrà.
        //Persona alumne2 = model.getActual();
        campNom = new JTextField(20);
        campNom.setEditable(false);
        campDni = new JTextField(20);
        campDni.setEditable(false);
        campNota = new JTextField(20);

        btnSeguent = new JButton("Següent");
        btnAnterior = new JButton("Anterior");
        btnGuardar = new JButton("Guardar nota");
        //afegeixo actionCommand i el listener important
        //per saber quin botó he apretat.
        btnSeguent.setActionCommand("next");
        btnSeguent.addActionListener(listener);
        
        btnAnterior.setActionCommand("prev");
        btnAnterior.addActionListener(listener);
        
        btnGuardar.addActionListener(listener);
        btnGuardar.setActionCommand("save");

        JPanel GridComponents = new JPanel(new GridLayout(4, 2)); //un subpanel amb tots els components excepte el boto guardar nota
        GridComponents.add(new JLabel("Nom:"));
        GridComponents.add(campNom);
        GridComponents.add(new JLabel("DNI:"));
        GridComponents.add(campDni);
        GridComponents.add(new JLabel("Nota:"));
        GridComponents.add(campNota);
        GridComponents.add(btnAnterior);
        GridComponents.add(btnSeguent);
        //AQUEST SUB-PANELL TINDRÀ AQUESTA DISPOSICIÓ
//        -------------------------------
//        | Jlabel  | JTextField(false) |
//        | Jlabel  | JTextField(false) |
//        | Jlabel  | JTextField(True)  |                
//        | JButton | JButton           |
//        -------------------------------
        add(GridComponents, BorderLayout.CENTER);
        //El Jbutton no li fa falta panell, ocupa tot l'ample
        add(btnGuardar, BorderLayout.SOUTH); //el boto guardar va sol i ocuparà tota la finestea

       // carregarDadesAlumne(); //vaig al model i carrego les dades actuals
    }

    /**
     * Recupero la persona actual i carrego amb pantalla
     */
    private void carregarDadesAlumne() {
        Persona alumne = model.getActual();
        campNom.setText(alumne.getNom());
        campDni.setText(alumne.getDni());
        campNota.setText(formatNota.format(alumne.getNota()));
        btnAnterior.setEnabled(model.hiHaAnterior()); //activar o desactivar boton si esto al inicio
        btnSeguent.setEnabled(model.hiHaSeguent()); //activar o desactivar boton si esto al inicio
    }

    private void accioSeguent() {
        model.seguent();
        carregarDadesAlumne();
    }

    private void accioAnterior() {
        model.anterior();
        carregarDadesAlumne();
    }

    private void accioGuardar() {
        try {
            double novaNota = Double.parseDouble(campNota.getText());
            //aqui no va la validació de 0 a 10
            model.guardarNotaActual(novaNota);
            JOptionPane.showMessageDialog(this, "Nota guardada correctament.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //tots els listener dels button centralitzats aqui
        //perque els hi he fica't el mateix listener!
        switch(e.getActionCommand())
        {
            case "next":
                accioSeguent();
                break;
            case "prev":
                accioAnterior();
                break;
            case "save":
                accioGuardar();
                break;                
        }
    }
    
}
