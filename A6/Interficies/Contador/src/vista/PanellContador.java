package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import model.ContadorModel;

public class PanellContador extends JPanel {

    private final ContadorModel model ;

    public PanellContador() {
        model = new ContadorModel();
        setLayout(new FlowLayout());

        JLabel labelContador = new JLabel("Comptador: " + model.getContador());
        JButton boto = new JButton("Incrementa");

        //fico aquí la acció perque en tota la pantalla no hi ha mes events
        boto.addActionListener((ActionEvent e) -> {
            labelContador.setText("Comptador: " + model.incrementa());
        });

        add(labelContador);
        add(boto);
    }
}