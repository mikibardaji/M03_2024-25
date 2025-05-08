/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author usuari
 */
public class LlistaNoms extends JPanel {


    public LlistaNoms() {
        initComponents(); 
    }

    private void initComponents() {
        
//        setLayout(new GridLayout(0, 2, 10, 10)); // 2 columnes, separació de 10px
//
        List<String> noms = Arrays.asList("Aina", "Nil", "Lluc", "Ona", "Jan", "Leo", "Mar");
//
//        for (String nom : noms) {
//            JLabel etiquetaNom = new JLabel(nom, JLabel.CENTER);
//            etiquetaNom.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//            add(etiquetaNom);
//        }

// Cal convertir-ho en un array bidimensional per JTable
    int columnes = 1;
    int files = (int) Math.ceil((double) noms.size() / columnes);
    String[][] dades = new String[files][columnes];

    for (int i = 0; i < noms.size(); i++) {
        int fila = i / columnes;
        int columna = i % columnes;
        dades[fila][columna] = noms.get(i);
    }

    // Capçaleres (pots deixar-les buides si no vols noms de columna)
    String[] capcaleres = {"Pokemon"};

    JTable taula = new JTable(dades, capcaleres);
    taula.setEnabled(false); // No editable
    taula.setRowHeight(40);
    taula.setFont(new Font("SansSerif", Font.PLAIN, 18));
    taula.setGridColor(Color.GRAY);
    taula.setShowGrid(true);

    JScrollPane scroll = new JScrollPane(taula);

    setLayout(new BorderLayout());
    add(scroll, BorderLayout.CENTER);
    }
    




}
