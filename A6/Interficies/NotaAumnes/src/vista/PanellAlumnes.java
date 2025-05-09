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
    private DecimalFormat formatNota = new DecimalFormat("0.00");
    ActionListener listener;
    public PanellAlumnes(GestorAlumnesDAO modelo) {
        model = modelo;
        listener = this;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        campNom = new JTextField(20);
        campNom.setEditable(false);
        campDni = new JTextField(20);
        campDni.setEditable(false);
        campNota = new JTextField(20);

        btnSeguent = new JButton("Següent");
        btnAnterior = new JButton("Anterior");
        btnGuardar = new JButton("Guardar nota");

        btnSeguent.setActionCommand("next");
        btnSeguent.addActionListener(listener);
        btnAnterior.addActionListener(listener);
        btnAnterior.setActionCommand("prev");
        btnGuardar.addActionListener(listener);
        btnGuardar.setActionCommand("save");

       
        JPanel GridComponents = new JPanel(new GridLayout(4, 2));
        GridComponents.add(new JLabel("Nom:"));
        GridComponents.add(campNom);
        GridComponents.add(new JLabel("DNI:"));
        GridComponents.add(campDni);
        GridComponents.add(new JLabel("Nota:"));
        GridComponents.add(campNota);
        GridComponents.add(btnAnterior);
        GridComponents.add(btnSeguent);

        add(GridComponents, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);

        carregarDadesAlumne();
    }

    private void carregarDadesAlumne() {
        Persona alumne = model.getActual();
        campNom.setText(alumne.getNom());
        campDni.setText(alumne.getDni());
        campNota.setText(formatNota.format(alumne.getNota()));
        btnAnterior.setEnabled(model.hiHaAnterior());
        btnSeguent.setEnabled(model.hiHaSeguent());
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
            if (novaNota < 0 || novaNota > 10) {
                throw new NumberFormatException();
            }
            model.guardarNotaActual(novaNota);
            JOptionPane.showMessageDialog(this, "Nota guardada correctament.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introdueix una nota vàlida entre 0 i 10.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
