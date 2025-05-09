package vista;

import model.IGestorAlumnesDAO;

import javax.swing.*;
import model.GestorAlumnesDAO;
import vista.PanellAlumnes;

public class PantallaAlumnes extends JFrame {


    public PantallaAlumnes(GestorAlumnesDAO model) {
        setTitle("Gestió d'Alumnes");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        carregaPanell(model);

        setVisible(true);
    }

    private void carregaPanell(GestorAlumnesDAO model) {
        this.setContentPane(new PanellAlumnes(model));
    }


}
