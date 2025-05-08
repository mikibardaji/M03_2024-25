/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.AlphaComposite;
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
    private int  mostrar = 0;

    public void setImatge(Image imatge) {
        this.imatge = imatge;
        repaint();
    }

    public void activarX(int valor) {
        this.mostrar = valor;
        repaint(); //llama al metodo heredado paintComponent();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imatge != null) {
            g.drawImage(imatge, 0, 0, getWidth(), getHeight(), this);
        }

        if (mostrar==1) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(255, 0, 0, 180)); // Vermell amb transparencia
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(0, 0, getWidth(), getHeight());
            g2.drawLine(getWidth(), 0, 0, getHeight());
        }
        else if (mostrar==2){
            /*
            Graphics2D g2d = (Graphics2D) g;
            for (int i = 0; i < 3; i++) {
                float alpha = 0.2f * (3 - i);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                g2d.drawImage(imatge, i * 5, i * 5, this);
            }
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));*/
            /*Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
            g2d.drawImage(imatge, 10, 0, this); // L’ombra lleugerament desplaçada
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));*/
            Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(0, 0, 255, 100)); // Blau translúcid

                for (int j = 0; j < 6; j++) {
                    for (int i = 0; i < 20; i++) {
                        int offset = i * 10;
                        g2d.drawLine(50 + offset, 100+(j*40), 70 + offset, 120+(j*40));
                    }
            }
                // Dibuixa línies de moviment
                
        }
    }
}

