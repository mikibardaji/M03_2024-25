/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.DAOImatges;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuari
 */
public class PanelPrincipal extends JPanel implements ActionListener{
    private JLabel etiquetaImatge;
    DAOImatges model;
    ActionListener listener;
    int pintarCoses;
    
    public PanelPrincipal() {
        model = new DAOImatges();
        listener = this;
        pintarCoses = 0;
        initComponents();
        
    }

    private void initComponents() {
        
        setLayout(new BorderLayout());
/*
        // Zona on es mostra la imatge
        etiquetaImatge = new JLabel();
        etiquetaImatge.setHorizontalAlignment(JLabel.CENTER);
        carregarImatge(model.getImatgeActual());
        add(etiquetaImatge, BorderLayout.CENTER);

        // Botó per canviar la imatge
        JButton botoCanviar = new JButton("Canviar imatge");
      /*  botoCanviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Canviem la imatge a la següent (cíclicament)
                carregarImatge(model.carregarNovaImatge());
            }
        });
        botoCanviar.addActionListener(listener);

        add(botoCanviar, BorderLayout.SOUTH);*/
        carregarNovaImatge(model.getImatgeActual(),pintarCoses);

        // Botó per canviar la imatge
        JButton botoCanviar = new JButton("Canviar imatge");
        botoCanviar.addActionListener(listener);

        add(botoCanviar, BorderLayout.SOUTH);
    };
    
    
    private void carregarImatge(String ruta, int pintar) {
//        ImageIcon icona = new ImageIcon(ruta);
//        // Redimensionem la imatge perquè s’adapti a l’espai
//        Image imatge = icona.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
//        etiquetaImatge.setIcon(new ImageIcon(imatge));
            carregarNovaImatge(ruta, pintar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //no hem fa falta preguntar per actionComand perque 
        //per ara sol hi ha un component que te listener
                        // Canviem la imatge a la següent (cíclicament)
                carregarImatge(model.carregarNovaImatge(),pintarCoses);
                if (pintarCoses==2)
                {
                    pintarCoses = 1;
                }
                else
                {
                    pintarCoses=2;
                }
                validate();
    }

    private void carregarNovaImatge(String img, int par) {
        PanellImatgeAmbX panellImatge = new PanellImatgeAmbX();
        panellImatge.setPreferredSize(new Dimension(400, 400));
        
        Runnable carregarImatge = () -> {
        ImageIcon icona = new ImageIcon(img);
        Image imatge = icona.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        panellImatge.setImatge(imatge);
        panellImatge.activarX(par); // Aquí activem la X
        };
        carregarImatge.run(); // Inicialitza amb la primera imatge
        add(panellImatge, BorderLayout.CENTER);
    }
    
    
    
}
