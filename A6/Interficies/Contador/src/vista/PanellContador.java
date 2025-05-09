package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import model.ContadorModel;

public class PanellContador extends JPanel {
    private int contador = 0;
    private final ContadorModel model = new ContadorModel();

    public PanellContador() {
        setLayout(new FlowLayout());

        JLabel labelContador = new JLabel("Comptador: " + model.getContador());
        JButton boto = new JButton("Incrementa");

        //fico aquí la acció perque en tota la pantalla no hi ha mes events
        boto.addActionListener((ActionEvent e) -> {
            contador = model.incrementa();
            labelContador.setText("Comptador: " + contador);
        });

        add(labelContador);
        add(boto);
    }
}