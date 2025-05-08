/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author usuari
 */
class PanellImatgeAmbX extends JPanel {
    private Image imatge;
    private boolean mostrarX = false;

    public void setImatge(Image imatge) {
        this.imatge = imatge;
        repaint();
    }

    public void activarX(boolean valor) {
        this.mostrarX = valor;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imatge != null) {
            g.drawImage(imatge, 0, 0, getWidth(), getHeight(), this);
        }

        if (mostrarX) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(255, 0, 0, 180)); // Vermell amb transparencia
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(0, 0, getWidth(), getHeight());
            g2.drawLine(getWidth(), 0, 0, getHeight());
        }
    }
}

